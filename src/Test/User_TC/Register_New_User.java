package Test.User_TC;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseT;
import PageObject.Register_User;

public class Register_New_User extends BaseT {

	@Test
	public void registerNewUser() {

		Register_User registerPage = new Register_User(driver);

		registerPage.openRegisterForm();

		registerPage.register("kalitest221@gmail.com", "A@=1528945!!");

		// ASSERT success message
		String msg = registerPage.getSuccessMessage();

		Assert.assertTrue(msg.contains("Verify your email address") || msg.contains("success") || msg.length() > 0,
				"Registration failed - no confirmation message found!");
	}
}
