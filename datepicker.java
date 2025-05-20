import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//locate the date picker field
		WebElement datePicker=driver.findElement(By.id("datepicker"));
		//Enter date and time
		datePicker.sendKeys("02/09/2025");
		Thread.sleep(2000);
		
	}

	
}
