#language: pt

Funcionalidade: Aritmética Básica
Cenário: Adição
Dado que eu acabei de ligar minha calculadora
Quando eu adiciono 4 e 5
Então o resultado é 9

Cenário: Divisão
Dado que eu acabei de ligar minha calculadora
Quando eu divido 8 por 4
Então o resultado é 2

Cenário: Divisão por zero
Dado que eu acabei de ligar minha calculadora
Quando eu divido 8 por 0
Então o resultado é "Erro: divisão por zero"
