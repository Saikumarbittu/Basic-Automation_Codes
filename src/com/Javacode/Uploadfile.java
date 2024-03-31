package com.Javacode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\SAIKUMAR\\OneDrive\\Desktop\\test.txt");
		driver.findElement(By.xpath("//input[@value=\"Upload\"]")).click();

	}

}
