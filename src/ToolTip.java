import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolTip {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driverA = new ChromeDriver();

		String appUrl = "http://demo.guru99.com/test/social-icon.html";

		driverA.get(appUrl);
		driverA.manage().window().maximize();
		
		String expected="Facebook";
		WebElement github = driverA.findElement(By.className("facebook"));
		
		String actual = github.getAttribute("title");
		System.out.println("Actual name is :"+actual);
		
		if(actual.equals(expected))
		{
			System.out.println("test case pass");
		}


	}

}
