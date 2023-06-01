package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.HomePage;
import objects.Activities;
import objects.Cars;
import objects.Cruises;
import objects.Flights;
import objects.HomeQuote;
import objects.Hotels;
import objects.Life;
import objects.LogIn;
import objects.Packages;
import util.Configuration;
import util.Key;
import static util.Key.*;
import static util.Browser.*;

public class TestBase {

	protected static WebDriver driver;
	protected static HomePage homePage;
	protected static LogIn logIn;
	protected HomeQuote homeQuote;
	protected Hotels hotels;
	protected Flights flights;
	protected Cars cars;
	protected Packages packages;
	protected Cruises  cruises;
	protected Activities activities;
	protected Life life;

	Configuration conf = new Configuration();

	public void beforeEachTest(String browserName) {
		// String browserName = conf.readProp(getValue(browser));
		initiatDriver(browserName);
		initObject();
		driver.manage().window().maximize();
		int pageLoadTime = conf.readPropNum(getValue(pageLoad));
		int implicitLoadTime = conf.readPropNum(getValue(implicitLoad));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitLoadTime));
		String urlName = conf.readProp(getValue(url));
		driver.get(urlName);
	}

	public void initiatDriver(String browser) {
		switch (browser) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
	}

	protected void initObject() {
		homePage = new HomePage(driver);
        logIn = new LogIn(driver);
        homeQuote = new HomeQuote(driver);
        hotels = new Hotels(driver);
        flights = new Flights(driver);
        cars = new Cars(driver);
        packages = new Packages(driver);
        cruises = new Cruises(driver);
        activities = new Activities(driver);
        life = new Life(driver);

	}

	public void closingBrowser() {
		driver.quit();
	}

	private String getValue(Key key) {
		return key.name();
	}

}
