package com.Automation_code;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Screenshotparticular {
	public static void main(String args[]) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Test Scripts\\Automationproject\\Drivers\\chromedriver.exe");
	     WebDriver driver =new	ChromeDriver();
	     driver.get("https://google.com/");
	     driver.manage().window().maximize();
	     WebElement gl=driver.findElement(By.xpath("//img[@alt=\"Google\"]"));
	     File src= gl.getScreenshotAs(OutputType.FILE);
	     File dest = new File("D:\\google1.png");
	     Files.copy(src, dest);
	     Thread.sleep(3000);
	     driver.close();
	}
	}