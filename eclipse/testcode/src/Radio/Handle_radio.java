package Radio;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

import org.openqa.selenium.JavascriptExecutor;

import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Handle_radio {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://id-uat.ipas.com.vn/login?&redirect-app=dsb-web");
		WebElement username = driver.findElement(By.id("username"));
		username.click();

		username.sendKeys("ipa\\a.ae");
		WebElement password = driver.findElement(By.id("password"));
		password.click();
		password.sendKeys("Dsb@2024");

		driver.findElement(By.id("btn-login")).click();

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());

		/*for (int i = 1; i < checkbox.size(); i++) {
			WebElement isSelected = checkbox.get(i);
			if (isSelected.isSelected() == false) {
				System.out.println("Chưa được check"); 
				isSelected.click();
				System.out.println("Vừa được check");
			} else {
				System.out.println("Đã check cả rồi");
			}
		}*/
		for (int i = 1; i < 4; i++) {
			WebElement option = checkbox.get(i);
			System.out.println("Option thứ " + i + " đã được chọn");
		}
	}

}
