package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_User {

	public Register_User(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebDriver driver;

	@FindBy(css = "a[href='/register']")
	private WebElement registerBtn;

	@FindBy(id = "email")
	private WebElement emailInput;

	@FindBy(id = "password")
	private WebElement passwordInput;

	@FindBy(id = "password_confirmation")
	private WebElement passwordConfirmInput;

	@FindBy(css = "input[value='Register']")
	private WebElement submitBtn;

	@FindBy(xpath = "//main/div")
	private WebElement successMessage;

	public void openRegisterForm() {
		registerBtn.click();
	}

	public void register(String email, String password) {
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
		passwordConfirmInput.sendKeys(password);
		submitBtn.click();
	}

	public String getSuccessMessage() {
		return successMessage.getText();
	}
}
