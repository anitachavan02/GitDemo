import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddToCart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("anita.chavan02@gmail.com");
		driver.findElement(By.xpath(".//*[@id='continue']")).click();
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Anita02@#");
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		
		driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='shopAllLinks']/tbody/tr/td[4]/div[2]/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='leftNav']/ul[1]/ul/div/li[5]/span/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='leftNav']/ul[3]/div/li[1]")).click();
		driver.findElement(By.xpath(".//*[@id='leftNav']/ul[1]/ul/div/li[7]/span/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='leftNav']/ul[1]/ul/div/li[8]/span/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='anonCarousel1']/ol/li[1]/div[1]/a/span")).click();
		System.out.println("heloooo");
		//Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		
		Thread.sleep(2000);
		System.out.println("Hi Anita");
		driver.quit();
		
		
		
		
		
	}

}
