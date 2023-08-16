package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;

public class RegisterPage extends GeneralPage {
	// Locators
	private final By txtEmail = By.xpath("//input[@id='email']");
	private final By txtPassword = By.xpath("//input[@id='password']");
	private final By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
	private final By txtPid = By.xpath("//input[@id='pid']");
	private final By btnRegister = By.xpath("//input[@type='submit']");
	private final By registerErrorMsgAboveTheForm = By.xpath("//p[@class='message error']");
	private final By registerErrorMsgNextToPasswordField = By
			.xpath("//li[@class='password']/label[@class='validation-error']");
	private final By registerErrorMsgNextToPidField = By
			.xpath("//li[@class='pid-number']/label[@class='validation-error']");

	// Elements
	public WebElement getTxtEmail() {
		return Constant.WEBDRIVER.findElement(txtEmail);
	}

	public WebElement getTxtPassword() {
		return Constant.WEBDRIVER.findElement(txtPassword);
	}

	public WebElement getTxtConfirmPassword() {
		return Constant.WEBDRIVER.findElement(txtConfirmPassword);
	}

	public WebElement getTxtPid() {
		return Constant.WEBDRIVER.findElement(txtPid);
	}

	public WebElement getBtnRegister() {
		return Constant.WEBDRIVER.findElement(btnRegister);
	}

	public WebElement getRegisterErrorMsgAbove() {
		return Constant.WEBDRIVER.findElement(registerErrorMsgAboveTheForm);
	}

	public WebElement getRegisterErrorMsgNextToPassword() {
		return Constant.WEBDRIVER.findElement(registerErrorMsgNextToPasswordField);
	}

	public WebElement getRegisterErrorMsgNextToPid() {
		return Constant.WEBDRIVER.findElement(registerErrorMsgNextToPidField);
	}

	// Methods
	public void submitRegisterForm(String username, String password, String comfirmPassword, String pid) {
		// Submit signup credentials
		this.getTxtEmail().sendKeys(username);
		this.getTxtPassword().sendKeys(password);
		this.getTxtConfirmPassword().sendKeys(comfirmPassword);
		this.getTxtPid().sendKeys(pid);
		Utilities.scroll(getBtnRegister());
		this.getBtnRegister().click();
	}

	public RegisterSuccessPage registerSuccess(Account acc) {
		// Submit signup credentials
		submitRegisterForm(acc.getEmail(), acc.getPassword(), acc.getConfirmPassword(), acc.getPid());
		// Land on RegisterSuccessPage
		return new RegisterSuccessPage();
	}

	public RegisterPage registerFailed(Account acc) {
		// Submit signup credentials
		submitRegisterForm(acc.getEmail(), acc.getPassword(), acc.getConfirmPassword(), acc.getPid());
		// Land on Register page
		return this;
	}

	public RegisterPage registerFailed(String email, String password, String confirmPassword, String pid) {
		// Submit signup credentials
		submitRegisterForm(email, password, confirmPassword, pid);
		// Land on Register page
		return this;
	}

	public String getRegisterErrorMsgAboveTheForm() {
		return this.getRegisterErrorMsgAbove().getText();
	}

	public String getRegisterErrorMsgNextToPasswordField() {
		return this.getRegisterErrorMsgNextToPassword().getText();
	}

	public String getRegisterErrorMsgNextToPidField() {
		return this.getRegisterErrorMsgNextToPid().getText();
	}
}
