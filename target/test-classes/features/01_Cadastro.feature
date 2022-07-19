#language: pt

@Cadastro
Funcionalidade: Cadastro

@Usuario1
Cenario: Cadastro de usuario1
	Dado que o usuario esteja na pagina principal
	E aciono registrar usuario
	E inserir no campo email "norueguesa12@gmail.com"
	E inserir no campo nome "Joaquina"
	E inserir no campo senha "teste123"
	E inserir no campo confirmacao de senha "teste123"
	E aciono criar conta com saldo
	Entao clico em cadastrar
	E aparece a aba de cadastro com sucesso
	E clico em fechar aba
	

	
