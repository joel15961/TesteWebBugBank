package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealizarTransferenciaPage {
	public RealizarTransferenciaPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#btn-TRANSFERÊNCIA")
	private WebElement botao_de_transferencia;
	@FindBy(css = "input[name='transferValue']")
	private WebElement valor_da_transferencia;
	@FindBy(css = "input[name='description']")
	private WebElement descricao;
	@FindBy(css = "button[type='submit']")
	private WebElement botao_tranferir;
	@FindBy(css = "p[id='modalText']")
	private WebElement transferencia_realizada_com_sucesso;

	@FindBy(css = "a[id='btnCloseModal']")
	private WebElement botao_fechar_modal;
	@FindBy(css = "#btnBack")
	private WebElement voltar;

	public void transferencia() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", botao_de_transferencia);
		Thread.sleep(1000);
	}

	public void valorTransferencia(String string) throws Exception {
		valor_da_transferencia.sendKeys(string);
		Thread.sleep(1000);
	}

	public void descricao(String string) throws Exception {
		descricao.sendKeys(string);
		Thread.sleep(1000);
	}

	public void btnTransferir() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", botao_tranferir);
		Thread.sleep(1000);
	}

	public void modalSucesso() throws Exception {
		transferencia_realizada_com_sucesso.isDisplayed();
		Thread.sleep(1000);
	}

	public void btnFecharModal() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", botao_fechar_modal);
		Thread.sleep(1000);
	}

	public void voltar() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", voltar);
		Thread.sleep(1000);
	}

	public void realizarTransferenciaPrincipal(String valor, String descricao) throws Exception {
		
		transferencia();
		valorTransferencia(valor);
		descricao(descricao);

	}
	public void realizarTransferenciaPrincipalSemBotao(String valor, String descricao) throws Exception {
		
		valorTransferencia(valor);
		descricao(descricao);
		
	}
}
