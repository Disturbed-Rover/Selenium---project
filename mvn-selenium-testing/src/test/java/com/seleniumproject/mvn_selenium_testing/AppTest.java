package com.seleniumproject.mvn_selenium_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satyam.singh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.navigate().to("https://google.in");
		String e = "Google";
		String a = driver.getTitle();
		System.out.println("Before Assertion"+" "+e+" "+a);
		Assert.assertEquals(e, a);
		System.out.println("After Assertion"+" "+e+" "+a);
		System.out.println("completed");
	}
}
