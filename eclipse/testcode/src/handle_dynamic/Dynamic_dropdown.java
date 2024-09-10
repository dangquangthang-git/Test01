package handle_dynamic;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.RouteSelector.Selection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.Checkbox;
import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dynamic_dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@class='main-search-input-item user-chosen-select-container']"));
		element.click();
		Thread.sleep(1000);
		WebElement inputcountryElement = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		inputcountryElement.sendKeys("Vietnam");

		//Khai báo đói tượng thuộc lớp Actions để handle đối tượng 
		Actions actions = new Actions(driver);
		//Dùng hàm build để xây dựng action, hàm perform để xác nhận hành động đó
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

	}

}
