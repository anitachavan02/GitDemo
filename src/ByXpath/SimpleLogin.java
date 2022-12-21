package ByXpath;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLogin {
	public static void main(String args[]) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id("email")).sendKeys("");
		//driver.findElement(By.name("email")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
		
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).click();

		System.out.println("hello");
		driver.quit();
	}

}
