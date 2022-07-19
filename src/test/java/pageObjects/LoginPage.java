package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".pages__Title-sc-1ee1f2s-4.cFmqIK")
	private WebElement pagina_principal;

	@FindBy(xpath = "(//input[@placeholder='Informe seu e-mail'])[1]")
	private WebElement campo_email;

	@FindBy(xpath = "(//input[@placeholder='Informe sua senha'])[1]")
	private WebElement informar_senha;

	@FindBy(xpath = "(//button[normalize-space()='Acessar'])[1]")
	private WebElement btn_acessar;

	@FindBy(xpath = "(//p[@id='textName'])[1]")
	private WebElement pagina_BugBank;
	@FindBy(css = "p[id='textAccountNumber'] span")
	private WebElement numero_account;

	@FindBy(css = "#btnExit")
	private WebElement sair_da_conta;

	public void testePrimeiraPagine() {
		pagina_principal.isDisplayed();
		String texto = pagina_principal.getText();
		assertEquals("O banco com bugs e falhas do seu jeito", texto);
	}

	public void inserir_Email(String email) {
		campo_email.sendKeys(email);
	}

	public void inserir_Senha(String senha) {
		informar_senha.sendKeys(senha);
	}

	public void botao_Acessar() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btn_acessar);

	}

	public void bugBank_pag() {
		//pagina_BugBank.isDisplayed();
	}

	public String numeroConta() {
		String conta = numero_account.getText();

		return conta;
	}

	public void btnSair() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", sair_da_conta);
	}

	public void realizar_login(String email, String senha) throws Exception {
		testePrimeiraPagine();
		inserir_Email(email);
		inserir_Senha(senha);
		botao_Acessar();
		Thread.sleep(1000);
	}
}