package Package01;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass extends Secondclass{
	@Test
	public void firstmethod() {
		System.out.println("this is first method of firstclass");
	}

	@Test
	public void secondmethod() {
		System.out.println("this is second method of firstclass");
	}

}
