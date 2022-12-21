import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DateTimePicker {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driverA = new ChromeDriver();

		String appUrl = "http://demo.guru99.com/test/";

		driverA.get(appUrl);
		
		driverA.manage().window().maximize();
		
		WebElement date = driverA.findElement(By.xpath("html/body/form/input[1]"));
		date.sendKeys("08052014");
		Thread.sleep(2000);
		date.sendKeys(Keys.TAB);
		date.sendKeys("1348PM");
		Thread.sleep(2000);
		System.out.println("hiii");
		
		driverA.quit();

	}

}
