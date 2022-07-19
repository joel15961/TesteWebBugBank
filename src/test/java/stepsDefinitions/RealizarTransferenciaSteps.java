package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import pageObjects.RealizarTransferenciaPage;

public class RealizarTransferenciaSteps {
	
	RealizarTransferenciaPage rtp = new RealizarTransferenciaPage();

	@Dado("que o usuario esteja na pagina de realizar transferencia")
	public void queOUsuarioEstejaNaPaginaDeRealizarTransferencia() throws Exception {
	    rtp.transferencia();
	    Thread.sleep(1000);
	}

	@Dado("inserir valor desejado {string}")
	public void inserir_valor_desejado(String string) throws Exception {
	   rtp.valorTransferencia(string);
	   Thread.sleep(1000);
	}

	@Dado("inserir descricao da transacao {string}")
	public void inserir_descricao_da_transacao(String string) throws Exception {
	    rtp.descricao(string);
	    Thread.sleep(1000);
	}


}
