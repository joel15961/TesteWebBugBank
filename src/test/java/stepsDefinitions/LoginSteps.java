package stepsDefinitions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage pagina_Login = new LoginPage();
	
	@Dado("que o usuario esteja na pagina de login")
	public void que_o_usuario_esteja_na_pagina_de_login() {
	   pagina_Login.testePrimeiraPagine();
	}
	@Dado("informo no campo email {string}")
	public void informo_no_campo_email(String string) {
		pagina_Login.inserir_Email(string);
	}

	@Dado("informo no campo senha {string}")
	public void informoNoCampoSenha(String senha)  {
	    pagina_Login.inserir_Senha(senha);
	}

	@Dado("aciono botao acessar")
	public void acionoBotaoAcessar() throws Exception {
		pagina_Login.botao_Acessar();
		Thread.sleep(1000);
	}
	@Entao("aparece a pagina principal BugBank")
	public void apareceAPaginaPrincipalBugBank() throws Exception {
		pagina_Login.bugBank_pag();
		//Thread.sleep(1000);
		//String teste = pagina_Login.numeroConta();
		
		Thread.sleep(10000);
	}
}
