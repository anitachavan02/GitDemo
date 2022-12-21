import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver9 = new ChromeDriver();
		driver9.manage().window().maximize();
		
		driver9.get("https://www.amazon.in/");		
		Thread.sleep(2000);
		
		File f = ((TakesScreenshot) driver9).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\lenovo\\Desktop\\Img_Webdriver\\pic.png"),true);
		
		System.out.println("Hiiii");
		driver9.quit();
	}

}
