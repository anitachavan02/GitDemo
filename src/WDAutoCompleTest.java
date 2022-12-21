import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WDAutoCompleTest {

	
	static String SEARCH_FOR = "java webdriver api";
	static String TYPE_SERCH_TEXT = "Java webdri";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Testing Software\\Testing Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");

		WebElement webElement = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"));
		webElement.sendKeys("java webdriver");
		webElement.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='sbsb_a']/ul/li"));
		
		int i = 1;
		
		for (WebElement webElementLiList : list)
		{
			if (!(i <= list.size()))
				break;
			WebElement webElementLi = webElementLiList.findElement(By.xpath("//div[@class='sbsb_a']/ul/li[" + i+ "]/div/div[2]"));
			
			String text = webElementLi.getText();
			
			if (text.equalsIgnoreCase(SEARCH_FOR))
			{
				System.out.println("Search String :: " + text);
				webElementLi.click();
				break;
			}

			i++;

		}

		System.out.println("hiii");
	
}}