import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptHandling {

	public static void main(String[] args) {
		
		// Difference between get and navigate
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		//TO type something in alert popup -- alert.sendKeys("");
		alert.accept();
		
		// When you need to  login to system using javascript
		// driver.get(username:password@url);
	}

}
