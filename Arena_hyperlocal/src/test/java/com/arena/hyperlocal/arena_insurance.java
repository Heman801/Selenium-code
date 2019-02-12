package com.arena.hyperlocal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class arena_insurance {
	@Test
	public void arena_insuranceform() {
	System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://arenaofjaipurroad.marutisuzukistaging.co.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Insurance')]")).click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("scroll(0, 50)");

driver.findElement(By.xpath("//div[@class= 'col-md-3 col-sm-6 col-xs-12 form-group']/div/select/option[@value= 'Alto 800']")).click();
driver.findElement(By.xpath("//input[@id='inpregno']")).sendKeys("123");
driver.findElement(By.xpath("//div[@class= 'col-md-3 col-sm-6 col-xs-12 form-group']/div/select/option[@value= 'January']")).click();
driver.findElement(By.xpath("//div[@class= 'col-md-3 col-sm-6 col-xs-12 form-group']/div/select/option[@value= '2018']")).click();
driver.findElement(By.xpath("//input[@id='inpploicyno']")).sendKeys("123");
driver.findElement(By.xpath("//input[@id='inpinscompany']")).sendKeys("test company");
driver.findElement(By.xpath("//input[@id='inpdateexp']")).sendKeys("11/28/2018");
driver.findElement(By.xpath("//input[@id='inpname']")).sendKeys("Heman Singhal");
driver.findElement(By.xpath("//input[@id='inpemail']")).sendKeys("hemendra.singhal@adglobal360.com");
driver.findElement(By.xpath("//input[@id='inpphone']")).sendKeys("8130084842");
WebElement element12=driver.findElement(By.xpath("//div[@class= 'col-xs-12']/div/label/input[@type= 'checkbox']"));
jse.executeScript("arguments[0].click();", element12);

driver.findElement(By.xpath("//input[@id='btninsurance']")).click();
}
}
