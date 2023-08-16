package Railway;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Utilities;
import Constant.Constant;

public class FinalTestTestCases extends BaseTest {
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
	public void FTTC01() {
		System.out.println("User can filter Manager ticket table with Depart Date");
		
		String actualMsg = homePage.open()
				.gotoLoginPage()
				.login(acc.getEmail(), acc.getPassword())
				.gotoBookTicketPageAfterLogin()
				.bookMultipleTickets(Ticket.Station.NHATRANG,Ticket.Station.SAIGON, Ticket.SeatType.SOFTSEATWITHAIRCONDITIONER,"1",6)
				.gotoMyticketPage()
				.getTxtSuccessMessage();
		String expectedMsg = "You currently book 6 tickets, you can book 4 more.";
		Assert.assertEquals(actualMsg,expectedMsg,"Success message is not displayed as expected");	
}
	@Test
	public void FTTC02() {
		System.out.println("Errors display when user reset password with an expires password reset token");
		String newPassword = Utilities.getRandomString();
		PasswordChangePage passwordChangePage = homePage.open()
				.gotoLoginPage()
				.gotoForgotPasswordPage()
				.submitEmail(acc.getEmail())
				.goToConfirmMailPage()
				.login(Constant.MAILBOX_USERNAME, Constant.MAILBOX_PASSWORD)
				.activeNewPassword(acc.getEmail(),2)
				.submiPasswordChangeForm(newPassword,newPassword)
				.goToConfirmMailPage()
				.login(Constant.MAILBOX_USERNAME, Constant.MAILBOX_PASSWORD)
				.activeNewPassword(acc.getEmail(),3)
				.submiPasswordChangeForm(newPassword, newPassword);
		String actualErrorMsgAbovetheForm = passwordChangePage.getErrorMessageAbovetheForm();
		String actualErrorMsgNexttoTokenField = passwordChangePage.getErrorMessageNexttoTokenField();
		String expectedErrorMsgAbovetheForm = "The password reset token is incorrect or may be expired. Visit the forgot password page to generate a new one.";
		String expectedErrorMsgNexttoTokenField = "The password reset token is invalid.";
		Assert.assertEquals(actualErrorMsgAbovetheForm,expectedErrorMsgAbovetheForm,"Success message is not displayed as expected");	
		Assert.assertEquals(actualErrorMsgNexttoTokenField,expectedErrorMsgNexttoTokenField,"Success message is not displayed as expected");	
	}
}