package Railway;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Utilities;
import Constant.Constant;

public class BookTicketTest extends BaseTest{
	HomePage homePage = new HomePage();
	Account acc = new Account();

	@BeforeMethod
	void createAccount() {
	homePage.open()
				.gotoRegisterPage()
				.registerSuccess(acc)
				.goToConfirmMailPage()
				.login(Constant.MAILBOX_USERNAME, Constant.MAILBOX_PASSWORD)
				.activeAccount(acc.getEmail());
	}
	@Test
	public void TC14() {
		System.out.println("User can book many tickets at a time");
	
		String departDate = Utilities.randomDepartDate(Constant.MINDAY,Constant.MAXDAY);
		
		SuccessPage successPage = homePage.open()
				.gotoLoginPage()
				.login(acc.getEmail(), acc.getPassword())
				.gotoBookTicketPageAfterLogin()
				.bookTicket(departDate,Ticket.Station.NHATRANG,Ticket.Station.SAIGON, Ticket.SeatType.SOFTSEATWITHAIRCONDITIONER,"5");
		
		String actualSuccessMsg = successPage.bookTicketSuccessful();
		String actualDepartDate = successPage.getValueOfTitle("Depart Date");
		String actualDepartFrom = successPage.getValueOfTitle("Depart Station");
		String actualArriveAt 	= successPage.getValueOfTitle("Arrive Station");
		String actualSeatType 	= successPage.getValueOfTitle("Seat Type");
		String actualTicketAmount = successPage.getValueOfTitle("Amount");
								
		String expectedSuccessMsg = "Ticket booked successfully!";
		String expectedDepartDate = departDate;
		String expectedDepartFrom = "Nha Trang";
		String expectedArriveAt = "Sài Gòn";
		String expectedSeatType = "Soft seat with air conditioner";
		String expectedTicketAmount = "5";
		
		Assert.assertEquals(actualSuccessMsg,expectedSuccessMsg,"Success message is not displayed as expected");
		Assert.assertEquals(actualDepartDate,expectedDepartDate,"Depart date is not displayed as expected");
		Assert.assertEquals(actualDepartFrom,expectedDepartFrom,"Depart station is not displayed as expected");
		Assert.assertEquals(actualArriveAt,expectedArriveAt,"Arrive station is not displayed as expected");
		Assert.assertEquals(actualSeatType,expectedSeatType,"Seat type is not displayed as expected");
		Assert.assertEquals(actualTicketAmount,expectedTicketAmount,"Ticket amount is not displayed as expected");
	}
	
	@Test
	public void TC15() {
		System.out.println("Ticket price page displays with ticket details after clicking on check price link in Train timetable page");
		
		CheckPricePage checkPricePage = homePage.open()
				.gotoLoginPage()
				.login(acc.getEmail(), acc.getPassword())
				.gotoTimeTablePage()
				.gotoDNtoSGCheckPricePage();
		
		String actualHSPrice = checkPricePage.getValueOfTitle("HS");
		String actualSSPrice = checkPricePage.getValueOfTitle("SS");
		String actualSSCPrice = checkPricePage.getValueOfTitle("SSC");
		String actualHBPrice = checkPricePage.getValueOfTitle("HB");
		String actualSBPrice = checkPricePage.getValueOfTitle("SB");
		String actualSBCPrice = checkPricePage.getValueOfTitle("SBC");
		
		String expectedHSPrice = "310000";
		String expectedSSPrice = "335000";
		String expectedSSCPrice = "360000";
		String expectedHBPrice = "410000";
		String expectedSBPrice = "460000";
		String expectedSBCPrice = "510000";
		
		Assert.assertEquals(actualHSPrice,expectedHSPrice,"Price HS is incorrect");
		Assert.assertEquals(actualSSPrice,expectedSSPrice,"Price SS is incorrect");
		Assert.assertEquals(actualSSCPrice,expectedSSCPrice,"Price SSC is incorrect");
		Assert.assertEquals(actualHBPrice,expectedHBPrice,"Price HB is incorrect");
		Assert.assertEquals(actualSBPrice,expectedSBPrice,"Price SB is incorrect");
		Assert.assertEquals(actualSBCPrice,expectedSBCPrice,"Price SBC is incorrect");
	}
}
