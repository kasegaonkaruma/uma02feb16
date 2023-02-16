package kkkkk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC0002 {

	public static void main(String args[])throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("smart tv");


		WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
		searchButton.click();
	}
}