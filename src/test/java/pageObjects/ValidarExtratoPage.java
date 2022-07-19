package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidarExtratoPage {
	public ValidarExtratoPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#btn-EXTRATO")
	private WebElement botao_extrato;

	@FindBy(css = "img[src=\"/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fbugbank.ede6fc83.png&w=384&q=75\"]")
	private WebElement inicio;

	@FindBy(css = ".bank-statement__LabelText-sc-7n8vh8-10.UPwdn")
	private WebElement saldo_disponivel_texto;

	@FindBy(xpath = "(//p[@id='textTypeTransaction'])[1]")
	private WebElement abertura_de_conta_texto;
	
	@FindBy(xpath = "(//p[@id='textTypeTransaction'])[2]")
	private WebElement transferencia_enviada_texto;
	
	@FindBy(xpath = "(//p[@id='textDateTransaction'])[1]")
	private WebElement data;

	public void inicioBugBank() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", inicio);
	}

	public void extrato() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", botao_extrato);
	}

	public void textoSaldo() {
		saldo_disponivel_texto.isDisplayed();
		String texto = saldo_disponivel_texto.getText(); // Pega o Texto do elemento e guarda em uma variavel.
		assertEquals("Saldo disponível", texto);
	}
	public void textoAberturaDeConta() {
		abertura_de_conta_texto.isDisplayed();
		String texto = abertura_de_conta_texto.getText(); // Pega o Texto do elemento e guarda em uma variavel.
		assertEquals("Abertura de conta", texto);
	}
	
	public void textoTransferenciaEnviada() {
		transferencia_enviada_texto.isDisplayed();
		String texto = transferencia_enviada_texto.getText(); // Pega o Texto do elemento e guarda em uma variavel.
		assertEquals("Transferência enviada", texto);
	}
	

	public void dataAtual() {
		SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();

		Date dateObj = calendar.getTime();
		String formattedDate = dtf.format(dateObj);
		String texto = data.getText(); // Pega o Texto do elemento e guarda em uma variavel.
		assertEquals(formattedDate, texto);
	}

}