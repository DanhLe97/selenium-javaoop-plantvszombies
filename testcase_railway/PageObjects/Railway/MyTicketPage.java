package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class MyTicketPage {
	//Locators
	private final By txtdepartDate = By.xpath("//input[@name='FilterDpDate']");
	private final By txtSuccessMsg = By.xpath("//li[text()='You currently book 6 tickets, you can book 4 more.']");
	//Elements
	public WebElement getTxtDepartDate() {
		return Constant.WEBDRIVER.findElement(txtdepartDate);
	}
	public WebElement getTxtSuccessMsg() {
		return Constant.WEBDRIVER.findElement(txtSuccessMsg);
	}
	//Method
	public MyTicketPage inputDepartDate(String departDate) {
		// Submit loin credentials
		this.getTxtDepartDate().sendKeys(departDate);
		// Land on Home page
		return new MyTicketPage();
	}
	public String getTxtSuccessMessage() {
		return this.getTxtSuccessMsg().getText();
	}
}
