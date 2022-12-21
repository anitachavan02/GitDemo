import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragNdrop {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driverA = new ChromeDriver();

		String appUrl = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

		driverA.get(appUrl);
		
		driverA.manage().window().maximize();
		driverA.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		WebElement from = driverA.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		WebElement to = driverA.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		Actions builder = new Actions(driverA);
		Action dragNdrop = builder.clickAndHold(from).moveToElement(to).release(to).build();
		dragNdrop.perform();
		
		

	}

}
