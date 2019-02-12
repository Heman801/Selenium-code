package com.test.project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marutisuzukitruevalue.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions actions = new Actions (driver);
		WebElement Buy = driver.findElement(By.xpath("//a[@class='dropdown-toggle userBehaviour buy-car']"));
		actions.moveToElement(Buy);
	
		WebElement newdelhi = driver.findElement(By.xpath("//*[@id=\"navigation\"]/nav/ul/li[2]/div/div/div[1]/ul/li[1]/a"));
		actions.moveToElement(newdelhi);
		actions.click().build().perform();
		//actions.dragAndDrop(driver.findElement(By.xpath("")))
		//actions.
		
	
		
				
	}

	
	
	
}
