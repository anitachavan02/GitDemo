import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadPopUps {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		
		WebDriver driver9 = new ChromeDriver();
		driver9.manage().window().maximize();
		
		driver9.get("http://demo.guru99.com/test/upload/");		
		Thread.sleep(2000);
		
		driver9.findElement(By.xpath(".//*[@id='uploadfile_0']")).sendKeys("C:\\Users\\lenovo\\Desktop\\validateForm.txt");
		System.out.println("Ania");
	}

}
