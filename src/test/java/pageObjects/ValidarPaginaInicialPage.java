package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidarPaginaInicialPage {
	public ValidarPaginaInicialPage() {
		PageFactory.initElements(driver, this);
	}
	// botões
	@FindBy(css = ".home__ContainerInfos-sc-1auj767-4.hZrCpL")
	private WebElement pagina_inicial;
	@FindBy(css = "#btn-TRANSFERÊNCIA")
	private WebElement btn_transferencia;
	@FindBy(css = "#btn-PAGAMENTOS")
	private WebElement btn_pagamentos;
	@FindBy(css = "#btn-EXTRATO")
	private WebElement btn_extrato;
	@FindBy(css = "#btn-SAQUE")
	private WebElement btn_saque;
	@FindBy(css = "#btnBack")
	private WebElement btn_voltar;
	@FindBy(css = "#btnCloseModal")
	private WebElement btn_fechar_modal;
	@FindBy(css = "#btnExit")
	private WebElement sair_da_pagina;
	@FindBy(css = ".pages__Title-sc-1ee1f2s-4.cFmqIK")
	private WebElement texto_pagina_inicial;
	
	public void validacaoPaginaInicial() {
		pagina_inicial.isDisplayed();
	}
	public void botaoTransferencia() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btn_transferencia);
		Thread.sleep(500);
		js.executeScript("arguments[0].click()", btn_voltar);
	}
	public void botaoPaqgamentos() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btn_pagamentos);
		Thread.sleep(500);
		js.executeScript("arguments[0].click()", btn_fechar_modal);
	}
	public void botaoExtrato() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btn_extrato);
		Thread.sleep(500);
		js.executeScript("arguments[0].click()", btn_voltar);
	}
	public void botaoSaque() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btn_saque);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click()", btn_fechar_modal);
	}
	public void botaoSair() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", sair_da_pagina);

	}
	public void paginainicialtexto() {
		String botao = texto_pagina_inicial.getText();
		assertEquals("O banco com bugs e falhas do seu jeito", botao);
		
	}
}
