package Test.Forgot_Pass_TC;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseT;
import PageObject.Forgot_Password;

public class Forgot_password extends BaseT {

	@Test
	public void userCanRequestPasswordReset() {

		String email = "kalitest221@gmail.com";

		Forgot_Password forgotPasswordPage = new Forgot_Password(driver);

		// Open forgot password page
		forgotPasswordPage.open();

		// Submit reset request
		forgotPasswordPage.requestPasswordReset(email);

		// Validate that some feedback message is shown
		String msg = forgotPasswordPage.getMessage();

		Assert.assertTrue(msg != null && msg.trim().length() > 0, "No password reset message was displayed!");

		System.out.println("Forgot password message: " + msg);
	}
}
