import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abc");;
		driver.findElement(By.id("pass")).sendKeys("def");
		driver.findElement(By.id("pass")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.id("pass")).sendKeys(Keys.DELETE);
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);

	}

}
