package objects;

import static common.CommonWaits.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) { // create a constructor
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//span[text()='Get an auto quote']")
	WebElement getAutoQuoteBtn;

	@FindBy(xpath = "//input[@id=\"FirstName\"]")
	WebElement firstNameFld;

	@FindBy(xpath = "//input[@id=\"LastName\"]")
	WebElement lastnameFld;

	@FindBy(xpath = "//div[@class=\"buttonText\" and text()= 'Next']")
	WebElement nextBtn;

	@FindBy(xpath = "//input[@id=\"BirthDate\"]")
	WebElement birthdatElement;

	@FindBy(xpath = "//div[@id=\"MUISelect-Gender\"]")
	WebElement genderFld;

	@FindBy(xpath = "//input[@id=\"AgeFirstLicensed\"]")
	WebElement ageFirstLicensed;

	@FindBy(xpath = "//div[@id=\"MUISelect-MaritalStatus\"]")
	WebElement maritalStatus;

	@FindBy(xpath = "//div[@class=\"buttonText\" and text()= 'Next']")
	WebElement next;

	public void clickOnGetAutoQuoteBtn() {
		click(getAutoQuoteBtn);
	}

	public void insertFirstName(String name) {
		insert(firstNameFld, name);
	}

	public void insertLastName(String name) {
		insert(lastnameFld, name);
	}

	public void clickOnNextBtn() {
		click(nextBtn);
	}

	public void insertBirthDate(String birthDate) {
		insert(birthdatElement, birthDate);
	}

	public void selectGender(String gender) {
		dropdown(genderFld, gender);
	}

	public void insertAgeInFirsrLicensed(String age) {
		insert(ageFirstLicensed, age);
	}

	public void selectMaritalStatus(String value) {
		dropdown(maritalStatus, value);
	}

	public void clickOnNext() {
		click(next);
	}

}
