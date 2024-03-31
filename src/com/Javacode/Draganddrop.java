package com.Javacode;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement frm =driver.findElement(By.xpath("//iframe[@class=\"js-iframe active\"]"));
	   driver.switchTo().frame(frm);
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//span[text()=\"Lawrence Block\"]"));
		WebElement dest =driver.findElement(By.xpath("//li[text()=\"Zend Framework in Action\"]"));
		 Actions action=new Actions(driver);
		  action.dragAndDrop(src, dest).perform();
//		 action.clickAndHold(src)
//		 .moveToElement(dest)
//		 .release()
//		 .build()
//		 .perform();
//	      ;
		
		
		
		
	
	}

}
