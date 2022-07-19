package pageObjects;
import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

public class ExtratoPage {
	public ExtratoPage() {
	PageFactory.initElements(driver, this);
}

}
