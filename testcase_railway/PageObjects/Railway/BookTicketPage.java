package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;
import Railway.Ticket.SeatType;
import Railway.Ticket.Station;

public class BookTicketPage extends GeneralPage {
	// Locators
	private final By optDepartDate = By.xpath("//select[@name='Date']");
	private final By optDepartFrom = By.xpath("//select[@name='DepartStation']");
	private final By optArriveAt = By.xpath("//select[@name='ArriveStation']");
	private final By optSeatType = By.xpath("//select[@name='SeatType']");
	private final By optTicketAmount = By.xpath("//select[@name='TicketAmount']");
	private final By btnSubmit = By.xpath("//input[@value='Book ticket']");
	private final By lblBookErrorMsg = By.xpath("//p[@class='message error']");
	private final String txtArriveAt = "//select[@name='ArriveStation']/option[@value='%s']";
//	private final By lblBookTicket = By.xpath("//h1[@align='center']");

	// Elements
	public WebElement getTxtArriveAtName(String departFrom) {
		By txtArriveAtName = By.xpath(String.format(txtArriveAt, departFrom));
		return Constant.WEBDRIVER.findElement(txtArriveAtName);
	}

	public WebElement getOptDepartDate() {
		return Constant.WEBDRIVER.findElement(optDepartDate);
	}

	public WebElement getOptDepartFrom() {
		return Constant.WEBDRIVER.findElement(optDepartFrom);
	}

	public WebElement getOptArriveAt() {
		return Constant.WEBDRIVER.findElement(optArriveAt);
	}

	public WebElement getOptSeatType() {
		return Constant.WEBDRIVER.findElement(optSeatType);
	}

	public WebElement getOptTicketAmount() {
		return Constant.WEBDRIVER.findElement(optTicketAmount);
	}

	public WebElement getBtnSubmit() {
		return Constant.WEBDRIVER.findElement(btnSubmit);
	}

	public WebElement getlblBookErrorMsg() {
		return Constant.WEBDRIVER.findElement(lblBookErrorMsg);
	}

	public String getUrlBookTicket() {
		return Constant.WEBDRIVER.getCurrentUrl();
	}

	// Method
	public void submitBookTicketForm(String departDate, Station departFrom, Station arriveAt, SeatType seatType,
			String ticketAmount) {
		// Select class for dropdown
		// get selected option with getFirstSelectedOption() with its text
		Utilities.selectByVisibleText(getOptDepartDate(), departDate);
		Utilities.selectByValue(getOptDepartFrom(), departFrom.getValue());
		Utilities.waitForInvisibility(getTxtArriveAtName(departFrom.getValue()));
		Utilities.scroll(getBtnSubmit());
		Utilities.selectByVisibleText(getOptSeatType(), seatType.getSeatType());
		Utilities.selectByVisibleText(getOptTicketAmount(), ticketAmount);
		Utilities.selectByValue(getOptArriveAt(), arriveAt.getValue());
		Utilities.waitForClickable(btnSubmit);
		this.getBtnSubmit().submit();
	}

	public SuccessPage bookTicket(String departDate, Station departFrom, Station arriveAt, SeatType seatType,
			String ticketAmount) {
		// Select class for dropdown
		// get selected option with getFirstSelectedOption() with its text
		submitBookTicketForm(departDate, departFrom, arriveAt, seatType, ticketAmount);
		// Land on Home page
		return new SuccessPage();
	}

	public String getUrlBookTicketPage() {
		return this.getUrlBookTicket();
	}

	public SuccessPage bookMultipleTickets(Station departFrom, Station arriveAt, SeatType seatType, String ticketAmount, int times) {
		for (int i = 0; i < times; i++) {
			submitBookTicketForm(Utilities.randomDepartDate(Constant.MINDAY, Constant.MAXDAY), departFrom, arriveAt,seatType, ticketAmount);
			gotoBookTicketPageAfterLogin();
			}
		// Land on Home page
		return new SuccessPage();
	}
}
