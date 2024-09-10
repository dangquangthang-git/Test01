package Test_baocao;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class baocao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

		// Log in
		driver.navigate().to("https://id-uat.ivnd.com.vn/login?&redirect-app=dsb-web-dev");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("ipa\\a.ae");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Dsb@2024");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);

		// Tìm kiếm khách hàng
		WebElement T0 = driver.findElement(By.xpath("//span[contains(.,'T0')]"));
		T0.click();
		WebElement SearchbyCustId = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		SearchbyCustId.sendKeys("0001672472");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(.,'Tìm kiếm')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ivnd-typography hover:underline'][contains(.,'Vũ Duy Long')]"))
				.click();
		Thread.sleep(2000);

		// Chuyển qua cửa sổ mới mở
		Set<String> windowHandles = driver.getWindowHandles();
		String originalWindowHandle = driver.getWindowHandle();

		for (String handle : windowHandles) {
			if (!handle.equals(originalWindowHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}

		WebElement a = driver.findElement(By.xpath("//div[@aria-controls='rc-tabs-1-panel-BANK_ACCOUNT']"));
		String verify_text = a.getText();
		System.out.println(verify_text);

		if (verify_text.equals("Tài khoản thụ hưởng")) {
			System.out.println("Verified");
		} else {
			System.out.println("Not correct");
		}

		// Truy cập thẻ hồ sơ tài sản
		WebElement asset_profile = driver
				.findElement(By.xpath("//div[@aria-controls='rc-tabs-0-panel-ASSET_PROFILE']"));
		asset_profile.click();
		// Tắt pop up
		WebElement popup = driver.findElement(By.xpath("//button[@class=\"reactour__close-button\"]"));
		popup.click();
		Thread.sleep(2000);

		// Chọn tài khoản: 0001631501

		WebElement selectElement = driver.findElement(By.xpath("//div[@class='ivnd-select-selector']"));

		selectElement.click();
		Thread.sleep(2000);

		WebElement option = driver.findElement(By.xpath("//div[@title=\"0001631501\"]"));
		option.click();

		boolean account = selectElement.isDisplayed();

		if (account == true) {
			if (selectElement.getText().equals("0001631501")) {
				System.out.println("Chọn đúng tài khoản");
			}
		} else {
			System.out.println("Chưa chọn đúng account");
		}

		// Xuất báo cáo excel
		WebElement excel = driver.findElement(By.xpath("//button[contains(.,'Xuất excel')]"));
		excel.click();
		// Xuất báo cáo pdf

		WebElement pdf = driver.findElement(By.xpath("//button[contains(.,'In báo cáo')]"));
		pdf.click();

	}

}
