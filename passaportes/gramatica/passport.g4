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

passports: LIST_START passport  LIST_END;

passport: GROUP_START process SEPARATOR person SEPARATOR destination GROUP_END;

/*******************************************************************************
** PROCESS
***************/

process: PROCESS DEFINED_BY GROUP_START year SEPARATOR processNumber SEPARATOR cityCouncil GROUP_END;

year: YEAR DEFINED_BY NUMBERS;

processNumber: PROCESS_NUMBER DEFINED_BY ALPHANUM_DEF;

cityCouncil: CITY_COUNCIL DEFINED_BY NAME_DEF;


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


name: NAME DEFINED_BY NAME_DEF ;

identCard: IDENT_CARD DEFINED_BY ALPHANUM_DEF ;

residence: RESIDENCE DEFINED_BY TEXT_DEF ;

birthDate: BIRTH_DATE DEFINED_BY DATE_DEF ;

birthLocal: BIRTH_LOCAL DEFINED_BY TEXT_DEF ;

parents: PARENTS DEFINED_BY GROUP_START (parentFather SEPARATOR)? parentMother? GROUP_END;

parentFather: PARENT_FATHER DEFINED_BY NAME_DEF;

parentMother: PARENT_MOTHER DEFINED_BY NAME_DEF;

civilState: CIVIL_STATE DEFINED_BY CIVIL_STATE_DEF ;

spouse: SPOUSE DEFINED_BY NAME_DEF ;

children: CHILDREN DEFINED_BY LIST_START (child SEPARATOR)* child LIST_END ;

child: NAME_DEF;

profession: PROFESSION DEFINED_BY TEXT_DEF ;

professionLocal: PROFESSION_LOCAL DEFINED_BY TEXT_DEF ;

qualifications: QUALIFICATIONS DEFINED_BY TEXT_DEF ;



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

countryAndCity: COUNTRY_AND_CITY DEFINED_BY SYMBOLS_DEF;

departure: DEPARTURE DEFINED_BY DATE_DEF;




/*******************************************************************************
** KEYS
***************/

// process
PROCESS : SW 'processo' EW;
YEAR : SW 'ano' EW;
PROCESS_NUMBER : SW 'numero' EW;
CITY_COUNCIL : SW 'camara' EW;

// person
PERSON : SW 'requerente' EW;
NAME: SW 'nome' EW ;
IDENT_CARD: SW ('bi'|'BI') EW ;
RESIDENCE: SW 'residencia' EW ;
BIRTH_DATE: SW 'data nasc' EW ;
BIRTH_LOCAL: SW 'local nasc' EW ;
PARENTS: SW 'pais' EW ;
CIVIL_STATE: SW 'estado civil' EW ;
SPOUSE: SW 'c' [ôo] 'njugue' EW ;
CHILDREN: SW 'filh' [oa] 's' EW ;
PROFESSION: SW 'profiss' [aã] 'o' EW ; /*também usado em destination*/
PROFESSION_LOCAL: SW 'local trabalho' EW ; /*também usado em destination*/
QUALIFICATIONS: SW 'habilita' [cç] [oõ] 'es' EW ;

PARENT_FATHER: SW 'pai' EW ;
PARENT_MOTHER: SW 'm' [ãa] 'e' EW ;
CHILD: SW 'filh'[oa] EW ;


// destination
DESTINATION : SW 'destino' EW;
COUNTRY_AND_CITY: SW 'pa'[ií]'s e cidade' EW;
DEPARTURE: SW 'data partida' EW;

/*******************************************************************************
** SEPARATORS
***************/
DEFINED_BY : ':';
GROUP_START: '{';
GROUP_END  : '}';
LIST_START : '[';
LIST_END   : ']';
SW         : '"'; /* start word */
EW         : '"'; /* end word */
SEPARATOR  : ',';

/*******************************************************************************
** CLASSES
***************/
SPECIALCHAR : [À-ÖØ-öø-ÿ]+;
SYMBOLS : [\-\.,ºª]+;
LETTERS : [a-zA-Z]+;
NUMBERS : [0-9]+;

/*******************************************************************************
** VALUES
***************/

CIVIL_STATE_DEF: SW ('solteiro'|'casado'|'divorciado'|'vi'[uú]'vo') EW;

DATE_DEF: SW [0-9][0-9][0-9][0-9] '-' [0-9]?[0-9] '-' [0-9]?[0-9] EW; /* dates in ISO 8601 format */
    
NAME_DEF : SW ( LETTERS |' ')+ EW;

ALPHANUM_DEF: SW (LETTERS | NUMBERS)+ EW;

TEXT_DEF : SW (NUMBERS|SPECIALCHAR|SYMBOLS|LETTERS|' ')+ EW;


/*******************************************************************************
** EXTRAS & WS
***************/
WS    : ( ' ' | '\t' | '\f' | ( '\r'? '\n' ) )+ -> skip;
SL_COMMENT : '//' .*? ( ( '\r' '\n'? ) | '\n' ) -> skip;
ML_COMMENT : '/*' .*? '*/' -> skip;
