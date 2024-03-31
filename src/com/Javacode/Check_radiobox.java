package com.Javacode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Check_radiobox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		WebElement frm=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	
		driver.switchTo().frame(frm);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for=\"radio-3\"]")).click();
         Thread.sleep(2000);
          RemoteWebDriver rd=(RemoteWebDriver) driver;	
          rd.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
