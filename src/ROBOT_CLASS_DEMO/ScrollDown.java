package ROBOT_CLASS_DEMO;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown
{

	public static void main(String[] args) throws AWTException, InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.stqatools.com");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		for(int i = 0; i <= 5; i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(500);
		}
		
		for(int i = 0; i <= 5; i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(500);
		}
		
		
	}

}
