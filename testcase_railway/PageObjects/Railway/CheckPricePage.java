package Railway;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class CheckPricePage extends GeneralPage{
	// Locator
		private final By txtSeatType = By.xpath("//th[contains(text(),'Seat type')]/following-sibling::td");

	// Elements
	public List<WebElement> getTxtSeatType() {
		return Constant.WEBDRIVER.findElements(txtSeatType);
	}

	public WebElement getTxtPrice(int index) {
		return Constant.WEBDRIVER.findElement(By.xpath(String.format("//th[contains(text(),'Price (VND)')]/following-sibling::td[%s]", index)));
	}

	// Method

	public int getTitleColumnIndex(String title) {
		List<WebElement> lst = getTxtSeatType();
		int index = 0;
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).getText().equals(title)) {
				return index = i+1;
			}
		}
		return index;
	}

	public String getValueOfTitle(String title) {
		return getTxtPrice(getTitleColumnIndex(title)).getText();
	}

	}

