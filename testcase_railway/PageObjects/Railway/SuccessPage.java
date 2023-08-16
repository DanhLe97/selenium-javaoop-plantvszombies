package Railway;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class SuccessPage extends GeneralPage {
	// Locator
	private final By txtSuccessMsg = By.xpath("//h1[@align='center']");
	private final By txtTableSmallHeader = By.xpath("//tr[@class='TableSmallHeader']/th");
	

	// Elements

	public WebElement getTxtSuccessMsg() {
		return Constant.WEBDRIVER.findElement(txtSuccessMsg);
	}

	public List<WebElement> getTxtTableSmallHeaders() {
		return Constant.WEBDRIVER.findElements(txtTableSmallHeader);
	}

	public WebElement getTxtTableSmallContents(int index) {
		return Constant.WEBDRIVER.findElement(By.xpath(String.format("//tr[@class='OddRow']/td[%s]", index)));
	}

	// Method
	public String bookTicketSuccessful() {
		// Get success message
		return this.getTxtSuccessMsg().getText();
	}

	public int getTitleColumnIndex(String title) {
		List<WebElement> lst = getTxtTableSmallHeaders();
		int index = 0;
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).getText().equals(title)) {
				return index = i + 1;
			}
		}
		return index;
	}

	public String getValueOfTitle(String title) {
		return getTxtTableSmallContents(getTitleColumnIndex(title)).getText();
	}

}
