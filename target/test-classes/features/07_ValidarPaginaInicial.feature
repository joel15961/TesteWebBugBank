#language: pt

@ValidarPagInicial
Funcionalidade: validacao

Cenario: validando pagina inicial
Dado que o usuario esteja na pagina Principal da Pagina 
Entao valido a pagina inicial
E se existe o botao de transferencia
E Verifico se existe o campo de Pagemento
E se possui o botao de Extrato
E verifico se possui botao de Saque
E clico no botao de Sair
Entao analiso se saiu da Pagina Principal