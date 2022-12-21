package ROBOT_CLASS_DEMO;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.geo.Coordinates;

public class RobotDemo {

	public static void main(String[] args) throws AWTException {


		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driverA = new ChromeDriver();

		String appUrl = "http://www.stqatools.com";

		driverA.get(appUrl);
		driverA.manage().window().maximize();

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);

		robot.mousePress(InputEvent.BUTTON1_MASK);

		robot.mouseRelease(InputEvent.BUTTON1_MASK);

		//Point coordinates = driverA.findElement(By.id("img_location")).getLocation();

	//	robot.mouseMove(coordinates.getX(), coordinates.getY());

	}

}