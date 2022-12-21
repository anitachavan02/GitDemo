package ROBOT_CLASS_DEMO;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCapture 
{

	public static void main(String[] args) throws AWTException, IOException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.stqatools.com");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		
		BufferedImage img = robot.createScreenCapture(new Rectangle(size));
		
		File path = new File("D://profile.jpg");
		ImageIO.write(img, "JPG", path);
		
	}

}
