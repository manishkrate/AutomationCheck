

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navigate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");	
		int i;
		//Get all field values
		driver.findElement(By.id("u_0_j")).sendKeys("...."); // FirstName
		driver.findElement(By.id("u_0_l")).sendKeys("...."); // LastName
		driver.findElement(By.id("u_0_o")).sendKeys("...."); //Enter Email address
		driver.findElement(By.id("u_0_r")).sendKeys("...."); //Renter Email address
		driver.findElement(By.id("u_0_v")).sendKeys("...."); //Enter Password
		
		
		// Get all the elements from the Dropdown List
		Select select = new Select(driver.findElement(By.id("day")));
		List<WebElement> day = select.getOptions();

		for(i=0;i<day.size();i++)
		{
			day.get(i).findElement(By.xpath("//option[@value='4']")).click();
		}
		
		Select select1= new Select(driver.findElement(By.id("month")));
		List<WebElement> month = select1.getOptions();
		
		for(i=0;i<month.size();i++)
		{
			month.get(i).findElement(By.xpath("//option[@value='4']")).click();
		}
		
		Select select2= new Select(driver.findElement(By.id("year")));
		List<WebElement> year= select2.getOptions();
		
		for(i=0;i<year.size();i++)
		{
			year.get(i).findElement(By.xpath("//option[@value='1993']")).click();
		}

		// Accessing Radio Buttons
		driver.findElement(By.id("u_0_a")).click();
		
		//Signup Click
		driver.findElement(By.id("u_0_11")).click();
		
		System.out.println("SignUp created with Username");
		
	}

}
