#language: pt

Funcionalidade: Aritmética Básica

Contexto:
Dado que eu acabei de ligar minha calculadora

Cenário: Adição
Quando eu adiciono 4 e 5
Então o resultado é 9

Esquema do Cenário: Divisão
Quando eu divido <quociente> por <divisor> 
Então o resultado é <resultado>
Exemplos:
| quociente | divisor | resultado                |
|     8     |   4     | "2"                      |
|     6     |   4     | "1,5"                    |
|     3     |   2     | "1,5"                    |      
|     8     |   0     | "Erro: divisão por zero" |