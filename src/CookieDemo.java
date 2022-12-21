import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CookieDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driverA = new ChromeDriver();

		String appUrl = "https://www.facebook.com/";

		driverA.get(appUrl);
		driverA.manage().window().maximize();
		
		driverA.findElement(By.xpath(".//*[@id='email']")).sendKeys("anita.chavan02@gmail.com");
		
		driverA.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Anita");
		
		driverA.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		
		File file = new File("Cookie.data");
		
		try {
			file.delete();
			file.createNewFile();
			FileWriter a = new FileWriter(file);
			BufferedWriter t = new  BufferedWriter(a);
			for(Cookie c : driverA.manage().getCookies())
			{
				String writeUp = c.getName() + " " + c.getValue() + " " + c.getDomain() + " " + c.getPath() + " " + c.getExpiry() + " " + c.isSecure();
				t.write(writeUp);
				System.out.println(writeUp);
				t.newLine();
				t.flush();
				
			}
			
			t.close();
			a.close();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		


	}

}
