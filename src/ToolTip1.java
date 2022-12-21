import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolTip1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driverA1 = new ChromeDriver();

		String appUrl = "http://demo.guru99.com/test//social-icon.html";

		driverA1.get(appUrl);
		
		driverA1.manage().window().maximize();
		
		String expected1 = "github";
		WebElement github1 = driverA1.findElement(By.className("github"));
		
		String actual1 = github1.getAttribute("title");
		System.out.println("Actual name is:"+actual1);
		
		if(actual1.equals(expected1))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
		
		driverA1.quit();


	}

}
