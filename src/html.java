import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class html {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver perfect = new HtmlUnitDriver();

		
		perfect.get("http://www.facebook.com");

		
		System.out.println("Title of the page " + perfect.getTitle());

		
		WebElement username = perfect.findElement(By.xpath(".//*[@id='email']"));
		username.sendKeys("anita.chavan02@gmail.com");
		
		WebElement password = perfect.findElement(By.xpath(".//*[@id='pass']"));

		
		password.sendKeys("93939");

		
		WebElement Signup_button = perfect.findElement(By.xpath(".//*[@id='u_0_2']"));

		
		Signup_button.click();

		
		Thread.sleep(9000);

		// You will get new title after login
		System.out.println("After login title is = " + perfect.getTitle());

	}
}
