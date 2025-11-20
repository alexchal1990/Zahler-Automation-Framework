package package Test.Functional_TC;

import Base.BaseT;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.CreateTransactionPage;
import main.resources.config.ConfigReader;

public class Create_Transaction extends BaseT {

	@Test
	public void userCanCreateTransaction() {

		// Login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(ConfigReader.get("email"), ConfigReader.get("password"));

		// Create transaction
		CreateTransactionPage transactionPage = new CreateTransactionPage(driver);
		transactionPage.openNewTransactionPage();

		transactionPage.createTransaction("15/08/2035", "1500", "Office expenses");

		// Validate result
		String message = transactionPage.getMessage();

		Assert.assertTrue(message.trim().length() > 0, "Transaction was not created — no confirmation message!");

		System.out.println("Transaction message: " + message);
	}
}
