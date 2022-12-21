package ByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
	
		WebDriver driverA = new ChromeDriver();
		
		driverA.get("https://www.amazon.in/");
		driverA.manage().window().maximize();
		Thread.sleep(3000);
		
		driverA.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]")).click();
		
		Thread.sleep(3000);
		driverA.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("anita.chavan02@gmail.com");
		
		driverA.findElement(By.xpath(".//*[@id='continue']")).click();
		
		driverA.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Anita02@#");
		Thread.sleep(3000);
		
		driverA.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		Thread.sleep(3000);
		
		
		System.out.println("Hiiii.....");
		
		driverA.quit();
		
	}

}
