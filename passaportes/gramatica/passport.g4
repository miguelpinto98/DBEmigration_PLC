/*
__________________________________
JSON-like DSL to define passports:
"""""""""""""""""""""""""""""""""'

[
    {
        "processo": {
            "ano" : 1234 ,
            "numero" : "AB123",
            "camara" : "asdf"
        },
        "requerente": {
            "nome" : "Alberto Miranda",
            "bi" : "123456789",
            "residencia" : "Rua da fonte, n5",
            "data nasc" : "1924-12-25",
            "local nasc" : "Santarém",
            "pais" : {
                "pai": "Joaquim Miranda",
                "mãe": "Alexandra Pereira"
            },
            "estado civil" : "casado",
            "conjugue" : "Mafalda Freitas",
            "filhos" : [
                "Afonso Miranda",
                "Tataiana Freitas",
                "Ernesto Freitas"
            ],
            "profissao" : "Jornalista",
            "local trabalho" : "Porto",
            "habilitacoes" : "12º ano"
        },
        "destino" : {
            "país e cidade" : "Paris, França",
            "data partida" : "1952-09-11",
            "profissao" : "Jornalista",
            "local trabalho" : "Paris, França"
        }
    },
    {
        ...
    }
]

*/

grammar passport;

passports: LIST_START (passport SEPARATOR)* passport LIST_END;

passport: GROUP_START process SEPARATOR person SEPARATOR destination GROUP_END;

/*******************************************************************************
** PROCESS
***************/

process: PROCESS DEFINED_BY GROUP_START year SEPARATOR processNumber SEPARATOR cityCouncil GROUP_END;

year: YEAR DEFINED_BY numbers;

processNumber: PROCESS_NUMBER DEFINED_BY process_number_def;

cityCouncil: CITY_COUNCIL DEFINED_BY city_council_def;


/*******************************************************************************
** PERSON
***************/

person: PERSON DEFINED_BY
        GROUP_START
            name SEPARATOR
            identCard SEPARATOR
            residence SEPARATOR
            birthDate SEPARATOR
            birthLocal SEPARATOR
            parents SEPARATOR
            civilState SEPARATOR
            (spouse SEPARATOR)?
            (children SEPARATOR)?
            profession SEPARATOR
            (professionLocal SEPARATOR)?
            qualifications
        GROUP_END;


name: NAME DEFINED_BY complete_name_def ;

identCard: IDENT_CARD DEFINED_BY ident_card_def ;

residence: RESIDENCE DEFINED_BY local_def ;

birthDate: BIRTH_DATE DEFINED_BY date_def ;

birthLocal: BIRTH_LOCAL DEFINED_BY local_def ;

parents: PARENTS DEFINED_BY GROUP_START (parentFather SEPARATOR)? parentMother? GROUP_END;

parentFather: PARENT_FATHER DEFINED_BY complete_name_def;

parentMother: PARENT_MOTHER DEFINED_BY complete_name_def;

civilState: CIVIL_STATE DEFINED_BY CIVIL_STATE_DEF ;

spouse: SPOUSE DEFINED_BY complete_name_def ;

children: CHILDREN DEFINED_BY LIST_START (child SEPARATOR)* child LIST_END ;

child: complete_name_def;

profession: PROFESSION DEFINED_BY profession_def ;

professionLocal: PROFESSION_LOCAL DEFINED_BY local_def ;

qualifications: QUALIFICATIONS DEFINED_BY qualifications_def ;



/*******************************************************************************
** DESTINATION
***************/

destination: DESTINATION DEFINED_BY
            GROUP_START
                countryAndCity SEPARATOR
                departure SEPARATOR
                profession SEPARATOR
                professionLocal?
            GROUP_END;

countryAndCity: COUNTRY_AND_CITY DEFINED_BY local_def;

departure: DEPARTURE DEFINED_BY date_def;




/*******************************************************************************
** KEYS
***************/

// process
PROCESS : ASP 'processo' ASP;
YEAR : ASP 'ano' ASP;
PROCESS_NUMBER : ASP 'numero' ASP;
CITY_COUNCIL : ASP 'camara' ASP;

