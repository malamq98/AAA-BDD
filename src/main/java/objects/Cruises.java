package objects;

import static common.CommonWaits.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class Cruises {
	WebDriver driver;

	public Cruises(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//button[@id=\"travelWidgetCruisesTab\"]")
	WebElement cruisesTab;

	@FindBy(xpath = "//div[@id=\"travelWidgetCruisesFormHeader\"]")
	WebElement title;

	@FindBy(xpath = "//div[@id=\"cruisesDestination\"]")
	WebElement destination;

	@FindBy(xpath = "//div[@id=\"cruisesCruiseLine\"]")
	WebElement cruiseLine;

	@FindBy(xpath = "//div[@id=\"cruisesDuration\"]")
	WebElement duration;

	@FindBy(xpath = "//div[@class=\"combobox-input\" and @id=\"cruisesDate\"]")
	WebElement date;

	@FindBy(xpath = "//div[@id=\"cruisesTravelers\"]")
	WebElement travelers;

	@FindBy(xpath = "//button[@id=\"cruisesSearch\"]")
	WebElement searchBtn;

	public void clickOnCruisesTab() {
		click(cruisesTab);
	}

	public void validateTitle(String expected) {
		waitUntilVisible(title);
		Assert.assertEquals(getText(title), expected);
	}

	public void selectDestination(String value) {
		dropdown(destination, value);
	}

	public void selectCruiseLine(String value) {
		dropdown(cruiseLine, value);
	}

	public void selectDuration(String value) {
		dropdown(duration, value);
	}

	public void selectDate(String value) {
		dropdown(date, value);
	}

	public void selecteNumbersOfTravelers(String value) {
		dropdown(travelers, value);
	}

	public void clickOnSearchButton() {
		click(searchBtn);
	}

}
