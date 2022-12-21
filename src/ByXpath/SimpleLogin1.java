package ByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLogin1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver1.manage().window().maximize();
		
		driver1.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		//Thread.sleep(3000);
		//driver1.findElement(By.xpath(".//*[@id='Email']")).sendKeys("anita.chavan02@gmail.com");//id
		driver1.findElement(By.id("Email")).sendKeys("anita.chavan02@gmail.com");
		Thread.sleep(3000);
		driver1.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(3000);
		
		
		driver1.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("iwanakillu");//pass
		driver1.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(3000);
		
		driver1.findElement(By.xpath(".//*[@id='gb_71']")).click();
		Thread.sleep(3000);
		
		
		
		
		System.out.println("Hellooo.............");
		
		driver1.quit();
		
		
		
		
	}

}
