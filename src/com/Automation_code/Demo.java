package com.Automation_code;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.Remotable;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String args[]) throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/");
	      driver.manage().window().maximize();
	     
	     // thru Typecasting
	     TakesScreenshot ts=(TakesScreenshot)driver;
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     //File dest=new File("D:\\goolephoto.jpg");
	     File dest=new File(System.getProperty("user.dir")+"\\ScreenShots.png");
	     FileUtils.copyFile(src, dest);
	    
	   
	     //thru Down casting
//	    RemoteWebDriver tw =(RemoteWebDriver)driver;
//	    File src=tw.getScreenshotAs(OutputType.FILE);
//	    File dest=new File("D:\\goolephoto.jpg");
//	    Files.copy(src, dest);
	  //Take Particular Screenshot
	  
	     WebElement particularsrc=driver.findElement(By.xpath("//*[@alt='Naveen AutomationLabs']"));
	     File Part=particularsrc.getScreenshotAs(OutputType.FILE);
	      File Dest=new File(System.getProperty("user.dir")+"\\ScreenShots.png");
	      FileUtils.copyFile(Part, Dest);
	      Thread.sleep(1000);
		     driver.close();
	}

}
