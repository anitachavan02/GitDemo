import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DownloadFile {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driverA = new ChromeDriver();

		String appUrl = "https://www.java.com/en/download/";

		driverA.get(appUrl);
		driverA.manage().window().maximize();
		Thread.sleep(2000);
		
		/*driverA.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("java download");
		Thread.sleep(2000);
		
		driverA.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driverA.findElement(By.linkText(".//*[@id='rso']/div[4]/div/div[3]/div/div/div[1]/a/h3")).click();
		Thread.sleep(2000);
		*/
		driverA.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span")).click();
		Thread.sleep(2000);
		
		driverA.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span")).click();
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		System.out.println("hiiiiii");
		
		
		
		
	}

}
