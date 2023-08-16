package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;

public class MailPage {
	private final String txtMailSubjectXpath = "//span[text()='Please confirm your account %s']";
	private final String txtMailSubjectXpathPassword = "//span[text()='Please reset your password %s']";
	private final By txtMailContent = By.xpath("//div[@id='message-htmlpart1']//a");
	private final By txtIframe = By.xpath("//iframe[@id='messagecontframe']");

	public WebElement getTxtMailSubject(String email) {
		By txtMailSubject = By.xpath(String.format(txtMailSubjectXpath, email));
		return Constant.WEBDRIVER.findElement(txtMailSubject);
	}

	public WebElement getTxtMailSubjectPassword(String email) {
		By txtMailSubjectPassword = By.xpath(String.format(txtMailSubjectXpathPassword, email));
		return Constant.WEBDRIVER.findElement(txtMailSubjectPassword);
	}

	public WebElement getTxtMailContent() {
		return Constant.WEBDRIVER.findElement(txtMailContent);
	}

	public WebElement getTxtIframe() {
		return Constant.WEBDRIVER.findElement(txtIframe);
	}

	public void activeEmail(String email, boolean isActiveAccount) {
		if (isActiveAccount) {
			By txtMailSubject = By.xpath(String.format(txtMailSubjectXpath, email));
			Utilities.waitForControl(txtMailSubject);
			this.getTxtMailSubject(email).click();
		} else {
			By txtMailSubjectPassword = By.xpath(String.format(txtMailSubjectXpathPassword, email));
			Utilities.waitForControl(txtMailSubjectPassword);
			this.getTxtMailSubjectPassword(email).click();
		}

		Utilities.waitForControl(txtIframe);
		// Switch to iframe
		Utilities.switchToFrame("messagecontframe");
		Utilities.waitForControl(txtMailContent);
		this.getTxtMailContent().click();
		// clear cookies
		Utilities.clearCookies();
	}

	public ConfirmPage activeAccount(String email) {
		activeEmail(email, true);
		Utilities.switchToWindowHandle(0);
		return new ConfirmPage();
	}

	public PasswordChangePage activeNewPassword(String email,int pageindex) {
		activeEmail(email, false);
		Utilities.switchToWindowHandle(pageindex);
		return new PasswordChangePage();
	}
}
