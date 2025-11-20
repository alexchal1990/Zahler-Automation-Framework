package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_Password {

	public Forgot_Password(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebDriver driver;

	@FindBy(css = "a[href='/identity/password_reset/new']")
	private WebElement forgotPasswordLink;

	@FindBy(id = "email")
	private WebElement emailInput;

	@FindBy(css = "input[type='submit']")
	private WebElement submitButton;

	// This is the message (error or info message)
	@FindBy(css = "div.mb-4.text-red-600.font-bold.border.p-4")
	private WebElement messageBox;

	public void open() {
		forgotPasswordLink.click();
	}

	public void requestPasswordReset(String email) {
		emailInput.clear();
		emailInput.sendKeys(email);
		submitButton.click();
	}

	public String getMessage() {
		return messageBox.getText();
	}
}
