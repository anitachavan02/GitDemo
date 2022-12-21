import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolTip3 {

	public static void main(String[] args) throws IOException
	{
System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test//social-icon.html");
		driver.manage().window().maximize();
		
		
		String expected = "Youtube";
		WebElement youtube = driver.findElement(By.className("you-tube"));
		String actual = youtube.getAttribute("title");
		System.out.println("Actual name is:"+actual);
		
		if(actual.equals(expected))
		{
			System.out.println("test case pass");
		}
		else 
		{
			System.out.println("test case fail");
			
			File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\lenovo\\Desktop\\Img_Webdriver\\pic1.png"),true);
		}
		
		driver.quit();
	}

}
