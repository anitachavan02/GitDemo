import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver9 = new ChromeDriver();
		driver9.manage().window().maximize();
		
		driver9.get("https://mail.rediff.com/cgi-bin/login.cgi");		
		Thread.sleep(2000);
		
		driver9.findElement(By.name("proceed")).click();
		Alert alrt = driver9.switchTo().alert();
		System.out.println(alrt.getText());
		Thread.sleep(2000);
		alrt.accept();
		alrt.dismiss();//for cancel
		
		/*System.out.println(driver9.switchTo().alert().getText());
		Thread.sleep(2000);
		driver9.switchTo().alert().accept();
		*/
	}

}
