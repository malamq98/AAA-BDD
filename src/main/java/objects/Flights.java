package objects;

import static common.CommonWaits.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class Flights {

	WebDriver driver;

	public Flights(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//button[@id=\"travelWidgetFlightsTab\"]")
	WebElement flightsTab;

	@FindBy(xpath = "//div[@id=\"travelWidgetFlightsFormHeader\"]")
	WebElement title;

	@FindBy(xpath = "//input[@id=\"flightsOneWay\"]")
	WebElement oneway;

	@FindBy(xpath = "//input[@id=\"flightsOrigin\"]")
	WebElement flyingFrom;

	@FindBy(xpath = "//input[@id=\"flightsDestination\"]")
	WebElement goingTo;

	@FindBy(xpath = "//input[@id=\"flightsDeparting\"]")
	WebElement departing;

	@FindBy(xpath = "//div[@id=\"flightsAdults\"]")
	WebElement adults;

	@FindBy(xpath = "//button[@id=\"flightsChildren\"]")
	WebElement children;

	@FindBy(xpath = "//button[@id=\"flightsSearch\"]")
	WebElement searchBtn;

	public void clickOnFlightsTab() {
		click(flightsTab);
	}

	public void validateTitle(String expected) {
		waitUntilVisible(title);
		Assert.assertEquals(getText(title), expected);
	}

	public void clickOneWay() {
		click(oneway);
	}

	public void insert_in_flying_from_fld(String destination) {
		insert(flyingFrom, destination);
	}

	public void insert_in_going_to_fld(String destination) {
		insert(goingTo, destination);
	}

	public void selectDepartingDate(String date) {
		dropdown(departing, date);
	}

	public void selec_numbers_of_adults(String value) {
		dropdown(adults, value);
	}

	public void select_numbers_of_children(String value) {
		dropdown(children, value);
	}

	public void clickOnSearchBtn() {
		click(searchBtn);
	}

}
