package com.Javacode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
	public static void main(String args[]) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptops");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[@class='_3izBDY']")).click();
	        WebElement mv = driver.findElement(By.xpath("//a[@class='_3-PJz-']"));
	        Actions a = new Actions(driver);
	        a.moveToElement(mv).perform();
	      
	        
	        Thread.sleep(2000);
	        WebElement dd=driver.findElement(By.xpath("//select[@class='_2YxCDZ']"));
	        Select s =new Select(dd);
	        s.selectByValue("20000");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@title='Core i7']")).click();
//	        Thread.sleep(2000);
//	        driver.close();
			
	}

}