// person
PERSON : ASP 'requerente' ASP;
NAME: ASP 'nome' ASP ;
IDENT_CARD: ASP ('bi'|'BI') ASP ;
RESIDENCE: ASP 'residencia' ASP ;
BIRTH_DATE: ASP 'data nasc' ASP ;
BIRTH_LOCAL: ASP 'local nasc' ASP ;
PARENTS: ASP 'pais' ASP ;
CIVIL_STATE: ASP 'estado civil' ASP ;
SPOUSE: ASP 'c' [ôo] 'njugue' ASP ;
CHILDREN: ASP 'filh' [oa] 's' ASP ;
PROFESSION: ASP 'profiss' [aã] 'o' ASP ; /*também usado em destination*/
PROFESSION_LOCAL: ASP 'local trabalho' ASP ; /*também usado em destination*/
QUALIFICATIONS: ASP 'habilita' [cç] [oõ] 'es' ASP ;

PARENT_FATHER: ASP 'pai' ASP ;
PARENT_MOTHER: ASP 'm' [ãa] 'e' ASP ;
CHILD: ASP 'filh'[oa] ASP ;


// destination
DESTINATION : ASP 'destino' ASP;
COUNTRY_AND_CITY: ASP 'pa'[ií]'s e cidade' ASP;
DEPARTURE: ASP 'data partida' ASP;

/*******************************************************************************
** SEPARATORS
***************/
DEFINED_BY : ':';
GROUP_START: '{';
GROUP_END  : '}';
LIST_START : '[';
LIST_END   : ']';
ASP        : '"';
SEPARATOR  : ',';
HYPHEN     : '-';

/*******************************************************************************
** VALUES
***************/
ident_card_def : ASP (LETTERS | numbers)+ ASP;
process_number_def: ASP (LETTERS | numbers)+ ASP;
city_council_def  : ASP (SPECIALCHAR | LETTERS | SPACE)+ ASP;
complete_name_def : ASP (SPECIALCHAR | LETTERS | SPACE)+ ASP;

profession_def: ASP (SPECIALCHAR | LETTERS | SYMBOLS | SPACE | SEPARATOR | numbers)+ ASP;

qualifications_def: ASP (SPECIALCHAR | LETTERS | SYMBOLS | SPACE | SEPARATOR | numbers)+ ASP;

local_def: ASP (SPECIALCHAR | LETTERS | SYMBOLS | SPACE | SEPARATOR | numbers)+ ASP;

/* dates in ISO 8601 format */
date_def returns [int out_year, int out_month, int out_day]
        : ASP a=NUM b=NUM c=NUM d=NUM HYPHEN e=NUM? f=NUM HYPHEN g=NUM? h=NUM ASP{
           $date_def.out_year  = Integer.parseInt($a.text+$b.text+$c.text+$d.text);
           $date_def.out_month = Integer.parseInt($e.text+$f.text);
           $date_def.out_day   = Integer.parseInt($g.text+$h.text);
        };

numbers returns [int out_int]
@init{ $numbers.out_int = 0; }    
: (NUM { $numbers.out_int = $numbers.out_int*10 + Integer.parseInt($NUM.text); })+;

CIVIL_STATE_DEF: ASP ('solteiro'|'casado'|'divorciado'|'vi'[uú]'vo') ASP;

/*******************************************************************************
** CLASSES
***************/
SPECIALCHAR : [À-ÖØ-öø-ÿ]+;
SYMBOLS: [\-\.\º\ª];
LETTERS: [a-zA-Z]+;
NUM    : [0-9];

/*******************************************************************************
** EXTRAS & WS
***************/
WS    : ( ' ' | '\t' | '\f' | ( '\r'? '\n' ) )+ -> channel(HIDDEN);
SL_COMMENT : '//' .*? ( ( '\r' '\n'? ) | '\n' ) -> skip;
ML_COMMENT : '/*' .*? '*/' -> skip;
SPACE : ' ';
