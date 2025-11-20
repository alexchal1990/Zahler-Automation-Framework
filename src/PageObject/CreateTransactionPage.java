package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTransactionPage {

	public CreateTransactionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebDriver driver;

	@FindBy(css = "a[href='/transactions/new']")
	private WebElement newTransactionBtn;

	@FindBy(id = "account_transaction_transacted_at")
	private WebElement dateInput;

	@FindBy(id = "account_transaction_amount_in_pence")
	private WebElement amountInput;

	@FindBy(id = "account_transaction_description")
	private WebElement descriptionInput;

	@FindBy(id = "account_transaction_account_credited_id")
	private WebElement accountDropdown;

	@FindBy(css = "label[for='account_transaction_account_credited_id'] option[value='6']")
	private WebElement accountOption6;

	@FindBy(css = "input[data-disable-with='Post ledger entries']")
	private WebElement postEntryBtn;

	@FindBy(xpath = "//main/div")
	private WebElement messageBox;

	public void openNewTransactionPage() {
		newTransactionBtn.click();
	}

	public void createTransaction(String date, String amount, String description) {
		dateInput.sendKeys(date);
		amountInput.sendKeys(amount);
		descriptionInput.sendKeys(description);
		accountDropdown.click();
		accountOption6.click();
		postEntryBtn.click();
	}

	public String getMessage() {
		return messageBox.getText();
	}
}
