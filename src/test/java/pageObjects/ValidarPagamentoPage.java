package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidarPagamentoPage {
	public ValidarPagamentoPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//p[normalize-space()='bem vindo ao BugBank :)']")
	private WebElement validacao_pagina_principal;
	
	@FindBy(css = "#btn-PAGAMENTOS")
	private WebElement botao_pagamentos;
	
	@FindBy(xpath = "(//p[@id='modalText'])[1]")
	private WebElement modal_pagamento;
	
	@FindBy (css = "#btnCloseModal")
	private WebElement fechar_modal;
	
	public void validacaoPagina() {
		validacao_pagina_principal.isDisplayed();
		String texto = validacao_pagina_principal.getText(); 
		assertEquals("bem vindo ao BugBank :)", texto); 
	}
	public void paginaPagamentos() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", botao_pagamentos);
	}
	public void modalPagamento() {
		modal_pagamento.isDisplayed();
		String texto2 = modal_pagamento.getAttribute("innerHTML"); 
		assertEquals("Funcionalidade em desenvolvimento", texto2); 
	}
	public void fecharModal() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", fechar_modal);
	}
}
