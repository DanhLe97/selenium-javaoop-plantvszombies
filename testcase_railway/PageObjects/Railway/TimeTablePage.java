package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;

public class TimeTablePage extends GeneralPage {
	// Locators
	private final By linkDaNangToSaiGonPrice = By.xpath("//a[@href='TicketPricePage.cshtml?id1=4&id2=1']");

	// Elements
	public WebElement getLinkDaNangToSaiGonPrice() {
		return Constant.WEBDRIVER.findElement(linkDaNangToSaiGonPrice);
	}

	// Method
	public CheckPricePage gotoDNtoSGCheckPricePage() {
		Utilities.scroll(getLinkDaNangToSaiGonPrice());
		Utilities.waitForControl(linkDaNangToSaiGonPrice);
		this.getLinkDaNangToSaiGonPrice().click();
		return new CheckPricePage();
	}
}
