package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferenciaPage {
	public TransferenciaPage() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath = "(//p[@id='textName'])[1]")
		private WebElement pagina_BugBank;
		
		@FindBy(id = "btn-TRANSFERÊNCIA")
		private WebElement transferir_btn;
		
		@FindBy(xpath = "(//p[@class='transfer__TextInformation-sc-1yjpf2r-7 eUFZOb'])[1]")
		private WebElement pag_validar_Transacao;
		
		@FindBy(css = "input[name='accountNumber']")
		private WebElement conta;
		
		@FindBy(css = "input[name='digit']")
		private WebElement digito_conta;
		
		
		public void bugBank_pag() {
			pagina_BugBank.isDisplayed();
		}
		public void transferir_btn() {
			transferir_btn.click();
		}
		public void validar_Transacao() {
			pag_validar_Transacao.isDisplayed();
		}
		public void numero_conta(String string) throws Exception {
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].value='"+string+"'", conta);
			conta.sendKeys(string);
			Thread.sleep(1000);
	
		}
		public void digito_Conta(String string) throws Exception {
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].value='"+string+"'", digito_conta);
			digito_conta.sendKeys(string);
			Thread.sleep(1000);
		}
			
		public void realizar_transferencia_sucesso() {
			bugBank_pag();
			transferir_btn();
			validar_Transacao();
		}
	}
