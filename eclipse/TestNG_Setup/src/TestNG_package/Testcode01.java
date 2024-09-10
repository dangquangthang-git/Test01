package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Testcode01 {
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Chromedriver\\\\chromedriver-win64\\\\chromedriver.exe");
	}

	@Test
	public void demo1() {
		driver.navigate().to("https://anhtester.com/blog/selenium-java/selenium-java-bai-9-cai-dat-va-su-dung-testng-framework");
	}

	@Test
	public void demo2() {
		driver.navigate().to("https://dsb-careby-uat.vndirect.com.vn/customer-management/customer/list-careby-customer");
	}

	@Test
	public void demo3() {
		driver.navigate().to("https://tech.vndirect.com.vn/pages/viewpage.action?pageId=898171495");
	}

	@AfterTest
	public void afterTest() {

	}

}
