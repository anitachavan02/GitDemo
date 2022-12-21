package ById;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.amazon.in/");
		driver5.manage().window().maximize();
		
		driver5.findElement(By.id("nav-link-yourAccount")).click();;
		driver5.findElement(By.id("ap_email")).sendKeys("anita.chavan02@gmail.com");
		driver5.findElement(By.id("continue")).click();
		
		driver5.findElement(By.id("ap_password")).sendKeys("Anita02@#");
		driver5.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(3000);
		
		driver5.quit();
		
		
	}

}
