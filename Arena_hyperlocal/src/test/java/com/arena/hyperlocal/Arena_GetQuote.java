package com.arena.hyperlocal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Arena_GetQuote {
	@Test
	public void Arena_Quote() {
	System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://arenaofjaipurroad.marutisuzukistaging.co.in/");
	driver.manage().window().maximize();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 50)");
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Cars')]"))).build().perform();
	WebElement element = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"avaliable-cars\"]/div/div/div[1]/ul/li[3]/a")));
	element.click();
	jse.executeScript("scroll(0, 250)");

	


	
	}
	}
