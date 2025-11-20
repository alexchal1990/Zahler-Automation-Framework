package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebDriver driver;

	@FindBy(id = "email")
	private WebElement emailInput;

	@FindBy(id = "password")
	private WebElement passwordInput;

	@FindBy(css = "input[value='Login']")
	private WebElement loginBtn;

	@FindBy(xpath = "//main/div")
	private WebElement loginMessage;

	// Success or error message box
	@FindBy(xpath = "//main/div")
	private WebElement messageBox;

	@FindBy(css = "input[value='Logout']")
	private WebElement logoutBtn;

	public void login(String username, String password) {
		emailInput.clear();
		emailInput.sendKeys(username);
		passwordInput.clear();
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

	public String getLoginMessage() {
		return loginMessage.getText();
	}

	public String getErrorMessage() {
		return messageBox.getText();
	}

	public void logout() {
		logoutBtn.click();
	}

	public String getLogoutMessage() {
		return loginMessage.getText();
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isInvalidLoginMessage() {
		String msg = messageBox.getText().toLowerCase().trim();
		return msg.contains("invalid") || msg.contains("incorrect") || msg.contains("failed") || msg.contains("error")
				|| msg.length() > 0;
	}
}
