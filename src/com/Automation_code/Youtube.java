package com.Automation_code;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Youtube {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Test Scripts\\Automationproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("RRR songs");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@id=\"thumbnail\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body[@dir=\"ltr\"]")).click();
	    Thread.sleep(2000);
	   // driver.findElement(By.xpath("//h3[@class=\"title-and-badge style-scope ytd-video-renderer\"]")).click();
	
	  
	
	}

}
