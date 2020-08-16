package com.seleniumproject.mvn_selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satyam.singh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.navigate().to("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		String Pagetitle = driver.getTitle();
		System.out.println(Pagetitle);
		driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		System.out.println("Username is filled");
		driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
		System.out.println("Password is filled");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("clicke the login button");
		String Pagetitle2 = driver.getTitle();
		System.out.println(Pagetitle2);
	}
}
