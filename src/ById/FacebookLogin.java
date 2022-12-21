package ById;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Testing Software\\Testing Software\\chromedriver.exe");
	
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.facebook.com/");
		driver4.manage().window().maximize();
		
		driver4.findElement(By.id("email")).sendKeys("anita.chavan02@gmail.com");
		
		driver4.findElement(By.id("pass")).sendKeys("123");
		
		driver4.findElement(By.id("u_0_2")).click();
		
		System.out.println("hiiiii");
		
		//Thread.sleep(3000);
		
		driver4.quit();

	}

}
