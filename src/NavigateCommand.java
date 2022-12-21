import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driverA = new ChromeDriver();

		String appUrl = "https://www.amazon.in/";

		driverA.get(appUrl);

		driverA.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();

		driverA.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("anita.chavan02@gmail.com");
		driverA.findElement(By.xpath(".//*[@id='continue']")).click();
		driverA.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Anita02@#");

		driverA.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		Thread.sleep(2000);

		driverA.findElement(By.xpath(".//*[@id='nav-link-wishlist']/span[2]")).click();

		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii");

		driverA.findElement(By.xpath(".//*[@id='itemSearchTextInput']")).sendKeys("MyList");
		driverA.findElement(By.xpath(".//*[@id='itemSearchTextInput']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		// go back to the home page
		driverA.navigate().back();
		Thread.sleep(2000);
		File f1 = ((TakesScreenshot) driverA).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Users\\lenovo\\Desktop\\Img_Webdriver\\Createlist.png"), true);
		
		// go forward to the registration page
		driverA.navigate().forward();
		Thread.sleep(2000);
		
		// go back to the home page
		driverA.navigate().to(appUrl);

		// refresh browser
		driverA.navigate().refresh();

		System.out.println("Hii");
		driverA.quit();

	}

}
