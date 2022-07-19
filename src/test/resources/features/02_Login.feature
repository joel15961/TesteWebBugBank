#language: pt

@Login
Funcionalidade: Login

@LoginSucesso
Cenario: Login com sucesso
	Dado que o usuario esteja na pagina de login
	E informo no campo email "norueguesa12@gmail.com"
	E informo no campo senha "teste123"
	E aciono botao acessar
	Entao aparece a pagina principal BugBank
	
	@LoginSucesso2
Cenario: Login com sucesso
	Dado que o usuario esteja na pagina de login
	E informo no campo email "hackaton2022@gmail.com"
	E informo no campo senha "teste321"
	E aciono botao acessar
	Entao aparece a pagina principal BugBank
	