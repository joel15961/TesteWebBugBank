#language: pt

@ValidandoExtrato
Funcionalidade: validacao

Cenario: validando aba de extrato
	Dado que o usuario esteja na pagina do bug bank
	E aciono a aba extrato
	Entao valido o texto de saldo disponivel
	E verifico o texto da abertura de conta
	E Observo as Transferencias enviadas
	Entao verifico as datas
