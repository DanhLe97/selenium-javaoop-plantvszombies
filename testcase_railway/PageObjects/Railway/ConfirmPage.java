package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class ConfirmPage extends GeneralPage {
	private final By _txtConfirmMsg = By.xpath("//p[text()='Registration Confirmed! You can now log in to the site.']");

	public WebElement getTxtConfirmMsg() {
		return Constant.WEBDRIVER.findElement(_txtConfirmMsg);
	}

	public String getConfirmMsg() {
		return this.getTxtConfirmMsg().getText();
	}
}
