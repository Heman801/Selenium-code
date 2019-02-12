package com.arena.hyperlocal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class arena {
	@Test
	public void arena_serviceform() {
	System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://arenaofjaipurroad.marutisuzukistaging.co.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Service')]")).click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 450)");
	driver.findElement(By.xpath("//input[@id='inpname']")).sendKeys("Heman");
	driver.findElement(By.xpath("//input[@id='inpemail']")).sendKeys("hemendra.singhal@adglobal360.com");
	driver.findElement(By.xpath("//input[@id='inpphone']")).sendKeys("8130084842");
	driver.findElement(By.xpath("//div[@class= 'col-md-3 col-sm-6 col-xs-12 form-group']/div/select/option[@value= 'Alto 800']")).click();
	driver.findElement(By.xpath("//input[@id='inpsskms']")).sendKeys("100");
	driver.findElement(By.xpath("//div[@class= 'col-md-3 col-sm-6 col-xs-12 form-group']/div/select/option[@value= '2018']")).click();
	driver.findElement(By.xpath("//input[@id='inpaddress1']")).sendKeys("Test");
	driver.findElement(By.xpath("//input[@id='inpaddress2']")).sendKeys("Test2");
	//WebElement element1=driver.findElement(By.xpath("//div[@class= 'col-xs-12']/div/label/input[@type= 'checkbox']"));
	//jse.executeScript("arguments[0].click();", element1);
	driver.findElement(By.xpath("//input[@id='disclaimer']")).click();
//	jse.executeScript("arguments[0].click();", element11);

	driver.findElement(By.xpath("//input[@id='btnsubmit']")).click();
	
	
}
}
