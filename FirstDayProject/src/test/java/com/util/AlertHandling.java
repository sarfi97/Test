package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver 5");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[contains(@value,'Confirmation Alert')]"));
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000); driver.switchTo().alert().accept();
	}

}
