package testcode;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_web {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://id-uat.ipas.com.vn/login?&redirect-app=dsb-web");
		WebElement username =driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("ipa\\a.ae");
		WebElement password =driver.findElement(By.id("password"));
		password.click();
		password.sendKeys("Dsb@2024");
		driver.findElement(By.id("btn-login")).click();
		
		
		
		
		
		Thread.sleep(5000);

	}

}
