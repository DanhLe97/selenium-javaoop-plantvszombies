package Railway;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constant.Constant;

public class RegisterTest extends BaseTest {
	
	@Test
	public void TC07() {
		Account acc = new Account();
		System.out.println("TC07-User can create new account");
		HomePage homePage = new HomePage();
		String actualMsg = homePage.open()
				.gotoRegisterPage()
				.registerSuccess(acc)
				.getRegisterSuccessMsg();
		String expectedMsg = "Thank you for registering your account";
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
	
	@Test
	public void TC08() {		
		System.out.println("TC08-User can't login with an account hasn't been activated");
		Account acc = new Account();
		HomePage homePage = new HomePage();
//		Pre-condition: Create a new account but do not activate it
		homePage.open().gotoRegisterPage().registerSuccess(acc);

		String actualMsg = homePage.open()
				.gotoLoginPage()
				.loginFailed(acc.getEmail(),acc.getPassword())
				.getErrorMessage();
		String expectedMsg = "Invalid username or password. Please try again.";
		
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
	
	@Test
	public void TC10() {
		System.out.println("User can't create account with an already in-use email.");
		HomePage homePage = new HomePage();
		Account acc = new Account();
//		Pre-condition: Create and activate a new account
		homePage.open()
				.gotoRegisterPage()
				.registerSuccess(acc)
				.goToConfirmMailPage()
				.login(Constant.MAILBOX_USERNAME, Constant.MAILBOX_PASSWORD)
				.activeAccount(acc.getEmail());
		
		String actualMsg = homePage.open()
				.gotoRegisterPage()
				.registerFailed(acc)
				.getRegisterErrorMsgAboveTheForm();
		String expectedMsg = "This email address is already in use.";
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
	
	@Test
	public void TC11() {
		System.out.println("User can't create account while password and PID fields are empty.");
		HomePage homePage = new HomePage();
		Account acc = new Account();
		RegisterPage registerPage = homePage.open()
				.gotoRegisterPage()
				.registerFailed(acc.getEmail(), "", "", "");
		
		String actualMsgAboveTheForm = registerPage.getRegisterErrorMsgAboveTheForm();
		String actualMsgNextToPasswordField = registerPage.getRegisterErrorMsgNextToPasswordField();
		String actualMsgNextToPidField = registerPage.getRegisterErrorMsgNextToPidField();

		String expectedMsgAboveTheForm = "There're errors in the form. Please correct the errors and try again.";
		String expectedMsgNextToPassword = "Invalid password length";
		String expectedMsgNextToPidField = "Invalid ID length";
	
		Assert.assertEquals(actualMsgAboveTheForm,expectedMsgAboveTheForm,"Error message is not displayed as expected");
		Assert.assertEquals(actualMsgNextToPasswordField,expectedMsgNextToPassword,"Error message is not displayed as expected");
		Assert.assertEquals(actualMsgNextToPidField,expectedMsgNextToPidField,"Error message is not displayed as expected");
	}

}
