package ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartLogin {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://mobile.twitter.com/");
		driver6.manage().window().maximize();
		
		
		System.out.println("helloooo");
		
		driver6.quit();

		
		
		
		

	}

}
