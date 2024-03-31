package com.Javacode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverprint {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips/");
		driver.manage().window().maximize();
		WebElement btn=driver.findElement(By.xpath("//button[@id=\"toolTipButton\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(btn).perform();
		Thread.sleep(2000);
		WebElement we =driver.findElement(By.xpath("//div[@class=\"tooltip-inner\"]"));
		System.out.println(we.getText());	
	}
}
