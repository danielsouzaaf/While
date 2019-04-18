grammar Enquanto;

programa : seqComando;     // sequência de comandos

decl: declFuncao ;


instr: decl
       | comando; //subir uma camada para poder trabalhar com declaração de funções.

seqInstr: instr (';' instr)*
    ;

argsList: (ID (',' ID)*)?;
paramsList: (expressao (',' expressao)*)?
    ;

execFuncao: ID '(' paramsList ')';

declFuncao: ID '(' argsList ')' '=' expressao;

seqComando: comando (';' comando)* ;

comando: ID ':=' expressao                          # atribuicao
       | ID '=' expressao                           # atribuicao
       | 'skip'                                     # skip
       | 'se' bool 'entao' comando ('senaose' bool 'entao' comando)*? ('senao' comando)?  # se
       | 'enquanto' bool 'faca' comando             # enquanto
       | 'exiba' Texto                              # exiba
       | 'escreva' expressao                        # escreva
       | 'para' ID 'de' expressao 'ate' expressao 'passo' INT 'faca' comando # laco
       | 'escolha' ID ('caso' expressao ':' seqComando)* 'outro' ':' seqComando # escolha
       | '{' seqComando '}'                         # bloco
       | execFuncao                                 # funcao
       ;

expressao: INT                                      # inteiro
         | 'leia'                                   # leia
         | ID                                       # id
         | expressao '*' expressao                  # opBin
         | expressao '+' expressao                  # opBin
         | expressao '-' expressao                  # opBin
         | expressao '/' expressao                  # opBin
         | expressao '^' expressao                  # opBin
         | '(' expressao ')'                        # expPar
         | execFuncao                               # exprFuncao
         ;

bool: ('verdadeiro'|'falso')                        # booleano
    | expressao '=' expressao                       # opRel
    | expressao '<' expressao                      # opRel
    | expressao '>' expressao                      # opRel
    | expressao '<=' expressao                      # opRel
    | expressao '>=' expressao                      # opRel
    | expressao '<>' expressao                      # opRel
    | 'nao' bool                                    # naoLogico
    | bool 'e' bool                                 # eLogico
    | bool 'ou' bool                                # ouLogico
    | bool 'xor' bool                               # xorLogico
    | '(' bool ')'                                  # boolPar
    ;

INT: ('0'..'9')+ ;
ID: ('a'..'z')+;
Texto: '"' .*? '"';

Espaco: [ \t\n\r] -> skip;
