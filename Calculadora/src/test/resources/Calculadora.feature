#language: pt
#encoding: iso-8859-1

Funcionalidade: Aritm�tica B�sica


Contexto:
Dado que eu acabei de ligar minha calculadora

Cen�rio: Adi��o
Quando eu adiciono 4 e 5
Ent�o o resultado � 9

Esquema do Cen�rio: Divis�o
Quando eu divido <quociente> por <divisor>
Ent�o o resultado � <resultado>
Exemplos:
| quociente | divisor | resultado                |
|    8      |    4    | "2"                      |
|    6      |    4    | "1,5"                    |
|    8      |    0    | "Erro: divis�o por zero" |
