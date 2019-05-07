import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerss {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Open Facebook .com");
		
		// Initializing set for get window handles()
		Set<String> winid= driver.getWindowHandles();
		Iterator<String> itr= winid.iterator();
		System.out.println("Parent window id is:"+itr.next());  
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		winid=driver.getWindowHandles();
		itr= winid.iterator();
		String firstwinid=itr.next();
		String tabwinid=itr.next();
		System.out.println("Parent window id when there is tab window"+firstwinid); // First Window id
		System.out.println("Tab window id"+tabwinid);  // Tab Window id
		Thread.sleep(5000);
		
		//Switch to tabbed window and perform action
		driver.switchTo().window(tabwinid);
		
		// Moving to third tab window by clicking on element from second window
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/about/privacy/update']")).click();
		winid=driver.getWindowHandles();
		itr= winid.iterator();
		System.out.println("Parent window id with two tabbed windows"+itr.next());
		System.out.println("First tabbed window id"+itr.next());
		String anothertab=itr.next();   // another tab
		System.out.println("Second tabbed window id"+anothertab);
		
		//Switch to third tab
		driver.switchTo().window(anothertab);
	}

}
