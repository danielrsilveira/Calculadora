#language: pt

Funcionalidade: Teste base informativo de teses da PGR

@TesteInformativoDeTesesPGR
Cenário: Pesquisa termo
Dado que estou na página Informativo de Teses da PGR
Quando pesquiso pelo termo "Inconstitucional"
E envio a pesquisa
Então vejo uma lista de resultados não vazia