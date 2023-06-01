package objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonWaits.*;
import static common.CommonActions.*;

public class Life {
	
	WebDriver driver;
	
	public Life(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
		
	}
	
	
	@FindBy(xpath = "//button[@id=\"insuranceWidgetLifeTab\"]")
	WebElement lifeTab;
	
	@FindBy(xpath = "//div[@id=\"insuranceWidgetLifeFormHeader\"]")
	WebElement title;
	
	@FindBy(xpath = "//a[text()='Get a quote']")
	WebElement getAQuote;
	
	@FindBy(tagName = "//h2")
	WebElement insuranceProducts;
	
	
	
	public void clickOnLifeTab() {
		click(lifeTab);
	}
	
	
	public void validateTitle(String expected) {
		waitUntilVisible(lifeTab);
		Assert.assertEquals(getText(title), expected);
	}
	
	public void clickOnGetAQuoteBtn() {
		click(getAQuote);
	}
	
	
	
//	public void selectInsuranceProduct(WebElement element ) {
//		   //whic method should i use here
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
