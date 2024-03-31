package com.Javacode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frm = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frm);
		Thread.sleep(2000);
		WebElement src =driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dest = driver.findElement(By.xpath("//p[text()='Drop here']"));
	  Actions action = new Actions(driver);
	   action.dragAndDrop(src, dest).perform();
		

	}

}
