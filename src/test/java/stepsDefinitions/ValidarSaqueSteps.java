package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.ValidarSaquePage;

public class ValidarSaqueSteps {
	ValidarSaquePage vsp = new ValidarSaquePage();
	@Dado("Que o usuario esteja na pagina principal de login")
	public void queOUsuarioEstejaLogado() {
		vsp.validacaoPagina();
	}

	@Entao("aciono aba SAQUE")
	public void acionoAbaSAQUE() {
		vsp.paginaSaque();
	}

	@Entao("aparece aba SAQUE com a mensagem {string}")
	public void apareceAbaSAQUEComAMensagem(String string) {
		vsp.modalSaque();
	}
	@Entao("aciono o botao fechar")
	public void botaoFechar() {
		vsp.fecharModal();
	}

}
