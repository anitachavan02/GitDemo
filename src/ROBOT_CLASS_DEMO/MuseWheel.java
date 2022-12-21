package ROBOT_CLASS_DEMO;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MuseWheel 
{

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.stqatools.com");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		robot.mouseWheel(5);
		
		
		
	}

}
