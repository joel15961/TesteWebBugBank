package stepsDefinitions;
import io.cucumber.java.pt.Entao;
import pageObjects.TransferenciaPage;

public class TransferenciaSteps{
	TransferenciaPage TransferenciaPage = new TransferenciaPage();
	
		
	@Entao("na pagina principal")
	public void na_pagina_principal() throws Exception{
		TransferenciaPage.bugBank_pag();
	}

	@Entao("em clico em tranferencia")
	public void em_clico_em_tranferencia() {
	    TransferenciaPage.transferir_btn();
	}

	@Entao("aparece a pagina com a mensagem {string}")
	public void aparece_a_pagina_com_a_mensagem(String string) {
	    TransferenciaPage.validar_Transacao();
	}



}
