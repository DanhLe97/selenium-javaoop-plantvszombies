package Common;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constant.Constant;
import io.netty.util.internal.ThreadLocalRandom;

public class Utilities {

	public static String getProjectPath() {
		// TODO Auto-generated method stub
		return System.getProperty("user.dir");
	}

	public static String getRandomString() {
		String string = "";
		while (string.length() < 8) {
			int assciiCode = ThreadLocalRandom.current().nextInt(97, 122);
			string += Character.toString((char) assciiCode);
		}
		return string;
	}

	public static void scroll(WebElement element) {
		((JavascriptExecutor) Constant.WEBDRIVER).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void switchToWindowHandle(int index) {
		Set<String> setHandles = Constant.WEBDRIVER.getWindowHandles();

		String[] handles = Arrays.copyOf(setHandles.toArray(), setHandles.size(), String[].class);

		Constant.WEBDRIVER.switchTo().window(handles[index]);
	}

	public static void waitForClickable(By by) {
		WebDriverWait wdw = new WebDriverWait(Constant.WEBDRIVER, Duration.ofSeconds(30));
		wdw.until(ExpectedConditions.elementToBeClickable(by));

	}

	public static void waitForInvisibility(WebElement element) {
		WebDriverWait wdw = new WebDriverWait(Constant.WEBDRIVER, Duration.ofSeconds(30));
		wdw.until(ExpectedConditions.invisibilityOfAllElements(element));

	}

	public static void waitForControl(By by) {
		WebDriverWait wdw = new WebDriverWait(Constant.WEBDRIVER, Duration.ofSeconds(30));
		wdw.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void selectByValue(WebElement element, String value) {
		String defaultValue = element.getAttribute("value");
		Select select = new Select(element);
		if (!defaultValue.equals(value)) {
			select.selectByValue(value);
		}
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static int randomNumber(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min) + min);

	}

	public static String randomDepartDate(int min, int max) {
		// get current day
		Date dt = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, randomNumber(min, max));
		dt = c.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("M/d/yyyy");
		return formatter.format(dt);
	}

	public static void switchToFrame(String idFrame) {
		Constant.WEBDRIVER.switchTo().frame(idFrame);
	}

	public static void clearCookies() {
		Constant.WEBDRIVER.manage().deleteAllCookies();
	}
}
