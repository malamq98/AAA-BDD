package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import util.Browser;

public class Hook {

	static TestBase testBase;

	@BeforeAll
	public static void beforeAllHook() {
		testBase = new TestBase();
	}

	@Before
	public static void beforeHook() {
		testBase.beforeEachTest(Browser.CHROME);
	}

	@AfterAll
	public static void afterAllHook() {
		System.gc();
	}

	@After
	public static void afterHook(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte [] ss = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss, "image/png", "error.png");
		}
		testBase.closingBrowser();
	}

}
