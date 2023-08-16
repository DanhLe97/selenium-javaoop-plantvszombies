package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;

public class ChangePassword extends GeneralPage {
	// Locators
	private final By txtCurrentPassword = By.xpath("//input[@id='currentPassword']");
	private final By txtNewPassword = By.xpath("//input[@id='newPassword']");
	private final By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
	private final By btnChangePassword = By.xpath("//input[@type='submit']");
	private final By msgErrorMassage = By.xpath("//p[@class='message error']");

	// Elements
	public WebElement getTxtCurrentPassword() {
		return Constant.WEBDRIVER.findElement(txtCurrentPassword);
	}

	public WebElement getTxtNewPassword() {
		return Constant.WEBDRIVER.findElement(txtNewPassword);
	}

	public WebElement getTxtConfirmPassword() {
		return Constant.WEBDRIVER.findElement(txtConfirmPassword);
	}

	public WebElement getBtnChangePassword() {
		return Constant.WEBDRIVER.findElement(btnChangePassword);
	}

	public WebElement getMsgErrorMassage() {
		return Constant.WEBDRIVER.findElement(msgErrorMassage);
	}

	// Method
	public ChangePassword submitChangePasswordForm(String currentPassword, String newPassword, String confirmPassword) {
		this.getTxtCurrentPassword().sendKeys(currentPassword);
		this.getTxtNewPassword().sendKeys(newPassword);
		this.getTxtConfirmPassword().sendKeys(confirmPassword);
		Utilities.scroll(getBtnChangePassword());
		this.getBtnChangePassword().click();
		return new ChangePassword();
	}

	public String getErrorMessage() {
		return this.getMsgErrorMassage().getText();
	}
}
