package Test.User_TC;

import org.testng.Assert;
import org.testng.annotations.Test;
import main.resources.config.ConfigReader;
import Base.BaseT;
import PageObject.LoginPage;

public class LogIn_LogOut extends BaseT {

	// Sign In
	@Test
	public void userCanLoginSuccessfully() {
		LoginPage loginPage = new LoginPage(driver);

		String email = ConfigReader.get("email");
		String password = ConfigReader.get("password");

		loginPage.login(email, password);

		String msg = loginPage.getMessage();

		Assert.assertTrue(msg.trim().length() > 0, "Login success message not displayed!");
	}

	@Test
	public void loginFailsWithInvalidPassword() {

		LoginPage loginPage = new LoginPage(driver);

		String email = ConfigReader.get("email");

		loginPage.login(email, "WrongPassword123!");

		Assert.assertTrue(loginPage.isInvalidLoginMessage(), "Invalid login error message not shown!");
	}

	@Test
	public void userCanLogoutSuccessfully() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login(ConfigReader.get("email"), ConfigReader.get("password"));

		loginPage.logout();

		String logoutMsg = loginPage.getMessage();

		Assert.assertTrue(logoutMsg.trim().length() > 0, "Logout message not displayed!");
	}
}
