package Railway;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Utilities;
import Constant.Constant;

public class ChangePasswordTest extends BaseTest {
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
	public void TC09() {
		System.out.println("TC09-User can't change password when \"New Password\" and \"Confirm Password\" are different.");
		
		String actualMsg = homePage.open()
				.gotoLoginPage()
				.login(acc.getEmail(),acc.getPassword())
				.gotoChangePasswordPage()
				.submitChangePasswordForm(acc.getPassword(), Utilities.getRandomString(), Utilities.getRandomString())
				.getErrorMessage();
		
		String expectedMsg = "Password change failed. Please correct the errors and try again.";
		
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
	@Test
	public void TC12() {
		System.out.println("Errors display when password reset token is blank");
		
		String newPassword = Utilities.getRandomString();

		String actualMsg = homePage.open()
				.gotoLoginPage()
				.gotoForgotPasswordPage()
				.submitEmail(acc.getEmail())
				.goToConfirmMailPage()
				.login(Constant.MAILBOX_USERNAME, Constant.MAILBOX_PASSWORD)
				.activeNewPassword(acc.getEmail(),2)
				.submiPasswordChangeForm(newPassword,newPassword)
				.getErrorMessageAbovetheForm();
		
		String expectedMsg = "The password reset token is incorrect or may be expired. Visit the forgot password page to generate a new one.";	
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
	@Test
	public void TC13() {
		System.out.println("Errors display if password and confirm password don't match when resetting password");

		String actualMsg = homePage.open()
				.gotoLoginPage()
				.gotoForgotPasswordPage()
				.submitEmail(acc.getEmail())
				.goToConfirmMailPage()
				.login(Constant.MAILBOX_USERNAME, Constant.MAILBOX_PASSWORD)
				.activeNewPassword(acc.getEmail(),2)
				.submiPasswordChangeForm(Utilities.getRandomString(),Utilities.getRandomString())
				.getErrorMessageAbovetheForm();
		String expectedMsg = "Could not reset password. Please correct the errors and try again.";	
		Assert.assertEquals(actualMsg,expectedMsg,"Error message is not displayed as expected");
	}
}
