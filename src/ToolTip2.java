import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolTip2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test//social-icon.html");
		driver.manage().window().maximize();
		
		String expected = "Rss";
		
		WebElement rss = driver.findElement(By.className("rss"));
		
		String actual = rss.getAttribute("title");
		
		System.out.println("Actual name is:"+actual);
		if(actual.equals(expected))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.quit();

	}

}
