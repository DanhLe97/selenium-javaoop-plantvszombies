package Railway;

import org.testng.annotations.Test;
import org.testng.Assert;
import Constant.Constant;

public class LoginTest extends BaseTest {
	
	@Test
	public void TC01() {
		System.out.println("TC01-User can log into Railway with valid username and password");
		HomePage homePage = new HomePage();
		String actualMsg = homePage.open()
				.gotoLoginPage()
				.login(Constant.USERNAME, Constant.PASSWORD)
				.getWelcomeMessage();
		
		String expectedMsg = "Welcome "+Constant.USERNAME;
		
		Assert.assertEquals(actualMsg,expectedMsg,"Welcome message is not displayed as expected");
	}
	
	@Test
	public void TC02() {
		System.out.println("TC02-User can't login with blank \"Username\" textbox");
		HomePage homePage = new HomePage();
		String actualMsg = homePage.open()
				.gotoLoginPage()
				.loginFailed("", Constant.PASSWORD)
				.getErrorMessage();
		String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
		
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
	@Test
	public void TC03(){
		System.out.println("TC03-User cannot log into Railway with invalid password");
		HomePage homePage = new HomePage();
		Account acc = new Account();
		String actualMsg = homePage.open()
				.gotoLoginPage()
				.loginFailed(Constant.USERNAME, acc.getPassword())
				.getErrorMessage();
		String expectedMsg = "Invalid username or password. Please try again.";
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
	@Test 
	public void TC04() {
		System.out.println("TC04-User is redirected to Book ticket page after logging in");
		HomePage homePage = new HomePage();
		String actualUrl = homePage.open()
				.gotoBookTicketPageBeforeLogin()
				.loginBookTicket(Constant.USERNAME, Constant.PASSWORD)
				.getUrlBookTicketPage();
		
		String expectedUrl = "http://railwaysg2.somee.com/Page/BookTicketPage.cshtml";
		
		Assert.assertEquals(actualUrl,expectedUrl,"Actual url is different from expected Url");
	}

	@Test
	public void TC05(){
		System.out.println("TC05-System shows message when user enters wrong password several times");
		
		HomePage homePage = new HomePage();
		Account acc = new Account();
		
		String actualMsg = homePage.open()
				.gotoLoginPage()
				.loginMultipleTimes(Constant.USERNAME, acc.getPassword(), 4)
				.getErrorMessage();
		String expectedMsg = "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
		
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
	
	@Test
	public void TC06(){
		System.out.println("TC06-User is redirected to Home page after logging out");
		HomePage homePage = new HomePage();
		String actualUrl = 	homePage.open()
				.gotoLoginPage()
				.login(Constant.USERNAME, Constant.PASSWORD)
				.gotoContactPage()
				.gotoLogoutPage()
				.getUrlHomePage();

		String expectedUrl = "http://railwaysg2.somee.com/Page/HomePage.cshtml";
		
		Assert.assertEquals(actualUrl,expectedUrl,"Actual url is different from expected Url");
	}	
}
