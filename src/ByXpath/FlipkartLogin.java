package ByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://mobile.twitter.com/");
		driver3.manage().window().maximize();
		
		
		
		driver3.findElement(By.xpath(".//*[@id='session[username_or_email]']")).sendKeys("anita.chavan02@gmail.com");
		
		driver3.findElement(By.xpath(".//*[@id='session[password]']")).sendKeys("Anita.chavan02");
		driver3.findElement(By.xpath(".//*[@id='main_content']/div[1]/form/span[2]/input")).click();
		
		
		System.out.println("helloooo");
		
		driver3.quit();

	}

}
