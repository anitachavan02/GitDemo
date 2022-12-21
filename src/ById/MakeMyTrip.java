package ById;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://www.makemytrip.com/");
		driver6.manage().window().maximize();
		
		driver6.findElement(By.id("ch_login_icon")).click();
		Thread.sleep(3000);
		driver6.findElement(By.id("ch_login_email")).sendKeys("anita.chavan02@gmail.com");
		Thread.sleep(3000);
		driver6.findElement(By.id("ch_login_password")).sendKeys("Anita02@#");
		
		driver6.findElement(By.id("ch_login_btn")).click();
		
		Thread.sleep(3000);
		driver6.quit();
	}

}
