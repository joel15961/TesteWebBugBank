package stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pageObjects.LoginPage;
import pageObjects.ValidarPagamentoPage;

public class ValidarPagamentosSteps {
	ValidarPagamentoPage vpg = new ValidarPagamentoPage();
	@Before(value = "@ValidandoPagamento")
	public void antesDeValidar() throws Exception {
		Hooks hooks = new Hooks();
		LoginPage lp = new LoginPage();
		hooks.realizar_login();
		lp.realizar_login("norueguesa12@gmail.com", "teste123");
	}
	@Dado("que esteja na aba Principal")
	public void queEstejaNaAbaPrincipal() {
		vpg.validacaoPagina();
	}

	@E("clico no botao de Pagamento")
	public void clicoNoBotaoDePagamento() {
		vpg.paginaPagamentos();
	}
	@E("verifico se a modal aparece quando clico")
	public void verificoSeAModalApareceQuandoClico() {
		vpg.modalPagamento();
	}
	@E("fecho a modal de aviso")
	public void fecharModal() {
		vpg.fecharModal();
	}
}
