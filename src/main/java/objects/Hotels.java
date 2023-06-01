package objects;

import static common.CommonWaits.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class Hotels {

	WebDriver driver;

	public Hotels(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//button[@id=\"travelWidgetHotelsTab\"]")
	WebElement hotels;

	@FindBy(xpath = "//div[@id=\"travelWidgetHotelsFormHeader\"]")
	WebElement title;

	@FindBy(xpath = "//input[@id=\"hotelsDestination\"]")
	WebElement destinationFld;

	@FindBy(xpath = "//div[@id=\"hotelsRooms\"]")
	WebElement roomsFld;

	@FindBy(xpath = "//input[@id=\"hotelsCheckIn\"]")
	WebElement checkIn;

	@FindBy(xpath = "//input[@id=\"hotelsCheckOut\"]")
	WebElement check_out;

	@FindBy(xpath = "//button[@id=\"hotelsSearch\"]")
	WebElement searchBtn;

	@FindBy(xpath = "//div[@class=\"input-error\"]")
	WebElement errorMessage;

	@FindBy(xpath = "//div[@class=\"input-error\"]")
	WebElement checkInError;

	public void clickOnHotelsTab() {
		click(hotels);
	}

	public void validateTitle(String expected) {
		waitUntilVisible(title);
		Assert.assertEquals(getText(title), expected);
	}

	public void insertLocationInDestiantionFld(String location) {
		insert(destinationFld, location);
	}

	public void select_numbersOf_rooms(String value) {
		insert(roomsFld, value);
	}

	public void select_date_checkIn(String date) {
		dropdown(checkIn, date);
	}

	public void select_check_out_date(String date) {
		dropdown(check_out, date);
	}

	public void validateErrorMessage(String expected) {
		waitUntilVisible(errorMessage);
		Assert.assertEquals(getText(errorMessage), expected);
	}

	public void validateCheckInErrorMessage(String expected) {
		waitUntilVisible(checkInError);
		Assert.assertEquals(getText(checkInError), expected);
	}

	public void clickOnSearchBtn() {
		click(searchBtn);
	}

}
