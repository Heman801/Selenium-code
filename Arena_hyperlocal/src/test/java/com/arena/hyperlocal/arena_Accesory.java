package com.arena.hyperlocal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class arena_Accesory {
	@Test
	public void arena_Accessoriesform() {
	System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://arenaofjaipurroad.marutisuzukistaging.co.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Accessories')]")).click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("scroll(0, 50)");
	Select dropName = new Select(driver.findElement(By.xpath("//div[@class= 'brochureSelect']/select[@id= 'brochure-drop']")));
	dropName.selectByVisibleText("Alto 800");
driver.findElement(By.xpath("//input[@id='inpname']")).sendKeys("Heman");
driver.findElement(By.xpath("//input[@id='inpphone']")).sendKeys("8130084842");
driver.findElement(By.xpath("//input[@id='inpemail']")).sendKeys("hemendra.singhal@adglobal360.com");

WebElement element12=driver.findElement(By.xpath("//li[@class= 'formdiclaimer']/label/input[@type= 'checkbox']"));
jse.executeScript("arguments[0].click();", element12);

driver.findElement(By.xpath("//input[@id='btnbrochure']")).click();



	}

}

