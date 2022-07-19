package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {
	public CadastroPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".pages__Title-sc-1ee1f2s-4.cFmqIK")
	private WebElement pagina_principal;

	@FindBy(xpath = "//button[normalize-space()='Registrar']")
	private WebElement botao_registrar;

	@FindBy(css = "div[class=\"card__register\"] input[type=\"email\"]")
	private WebElement email;

	@FindBy(css = "div[class=\"card__register\"] input[type=\"name\"]")
	private WebElement nome_usuario;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement senha_usuario;

	@FindBy(xpath = "(//img[@aria-hidden='true'])[3]")
	private WebElement mostrar_senha_usuario;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement validar_senha_usuario;

	@FindBy(xpath = "(//input[@name='passwordConfirmation'])")
	private WebElement confirmar_senha_usuario;

	@FindBy(xpath = "(//img[@alt='Icon Close Eye'])[3]")
	private WebElement mostrar_confirmacao_senha_usuario;

	@FindBy(xpath = "(//label[@id='toggleAddBalance'])[1]")
	private WebElement criar_conta_com_saldo;

	@FindBy(xpath = "(//button[normalize-space()='Cadastrar'])[1]")
	private WebElement btn_cadastrar;

	@FindBy(id = "modalText")
	private WebElement cadastro_sucesso;

	@FindBy(id = "btnCloseModal")
	private WebElement btn_fechar;

	public void testePrimeiraPagine() {
		pagina_principal.isDisplayed(); // Verifica se o elemento está aparecendo
		String texto = pagina_principal.getText(); // Pega o Texto do elemento e guarda em uma variavel.
		assertEquals("O banco com bugs e falhas do seu jeito", texto); // Verifica se os dois campos são iguais como o
																		// esperado.
	}

	public void botaoRegistrar() {
		String botao = botao_registrar.getText();
		assertEquals("Registrar", botao);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", botao_registrar);
	}

	public void registrarEmail(String string) {
		email.sendKeys(string);
	}

	public void registrarNome(String string) {
		nome_usuario.sendKeys(string);
	}

	public void registrarSenha(String string) throws Exception {
		senha_usuario.sendKeys(string);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", mostrar_senha_usuario);
	}

	public void confirmarSenha(String string) {
		confirmar_senha_usuario.sendKeys(string);
	}

	public void criarContaComSaldo() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", criar_conta_com_saldo);
		
	}

	public void botaoCadastrar() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btn_cadastrar);
		
	}
	public void contaCadastradaComSucesso() {
		cadastro_sucesso.isDisplayed();
	}
	public void fecharModal() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btn_fechar);
	}

	public void realizar_cadastro(String string, String string2, String string3) throws Exception {
		testePrimeiraPagine();
		Thread.sleep(1000);
		botaoRegistrar();
		Thread.sleep(1000);
		registrarEmail(string);
		Thread.sleep(1000);
		registrarNome(string2);
		Thread.sleep(1000);
		registrarSenha(string3);
		Thread.sleep(1000);
		confirmarSenha(string3);
		Thread.sleep(1000);
		criarContaComSaldo();
		Thread.sleep(1000);
		botaoCadastrar();
		contaCadastradaComSucesso();
		fecharModal();
		
	}

}
