package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;

public class LoginPage extends GeneralPage {
	// Locators
	private final By txtUsername = By.xpath("//input[@id='username']");
	private final By txtPassword = By.xpath("//input[@id='password']");
	private final By btnLogin = By.xpath("//input[@value='login']");
	private final By loginErrorMsg = By.xpath("//p[@class='message error LoginForm']");
	private final By linkForgotPasswordPage = By.xpath("//a[@href='/Account/ForgotPassword.cshtml']");

	// Elements
	public WebElement getTxtUsername() {
		return Constant.WEBDRIVER.findElement(txtUsername);
	}

	public WebElement getTxtPassword() {
		return Constant.WEBDRIVER.findElement(txtPassword);
	}

	public WebElement getBtnLogin() {
		return Constant.WEBDRIVER.findElement(btnLogin);
	}

	public WebElement getlbLoginErrorMsg() {
		return Constant.WEBDRIVER.findElement(loginErrorMsg);
	}

	public WebElement getlinkForgotPassword() {
		return Constant.WEBDRIVER.findElement(linkForgotPasswordPage);
	}

	// Method
	public void submitLoginForm(String username, String password) {
		this.getTxtUsername().sendKeys(username);
		this.getTxtPassword().sendKeys(password);
		Utilities.scroll(getBtnLogin());
		this.getBtnLogin().click();
	}

	public HomePage login(String username, String password) {
		// Submit loin credentials
		submitLoginForm(username, password);
		// Land on Home page
		return new HomePage();
	}

	public LoginPage loginFailed(String username, String password) {
		// Submit loin credentials
		submitLoginForm(username, password);
		// Land on Home page
		return this;
	}

	public BookTicketPage loginBookTicket(String username, String password) {
		// Submit loin credentials
		submitLoginForm(username, password);
		// Land on Home page
		return new BookTicketPage();
	}

	public LoginPage loginMultipleTimes(String username, String password, int times) {

		for (int i = 0; i < times; i++) {
			submitLoginForm(username, password);
			this.getTxtUsername().clear();
		}

		return this;
	}

	public String getErrorMessage() {
		return this.getlbLoginErrorMsg().getText();
	}

	public ForgotPasswordPage gotoForgotPasswordPage() {
		this.getlinkForgotPassword().click();
		return new ForgotPasswordPage();
	}
}
