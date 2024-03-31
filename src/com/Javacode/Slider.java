package com.Javacode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement frm =driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	   driver.switchTo().frame(frm);
		Thread.sleep(2000);
		WebElement slider=driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		Actions action = new Actions(driver);
		action.clickAndHold(slider)
		.pause(Duration.ofSeconds(2))
		.moveByOffset(200, 0)
		.release()
		.build()
		.perform();
	 

	}

}
