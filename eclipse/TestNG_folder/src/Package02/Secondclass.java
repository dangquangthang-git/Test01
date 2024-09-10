package Package02;

import org.testng.annotations.Test;

public class Secondclass {
	@Test(priority = 1)
	public void alo() {
		System.out.println("hello");
	}
	@Test(priority = 0)
	public void blo() {
		System.out.println("ádfasdf");
	}
}
