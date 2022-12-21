import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mousehover {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driverA = new ChromeDriver();

		String appUrl = "http://www.cybage.com/";

		driverA.get(appUrl);
		driverA.manage().window().maximize();
		
		WebElement element = driverA.findElement(By.linkText("SERVICES"));
		Actions action = new Actions(driverA);
		
		action.moveToElement(element).build().perform();
	
		driverA.findElement(By.linkText("Globalization")).click();
		

	}

}
