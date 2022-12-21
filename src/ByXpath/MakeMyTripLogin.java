package ByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripLogin
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver2 = new ChromeDriver();
		
		driver2.get("https://www.google.com/?gws_rd=ssl");
		
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		
		driver2.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("makemytrip");
		driver2.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
		
		driver2.findElement(By.xpath(".//*[@id='vn1s0p1c0']/h3")).click();
		Thread.sleep(3000);
		
		driver2.findElement(By.xpath(".//*[@id='ch_login_icon']/span[2]")).click();
		Thread.sleep(3000);
		
		driver2.findElement(By.xpath(".//*[@id='ch_login_email']")).sendKeys("anita.chavan02@gmail.com");
		driver2.findElement(By.xpath(".//*[@id='ch_login_password']")).sendKeys("Anita02@#");
		driver2.findElement(By.xpath(".//*[@id='ch_login_btn']")).click();
		
		Thread.sleep(3000);
				
		System.out.println("Hiiii.....");
		driver2.quit();
		
		

	}

}
