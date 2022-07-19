package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.CadastroPage;

public class CadastroSteps {
	CadastroPage pagina_de_cadastro = new CadastroPage();

	@Dado("que o usuario esteja na pagina principal")
	public void que_o_usuario_esteja_na_pagina_principal() {
		pagina_de_cadastro.testePrimeiraPagine();
	}

	@Dado("aciono registrar usuario")
	public void aciono_registrar_usuario() {
		pagina_de_cadastro.botaoRegistrar();

	}

	@Dado("inserir no campo email {string}")
	public void inserir_no_campo_email(String string) {
		pagina_de_cadastro.registrarEmail(string);

	}

	@Dado("inserir no campo nome {string}")
	public void inserir_no_campo_nome(String string) {
		pagina_de_cadastro.registrarNome(string);

	}

	@Dado("inserir no campo senha {string}")
	public void inserir_no_campo_senha(String string) throws Exception  {
		pagina_de_cadastro.registrarSenha(string);
		Thread.sleep(1000);
		
	}

	@Dado("inserir no campo confirmacao de senha {string}")
	public void inserir_no_campo_confirmacao_de_senha(String string) {
		pagina_de_cadastro.confirmarSenha(string);
		
	}

	@Dado("aciono criar conta com saldo")
	public void aciono_criar_conta_com_saldo() throws Exception {
		pagina_de_cadastro.criarContaComSaldo();
		Thread.sleep(1000);
	}

	@Entao("clico em cadastrar")
	public void clico_em_cadastrar() {
		pagina_de_cadastro.botaoCadastrar();
		
	}

	@Entao("aparece a aba de cadastro com sucesso")
	public void aparece_a_aba_de_cadastro_com_sucesso() {
		//pagina_de_cadastro.contaCadastradaComSucesso();
}
	@Entao("clico em fechar aba")
	public void clico_em_fechar_aba() {
	pagina_de_cadastro.fecharModal();
	}
}
