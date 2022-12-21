import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseHover1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driverM = new ChromeDriver();
		driverM.get("http://toolsqa.com/");
		driverM.manage().window().maximize();
		
		WebElement element1 = driverM.findElement(By.linkText("ONLINE TRAINING"));
		
		Actions action1 = new Actions(driverM);
		
		action1.moveToElement(element1).build().perform();
		System.out.println("hiiii");
		
		driverM.findElement(By.linkText("Selenium Training")).click();
	}

}
