package com.truevalue.hyperlocal;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormValidation {

	
	@Test
	
	public void Class() throws InterruptedException
	
	{
	//public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.truevalueofmathuraroad.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"car-listing\"]/ul/div/div/li[4]/div/div/div[2]/div[3]/button")).click();
driver.findElement(By.xpath("//*[@id=\"nameBookModal\"]")).sendKeys("Heman Singhal");
driver.findElement(By.xpath("//*[@id=\"phoneBookModal\"]")).sendKeys("8130084842");
driver.findElement(By.xpath("//*[@id=\"emailBookModal\"]")).sendKeys("hemendra.singhal@adglobal360.com");
driver.findElement(By.xpath("//*[@id=\"booktestDriveFormBody\"]/div/form/div[1]/div[1]/div[4]/div/label")).click();
driver.findElement(By.xpath("//*[@id=\"bookButton\"]")).click();
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
Thread.sleep(10);
String thankYou = driver.findElement(By.xpath("//*[@id=\"booktestDriveThankYou\"]/div/div[1]")).getText();
if(thankYou.contains("Test Drive Booked Successfully")) {
	System.out.println(thankYou);
	System.out.println("Test success");
}
	}

}
