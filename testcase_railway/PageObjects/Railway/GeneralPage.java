package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Constant.Constant;

public class GeneralPage {
	// Locators
	private final By welcomeMsg = By.xpath("//div[@class='account']/strong");
	private final String tabXpath = "//div[@id='menu']//a[contains(.,'%s')]";

	public WebElement getTab(String value) {
		By by = By.xpath(String.format(tabXpath, value));
		return Constant.WEBDRIVER.findElement(by);
	}

	protected WebElement getWelcomeMsg() {
		return Constant.WEBDRIVER.findElement(welcomeMsg);
	}

	public String getWelcomeMessage() {
		return this.getWelcomeMsg().getText();
	}

	public LoginPage gotoLoginPage() {
		this.getTab(TabMenu.LOGIN_PAGE.getValue()).click();
		return new LoginPage();
	}

	public HomePage gotoLogoutPage() {
		this.getTab(TabMenu.LOGOUT_PAGE.getValue()).click();
		return new HomePage();
	}

	public ContactPage gotoContactPage() {
		this.getTab(TabMenu.CONTACT_PAGE.getValue()).click();
		return new ContactPage();
	}

	public LoginPage gotoBookTicketPageBeforeLogin() {
		this.getTab(TabMenu.BOOKTICKET_PAGE.getValue()).click();
		return new LoginPage();
	}

	public BookTicketPage gotoBookTicketPageAfterLogin() {
		this.getTab(TabMenu.BOOKTICKET_PAGE.getValue()).click();
		return new BookTicketPage();
	}

	public RegisterPage gotoRegisterPage() {
		this.getTab(TabMenu.REGISTER_PAGE.getValue()).click();
		return new RegisterPage();
	}

	public TimeTablePage gotoTimeTablePage() {
		this.getTab(TabMenu.TIMETABLE_PAGE.getValue()).click();
		return new TimeTablePage();
	}

	public ChangePassword gotoChangePasswordPage() {
		this.getTab(TabMenu.CHANGEPASSWORD_PAGE.getValue()).click();
		return new ChangePassword();
	}

	public MailLoginPage goToConfirmMailPage() {
		Constant.WEBDRIVER.navigate().to(Constant.MAILBOX_URL);
		return new MailLoginPage();
	}
	public MyTicketPage gotoMyticketPage() {
		this.getTab(TabMenu.MYTICKET_PAGE.getValue()).click();
		return new MyTicketPage();
	}

}
