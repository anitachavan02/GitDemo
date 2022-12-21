package ByName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver7 = new ChromeDriver();
		
		driver7.get("https://www.amazon.in/");
		driver7.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		System.out.println("Hiiii.....");
		
		driver7.quit();
	
	

	}

}
