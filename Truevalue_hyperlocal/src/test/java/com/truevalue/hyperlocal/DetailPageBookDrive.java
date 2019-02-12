package com.truevalue.hyperlocal;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DetailPageBookDrive {
	
	@Test
	public void Class() throws InterruptedException
	
	{

	//public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.truevalueofmathuraroad.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navigation1\"]/nav/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"inventoryBlock\"]/li[1]/div/div/div[1]/a/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"nameDetail\"]")).sendKeys("Heman Singhal");
		driver.findElement(By.xpath("//*[@id=\"mobileDetail\"]")).sendKeys("8130084842");
		driver.findElement(By.xpath("//*[@id=\"emailDetail\"]")).sendKeys("hemendra.singhal@adglobal360.com");
		driver.findElement(By.xpath("//*[@id=\"car-details-page\"]/div[2]/div/div[5]/div[4]/div/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"car-details-page\"]/div[2]/div/div[5]/div[6]/a")).click();
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(1000);
		String thankYou = driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div")).getText();
		if(thankYou.contains("THANK YOU FOR SHOWING INTEREST")) {
			System.out.println(thankYou);
			System.out.println("Test success");
		}
			}

	}