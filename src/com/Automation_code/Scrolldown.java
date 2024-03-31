package com.Automation_code;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scrolldown {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Test Scripts\\Automationproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		JavascriptExecutor jv= (JavascriptExecutor)driver;
		jv.executeScript("windows.scrollBy(0,2000)");
//          RemoteWebDriver rd=(RemoteWebDriver) driver;	
//          rd.executeScript("window.scrollBy(0,2000)");
	}

}
