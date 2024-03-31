package com.Javacode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Uploadnaukri {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"usernameField\"]")).sendKeys("deshaganisaikumar@gmail.com");
		driver.findElement(By.xpath(" //input[@id=\"passwordField\"]")).sendKeys("Saikumar@007");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		WebElement btn=driver.findElement(By.xpath("//div[text()='Resume']"));
		WebElement ur=driver.findElement(By.xpath("//input[@id=\"attachCV\"]"));
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", btn);
		Thread.sleep(2000);
		ur.sendKeys("file:///D:/RESUMES/Resumes/Resume-SQL,MT,JAVA,AT-(2022).pdf");
		System.out.println("Successfully uploaded Resume in Naukri");
		Thread.sleep(2000);
             driver.close();

	 
	}

}
