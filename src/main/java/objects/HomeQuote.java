package objects;

import static common.CommonWaits.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomeQuote {

	WebDriver driver;

	public HomeQuote(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(tagName = "//h1")
	WebElement title;

	@FindBy(xpath = "//button[@id=\"insuranceWidgetHomeTab\"]")
	WebElement homeTab;

	@FindBy(xpath = "//a[@class=\"widget-primary-cta\"]")
	WebElement getAQuoteBtn;

	@FindBy(xpath = "id=\"MoveToPropertyPage\"")
	WebElement EnterPropertyInformation;

	@FindBy(xpath = "//div[@class=\"errorSummary\"]")
	WebElement alertError;

	@FindBy(xpath = "//label[@for=\"autoPolicy\"]")
	WebElement do_you_have_auto_policy;

	@FindBy(xpath = "//input[@id=\"FirstName_0\"]")
	WebElement firstName;

	@FindBy(xpath = "//input[@id=\"LastName_0\"]")
	WebElement lastName;

	@FindBy(xpath = "//input[@id=\"InsuredBirthdate_0\"]")
	WebElement dob;

	@FindBy(xpath = "//label[@id=\"residenceCoOwnedLabel\"]")
	WebElement residenceCoOwnedLabel;

	@FindBy(xpath = "//input[@id=\"residenceStreet\"]")
	WebElement steetAddress;

	@FindBy(xpath = "//input[@id=\"residenceZip\"]")
	WebElement zipCodeFld;

	@FindBy(xpath = "//label[text()='Phone Type']")
	WebElement phoneType;

	@FindBy(xpath = "//input[@id=\"phone\"]")
	WebElement phoneNumberFld;

	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement emailFld;

	@FindBy(xpath = "id=\"MoveToPropertyPage\"")
	WebElement EnterPropertyInformation1;

	public void validateHomepageTitle(String expected) {
		waitUntilVisible(title);
		Assert.assertEquals(getText(title), expected);

	}

	public void clickOnHomeTab() {
		click(homeTab);
	}

	public void clickOnGetAquoteBtn() {
		click(getAQuoteBtn);
	}

	public void clickOnPropertyInformationBtn() {
		click(EnterPropertyInformation);
	}

	public void validateAlertErrorMsg(String expected) {
		waitUntilVisible(alertError);
		Assert.assertEquals(getText(alertError), expected);
	}

	public void select_do_you_have_auto_policy(String value) {
		dropdown(do_you_have_auto_policy, value);
	}

	public void insertFirstName(String firstname) {
		insert(firstName, firstname);
	}

	public void insertLastName(String lastname) {
		insert(lastName, lastname);
	}

	public void insertDateOfBirth(String value) {
		insert(dob, value);
	}

	public void select_residence_coOwned(String value) {
		dropdown(residenceCoOwnedLabel, value);
	}

	public void insertStreetAddress(String address) {
		insert(steetAddress, address);
	}

	public void insertZipCode(String zipcode) {
		insert(zipCodeFld, zipcode);
	}

	public void selectPhoneType(String value) {
		dropdown(phoneType, value);
	}

	public void insertPhoneNumInPhoneFld(String number) {
		insert(phoneNumberFld, number);
	}

	public void insertEmailAddressInEmailFld(String email) {
		insert(emailFld, email);
	}

	public void clickOnPropertyInformation() {
		click(EnterPropertyInformation1);
	}

}
