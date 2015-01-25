/*
__________________________________
JSON-like DSL to define passports:
"""""""""""""""""""""""""""""""""'

[
  {
    "processo": {
      "ano" : 1234 ,
      "numero" : "733/66-266B5",
      "passaporte" : "zAB1a3",
      "camara" : "as df",
      "submetido" : "1946-6-10"
    },
    "requerente": {
      "nome" : "Alberto Miranda",
      "bi" : "123456789",
      "residencia" : "Rua da fonte, n5",
      "data nasc" : "1924-12-25",
      "local nasc" : "Santarém",
      "genero" : "masculino",
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
  }
]

*/

grammar Passport;

passports [PassportSemantic s] returns [PassportSemantic outS]
        : LIST_START (passport[s] SEPARATOR)* passport[s] LIST_END {$outS = s;};

passport [PassportSemantic s]
@init{ s.passportStart(); }
        :   GROUP_START
                process[s] SEPARATOR
                person[s] SEPARATOR
                destination[s]
            GROUP_END
            {
                s.passportEnd();
                Debug.set($GROUP_START.line, $GROUP_START.pos);
            }
        ;

/*******************************************************************************
** PROCESS
***************/

process [PassportSemantic s]
        : PROCESS DEFINED_BY
            GROUP_START
                year[s] SEPARATOR
                processNumber[s] SEPARATOR
                cityCouncil[s]
            GROUP_END
        ;

year [PassportSemantic s]
        : YEAR DEFINED_BY numbers
            {
                s.year($numbers.out_int);
                Debug.set($YEAR.line, $YEAR.pos);
            }
        ;

processNumber [PassportSemantic s]
        : PROCESS_NUMBER DEFINED_BY process_number_def
            {
                s.processNumber($process_number_def.text);
                Debug.set($PROCESS_NUMBER.line, $PROCESS_NUMBER.pos);
            }
        ;

cityCouncil [PassportSemantic s]
        : CITY_COUNCIL DEFINED_BY city_council_def
            {
                s.cityCouncil($city_council_def.text);
                Debug.set($CITY_COUNCIL.line, $CITY_COUNCIL.pos);
            }
        ;


/*******************************************************************************
** PERSON
***************/

person [PassportSemantic s]
        : PERSON DEFINED_BY
            GROUP_START
                name[s] SEPARATOR
                identCard[s] SEPARATOR
                residence[s] SEPARATOR
                birthDate[s] SEPARATOR
                birthLocal[s] SEPARATOR
                gender[s] SEPARATOR
                parents[s] SEPARATOR
                civilState[s] SEPARATOR
                (spouse[s] SEPARATOR)?
                (children[s] SEPARATOR)?
                profession[s] SEPARATOR
                (professionLocal[s] SEPARATOR)?
                qualifications[s]
            GROUP_END
        ;


name [PassportSemantic s]
        : NAME DEFINED_BY complete_name_def
            {
                s.name($complete_name_def.text);
                Debug.set($NAME.line, $NAME.pos);
            }
        ;

identCard [PassportSemantic s]
        : IDENT_CARD DEFINED_BY ident_card_def
            {
                s.identCard($ident_card_def.text);
                Debug.set($IDENT_CARD.line, $IDENT_CARD.pos);
            }
        ;

residence [PassportSemantic s]
        : RESIDENCE DEFINED_BY local_def
            {
                s.residence($local_def.text);
                Debug.set($RESIDENCE.line, $RESIDENCE.pos);
            }
        ;

birthDate [PassportSemantic s]
        : BIRTH_DATE DEFINED_BY date_def
            {
                s.birthDate($date_def.out_year, $date_def.out_month, $date_def.out_day);
                Debug.set($BIRTH_DATE.line, $BIRTH_DATE.pos);
            }
        ;

birthLocal [PassportSemantic s]
        : BIRTH_LOCAL DEFINED_BY local_def
            {
                s.birthLocal($local_def.text);
                Debug.set($BIRTH_LOCAL.line, $BIRTH_LOCAL.pos);
            }
        ;

gender [PassportSemantic s]
        : GENDER DEFINED_BY GENDER_DEF
            {
                s.gender($GENDER_DEF.text);
                Debug.set($GENDER.line, $GENDER.pos);
            }
        ;

parents [PassportSemantic s]
        : PARENTS DEFINED_BY
            GROUP_START
                (parentFather[s] SEPARATOR)?
                parentMother[s]?
            GROUP_END
        ;

parentFather [PassportSemantic s]
        : PARENT_FATHER DEFINED_BY complete_name_def
            {
                s.parentFather($complete_name_def.text);
                Debug.set($PARENT_FATHER.line, $PARENT_FATHER.pos);
            }
        ;

parentMother [PassportSemantic s]
        : PARENT_MOTHER DEFINED_BY complete_name_def
            {
                s.parentMother($complete_name_def.text);
                Debug.set($PARENT_MOTHER.line, $PARENT_MOTHER.pos);
            }
        ;

