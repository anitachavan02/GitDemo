
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiSelectCommand {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driverA = new ChromeDriver();

		String appUrl = "http://toolsqa.wpengine.com/automation-practice-form";

		driverA.get(appUrl);
		driverA.manage().window().maximize();
		
		Select oselect = new Select(driverA.findElement(By.name("selenium_commands")));
		oselect.selectByIndex(0);
		Thread.sleep(2000);
		oselect.deselectByIndex(0);
		
		oselect.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		
		oselect.deselectByVisibleText("Navigation Commands");
		java.util.List<WebElement> osize = oselect.getOptions();
		int iListSize = osize.size();
		System.out.println(iListSize);
		
		for(int i = 0 ; i < iListSize; i++ )
		{
			String svalue = oselect.getOptions().get(i).getText();
			System.out.println(svalue);
			oselect.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		oselect.deselectAll();
		//driverA.close();
		
	}

}
