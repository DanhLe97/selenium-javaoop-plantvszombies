package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class RegisterSuccessPage extends GeneralPage {
	// Locator
	private final By txtSuccessMsg = By.xpath("//h1[@align='center']");

	// Elements
	public WebElement getTxtSuccessMsg() {
		return Constant.WEBDRIVER.findElement(txtSuccessMsg);
	}

	// Method
	public String getRegisterSuccessMsg() {
		// Get success message
		return this.getTxtSuccessMsg().getText();
	}
}
