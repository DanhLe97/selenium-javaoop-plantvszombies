package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class MailLoginPage {
	private final By txtMailUserName = By.xpath("//input[@name='_user']");
	private final By txtMailPassWord = By.xpath("//input[@name='_pass']");
	private final By btnLogin = By.xpath("//button[@type='submit']");

	public WebElement getTxtMailUserName() {
		return Constant.WEBDRIVER.findElement(txtMailUserName);
	}

	public WebElement getTxtMailPassWord() {
		return Constant.WEBDRIVER.findElement(txtMailPassWord);
	}

	public WebElement getBtnSubmit() {
		return Constant.WEBDRIVER.findElement(btnLogin);
	}

	public MailPage login(String userName, String passWord) {
		this.getTxtMailUserName().sendKeys(userName);
		this.getTxtMailPassWord().sendKeys(passWord);
		this.getBtnSubmit().submit();
//		Thread.sleep(5000);
		return new MailPage();
	}
}
