package stepsDefinitions;

import static utils.Utils.acessarSistema;
import static utils.Utils.driver;

import org.openqa.selenium.Cookie;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObjects.CadastroPage;
import pageObjects.LoginPage;
import pageObjects.RealizarTransferenciaPage;
import pageObjects.TransferenciaPage;

public class Hooks {
	String numero_cadastro_1 = null;

	@Before(order = 1)
	public void suitUp() {
		acessarSistema();

	}

	@Before(value = "@Login")
	public void realizar_login() throws Exception {
		CadastroPage cpg = new CadastroPage();
		cpg.realizar_cadastro("norueguesa12@gmail.com", "Joaquina", "teste123");
		Cookie cookie = new Cookie.Builder("key", "value").domain("bugbank.netlify.app").build();
		driver.manage().addCookie(cookie);
	}

	@Before(value = "@PaginaDeTransferencia or @RealizarTransferencia")
	public String transferirDinheiro() throws Exception {
		// Instanciando Objetos
		CadastroPage cpg = new CadastroPage();
		LoginPage lp = new LoginPage();
		// cadastrando Primeiro Usuario
		cpg.realizar_cadastro("teste123@gmail.com", "Joao", "teste123");
		Thread.sleep(7000);
		lp.realizar_login("teste123@gmail.com", "teste123");
		// Pegando numero da conta do Primeiro Usuario
		numero_cadastro_1 = lp.numeroConta();
		Thread.sleep(10000);
		// Saindo da Conta
		lp.btnSair();
		Thread.sleep(7000);
		// cadastrando Segundo Usuario
		cpg.realizar_cadastro("jurema@gmail.com", "Jurema", "testeJurema");
		Thread.sleep(10000);
		lp.realizar_login("jurema@gmail.com", "testeJurema");

		return numero_cadastro_1;
	}

	// Faz antes de chamar o principal steps, nesse caso cadastrando Usuarios
	@Before(value = "@ValidandoExtrato")
	public void executaAntesValidandoExtrato() throws Exception {
		RealizarTransferenciaPage rtpg = new RealizarTransferenciaPage();
		transferirDinheiro();
		rtpg.realizarTransferenciaPrincipal("300", "Divida");
		concluirTransferencia();
	}

	@Before(value = "@ValidarPagInicial")
	public void executaAntesValidarPagInicial() throws Exception {
		CadastroPage cpg = new CadastroPage();
		cpg.realizar_cadastro("norueguesa12@gmail.com", "Joaquina", "teste123");
		LoginPage lp = new LoginPage();
		lp.realizar_login("norueguesa12@gmail.com", "teste123");
	}

	@Before(value = "@ValidarSaque")
	public void executaAntesValidarSaque() throws Exception {
		CadastroPage cpg = new CadastroPage();
		cpg.realizar_cadastro("norueguesa12@gmail.com", "Joaquina", "teste123");
		LoginPage lp = new LoginPage();
		lp.realizar_login("norueguesa12@gmail.com", "teste123");

	}

	@After(value = "@PaginaDeTransferencia")
	public void posCenarioTransferir() throws Exception {
		TransferenciaPage tp = new TransferenciaPage();

		if (numero_cadastro_1.length() >= 5) {
			tp.numero_conta(numero_cadastro_1.substring(0, 3));
			tp.digito_Conta(numero_cadastro_1.substring(4, 5));
		} else if (numero_cadastro_1.length() >= 4) {
			tp.numero_conta(numero_cadastro_1.substring(0, 2));
			tp.digito_Conta(numero_cadastro_1.substring(3, 4));
		}

	}

	@After(value = "@RealizarTransferencia")
	public void concluirTransferencia() throws Exception {
		TransferenciaPage tp = new TransferenciaPage();
		RealizarTransferenciaPage rtp = new RealizarTransferenciaPage();
		if (numero_cadastro_1.length() >= 5) {
			tp.numero_conta(numero_cadastro_1.substring(0, 3));
			tp.digito_Conta(numero_cadastro_1.substring(4, 5));
		} else if (numero_cadastro_1.length() >= 4) {
			tp.numero_conta(numero_cadastro_1.substring(0, 2));
			tp.digito_Conta(numero_cadastro_1.substring(3, 4));
		}
		rtp.btnTransferir();
		rtp.modalSucesso();
		rtp.btnFecharModal();
		rtp.voltar();

	}

	@After()
	public void apagarUsuario(Scenario scenario) throws Exception {
		// driver.quit();
	}
}
