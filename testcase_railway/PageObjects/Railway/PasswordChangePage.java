package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;

public class PasswordChangePage extends GeneralPage {
	// Locators
	private final By txtNewPassword = By.xpath("//input[@id='newPassword']");
	private final By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
	private final By txtPasswordResetToken = By.xpath("//input[@id='resetToken']");
	private final By btnResetPassword = By.xpath("//input[@type='submit']");
	private final By msgErrorAbove = By.xpath("//p[@class='message error']");
	private final By msgErrorNext = By.xpath("//label[@class='validation-error']");

	// Elements
	public WebElement getTxtNewPassword() {
		return Constant.WEBDRIVER.findElement(txtNewPassword);
	}

	public WebElement getTxtConfirmPassword() {
		return Constant.WEBDRIVER.findElement(txtConfirmPassword);
	}

	public WebElement getTxtPasswordResetToken() {
		return Constant.WEBDRIVER.findElement(txtPasswordResetToken);
	}

	public WebElement getBtnResetPassword() {
		return Constant.WEBDRIVER.findElement(btnResetPassword);
	}

	public WebElement getMsgErrorAbove() {
		return Constant.WEBDRIVER.findElement(msgErrorAbove);
	}
	
	public WebElement getMsgErrorNext() {
		return Constant.WEBDRIVER.findElement(msgErrorNext);
	}
	// Method
	public PasswordChangePage submiPasswordChangeForm(String newPassword, String confirmPassword)
	{
		Utilities.waitForControl(txtNewPassword);
		this.getTxtNewPassword().sendKeys(newPassword);
		this.getTxtConfirmPassword().sendKeys(confirmPassword);
		this.getTxtPasswordResetToken().clear();
		Utilities.scroll(getBtnResetPassword());
		this.getBtnResetPassword().submit();
		return new PasswordChangePage();
	}

	public String getErrorMessageAbovetheForm() {
		return this.getMsgErrorAbove().getText();
	}
	public String getErrorMessageNexttoTokenField() {
		return this.getMsgErrorNext().getText();
	}
	
}
