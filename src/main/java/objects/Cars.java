package objects;

import static common.CommonWaits.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class Cars {
	WebDriver driver;

	public Cars(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//button[@id=\"travelWidgetCarsTab\"]")
	WebElement carsTab;
	
	@FindBy(xpath = "//div[@id=\"travelWidgetCarsFormHeader\"]")
	WebElement title;

	@FindBy(className = "\"left-icon-padding\"")
	WebElement pickUpLocation;

	@FindBy(xpath = "//input[@id=\"carsPickUpDate\"]")
	WebElement pickUpDate;

	@FindBy(xpath = "//div[@class=\"combobox-input\" and @id=\"carsPickUpTime\"]")
	WebElement pickUpTime;

	@FindBy(xpath = "//input[@id=\"carsReturnDate\"]")
	WebElement returnDate;

	@FindBy(xpath = "//div[@class=\"combobox-input\" and @id=\"carsReturnTime\"]")
	WebElement returnTime;

	@FindBy(xpath = "//button[@class=\"widget-primary-cta\"]")
	WebElement searchBtn;

	public void clickOnCarsTab() {
		click(carsTab);
	}
	
	public void validateTitle(String expected) {
		waitUntilVisible(title);
		Assert.assertEquals(getText(title), expected);
	}

	public void insertPickUpLocation(String location) {
		insert(pickUpLocation, location);

	}

	public void selectPickUpDate(String date) {
		dropdown(pickUpDate, date);
	}

	public void selectPickUpTime(String time) {
		dropdown(pickUpTime, time);
	}

	public void selectReturnDate(String date) {
		dropdown(returnDate, date);
	}

	public void selectReturnTime(String time) {
		dropdown(returnTime, time);
	}

	public void clickOnSearchBtn() {
		click(searchBtn);
	}

}
