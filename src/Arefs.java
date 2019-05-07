import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arefs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}
	}

}
