package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pageObjects.ValidarPaginaInicialPage;

public class ValidarPaginaInicialSteps {
	ValidarPaginaInicialPage vpg = new ValidarPaginaInicialPage();

	@Dado("que o usuario esteja na pagina Principal da Pagina")
	public void queOUsuarioEstejaNaPaginaPrincipalDaPagina() {
		vpg.validacaoPaginaInicial();
	}

	@Entao("valido a pagina inicial")
	public void validoAPaginaInicial() {
		vpg.validacaoPaginaInicial();
	}

	@E("se existe o botao de transferencia")
	public void se_existe_o_botao_de_transferencia() throws Exception {
		vpg.botaoTransferencia();
	}

	@E("Verifico se existe o campo de Pagemento")
	public void verifico_se_existe_o_campo_de_Pagemento()throws Exception {
		vpg.botaoPaqgamentos();
	}

	@E("se possui o botao de Extrato")
	public void se_possui_o_botao_de_Extrato()throws Exception {
		vpg.botaoExtrato();
	}

	@E("verifico se possui botao de Saque")
	public void verifico_se_possui_botao_de_Saque()throws Exception {
		vpg.botaoSaque();
	}

	@E("clico no botao de Sair")
	public void clicoNoBotaoDeSair() {
		vpg.botaoSair();
	}

	@Entao("analiso se saiu da Pagina Principal")
	public void analisoSeSaiuDaPaginaPrincipal() {
		vpg.paginainicialtexto();
	}

}
