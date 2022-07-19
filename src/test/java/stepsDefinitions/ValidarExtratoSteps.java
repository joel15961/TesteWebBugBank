package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.ValidarExtratoPage;

public class ValidarExtratoSteps {
	// Instanciando Objetos

	ValidarExtratoPage vepg = new ValidarExtratoPage();

	@Dado("que o usuario esteja na pagina do bug bank")
	public void que_o_usuario_esteja_na_pagina_principal_BugBank() throws Exception {
//		vepg.inicioBugBank();
//		Thread.sleep(500);

	}

	@Dado("aciono a aba extrato")
	public void aciono_a_aba_extrato() {
//		vepg.extrato();
	}

	@Entao("valido o texto de saldo disponivel")
	public void valido_a_pagina_de_saldo_disponivel() {
//		vepg.textoSaldo();
	}

	@Entao("verifico o texto da abertura de conta")
	public void verificoAAberturaDeConta() {
//		vepg.textoAberturaDeConta();
	}

	@Entao("Observo as Transferencias enviadas")
	public void observoAsTransferenciasEnviadas() {
//		vepg.textoTransferenciaEnviada();
	}

	@Entao("verifico as datas")
	public void asDatas() {
//		vepg.dataAtual();
	}

}
