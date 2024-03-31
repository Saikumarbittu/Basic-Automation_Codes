package com.Javacode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverprint1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		WebElement frm=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		driver.switchTo().frame(frm);
		Thread.sleep(2000);
		WebElement tf=driver.findElement(By.xpath("//input[@id=\"age\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(tf).perform();
		Thread.sleep(2000);
		WebElement txt=driver.findElement(By.xpath("//div[@class=\"ui-tooltip-content\"]"));
		System.out.println(txt.getText());
		
       
	}

}