civilState [PassportSemantic s]
        : CIVIL_STATE DEFINED_BY CIVIL_STATE_DEF
            {
                s.civilState($CIVIL_STATE_DEF.text);
                Debug.set($CIVIL_STATE.line, $CIVIL_STATE.pos);
            }
        ;

spouse [PassportSemantic s]
        : SPOUSE DEFINED_BY complete_name_def
            {
                s.spouse($complete_name_def.text);
                Debug.set($SPOUSE.line, $SPOUSE.pos);
            }
        ;

children [PassportSemantic s]
        : CHILDREN DEFINED_BY
            {Debug.set($CHILDREN.line, $CHILDREN.pos);}
            LIST_START
                (child[s] SEPARATOR)*
                child[s]
            LIST_END
        ;

child [PassportSemantic s]
        : complete_name_def
            {s.child($complete_name_def.text);}
        ;

profession [PassportSemantic s]
        : PROFESSION DEFINED_BY profession_def
            {
                s.profession($profession_def.text);
                Debug.set($PROFESSION.line, $PROFESSION.pos);
            }
        ;

professionLocal [PassportSemantic s]
        : PROFESSION_LOCAL DEFINED_BY local_def
            {
                s.professionLocal($local_def.text);
                Debug.set($PROFESSION_LOCAL.line, $PROFESSION_LOCAL.pos);
            }
        ;

qualifications [PassportSemantic s]
        : QUALIFICATIONS DEFINED_BY qualifications_def
            {
                s.qualifications($qualifications_def.text);
                Debug.set($QUALIFICATIONS.line, $QUALIFICATIONS.pos);
            }
        ;



/*******************************************************************************
** DESTINATION
***************/

destination [PassportSemantic s]
        : DESTINATION DEFINED_BY
            GROUP_START
                countryAndCity[s] SEPARATOR
                departure[s] SEPARATOR
                dest_profession[s] (SEPARATOR
                dest_professionLocal[s])?
            GROUP_END
        ;

countryAndCity [PassportSemantic s]
        : COUNTRY_AND_CITY DEFINED_BY local_def
            {
                s.countryAndCity($local_def.text);
                Debug.set($COUNTRY_AND_CITY.line, $COUNTRY_AND_CITY.pos);
            }
        ;

departure [PassportSemantic s]
        : DEPARTURE DEFINED_BY date_def
            {
                s.departure($date_def.out_year, $date_def.out_month, $date_def.out_day);
                Debug.set($DEPARTURE.line, $DEPARTURE.pos);
            }
        ;

dest_profession [PassportSemantic s]
        : PROFESSION DEFINED_BY profession_def
            {
                s.dest_profession($profession_def.text);
                Debug.set($PROFESSION.line, $PROFESSION.pos);
            }
        ;

dest_professionLocal [PassportSemantic s]
        : PROFESSION_LOCAL DEFINED_BY local_def
            {
                s.dest_professionLocal($local_def.text);
                Debug.set($PROFESSION_LOCAL.line, $PROFESSION_LOCAL.pos);
            }
        ;




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
GENDER: ASP 'g' [ée] 'nero' ASP;
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
ident_card_def : ASP (ESCAPECHARS | LETTERS | numbers)+ ASP;
process_number_def: ASP (ESCAPECHARS | LETTERS | numbers)+ ASP;
city_council_def  : ASP (ESCAPECHARS | ACCENTCHAR | LETTERS | SPACE)+ ASP;
complete_name_def : ASP (ESCAPECHARS | ACCENTCHAR | LETTERS | SPACE)+ ASP;

profession_def: ASP (ESCAPECHARS | ACCENTCHAR | LETTERS | SYMBOLS | SPACE | SEPARATOR | numbers)+ ASP;

qualifications_def: ASP (ESCAPECHARS | ACCENTCHAR | LETTERS | SYMBOLS | SPACE | SEPARATOR | numbers)+ ASP;

local_def: ASP (ESCAPECHARS | ACCENTCHAR | LETTERS | SYMBOLS | SPACE | SEPARATOR | numbers)+ ASP;

/* dates in ISO 8601 format */
date_def returns [int out_year, int out_month, int out_day]
        : ASP a=NUM b=NUM c=NUM d=NUM HYPHEN e=NUM? f=NUM HYPHEN g=NUM? h=NUM ASP{
           $out_year  = Integer.parseInt($a.text+$b.text+$c.text+$d.text);
           $out_month = Integer.parseInt($e.text+$f.text);
           $out_day   = Integer.parseInt($g.text+$h.text);
        };

numbers returns [int out_int]
@init{ $out_int = 0; }
: (NUM { $out_int = $out_int*10 + Integer.parseInt($NUM.text); })+;

CIVIL_STATE_DEF: ASP ('solteiro'|'casado'|'divorciado'|'vi'[uú]'vo') ASP;
GENDER_DEF: ASP ('feminino'|'masculino') ASP;

/*******************************************************************************
** CLASSES
***************/
ESCAPECHARS :   ('\\' (["\\/bfnrt] | UNICODE))+ ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

ACCENTCHAR : [À-ÖØ-öø-ÿ]+;
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
