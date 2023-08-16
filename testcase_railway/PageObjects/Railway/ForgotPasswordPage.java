package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;

public class ForgotPasswordPage extends GeneralPage {
	// Locators
	private final By txtEmailAddress = By.xpath("//input[@id='email']");
	private final By btnSendInstructions = By.xpath("//input[@type='submit']");

	// Elements
	public WebElement getEmailAddress() {
		return Constant.WEBDRIVER.findElement(txtEmailAddress);
	}

	public WebElement getBtnSendInstructions() {
		return Constant.WEBDRIVER.findElement(btnSendInstructions);
	}

	// Method
	public ForgotPasswordPage submitEmail(String email) {
		// Submit loin credentials
		this.getEmailAddress().sendKeys(email);
		Utilities.scroll(getBtnSendInstructions());
		this.getBtnSendInstructions().click();
		// Land on Home page
		return new ForgotPasswordPage();

	}
}
