package objects;

import static common.CommonWaits.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class Activities {
	WebDriver driver;

	public Activities(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);

	}

	@FindBy(xpath = "//button[@id=\"travelWidgetActivitiesTab\"]")
	WebElement activities;

	@FindBy(xpath = "//div[@id=\"travelWidgetActivitiesFormHeader\"]")
	WebElement title;

	@FindBy(xpath = "class=\"input-error\"")
	WebElement errorMessage;

	@FindBy(xpath = "//input[@id=\"activitiesDestination\"]")
	WebElement destination;

	@FindBy(xpath = "//input[@id=\"activitiesMonth\"]")
	WebElement month;

	@FindBy(xpath = "//button[@id=\"activitiesSearch\"]")
	WebElement searchBtn;

	public void clickOnActivitiesTab() {
		click(activities);
	}

	public void validateTitle(String expected) {
		waitUntilVisible(title);
		Assert.assertEquals(getText(title), expected);
	}

	public void validateErrorMesage(String expected) {
		waitUntilVisible(activities);
	}

	public void validateErrorMessage(String expected) {
		waitUntilVisible(errorMessage);
	}

	public void insertDestination(String value) {
		insert(destination, value);
	}

	public void insertMonth(String value) {
		insert(month, value);
	}

	public void clickOnSearchButton() {
		click(searchBtn);
	}

}
