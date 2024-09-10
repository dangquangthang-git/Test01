package Radio;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.RouteSelector.Selection;

import org.openqa.selenium.JavascriptExecutor;

import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CRM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://crm.anhtester.com/admin/authentication");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("admin@example.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Projects')]")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//select[@name='projects_length']"));

		Select getAllOption = new Select(element);
		List<WebElement> getAll=getAllOption.getOptions();
	
		
		for (int i = 0; i < getAll.size(); i++) {
			System.out.println(getAll.get(i).getAttribute("value"));
			
		}
		
		getAllOption.selectByIndex(3);

		
		if (getAllOption.getFirstSelectedOption().getText().equals("100")) {
			System.out.println("Chọn đúng");
		}else {
			System.out.println("Chọn sai");
		}
		

	}

}
