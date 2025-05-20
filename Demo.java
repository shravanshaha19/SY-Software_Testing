import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Shravan Shaha");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("ShravanShaha@gamil.com");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("phone")).sendKeys("879456213");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("textarea")).sendKeys("Phaltan");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("male")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("wednesday")).click();
		//Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.id("country"));
		Select select=new Select(dropdown);
		select.selectByIndex(9);
		
		WebElement dropdown1=driver.findElement(By.id("colors"));
		Select select1=new Select(dropdown1);
		select1.selectByIndex(3);
		
		WebElement dropdown11=driver.findElement(By.id("animals"));
		Select select11=new Select(dropdown11);
		select11.selectByIndex(4);
		
		//WebElement datePicker=driver.findElement(By.id("datepicker"));
		//datePicker.sendKeys("02/09/2025");
		//Thread.sleep(1000);
		
		//WebElement datePicker1=driver.findElement(By.id("txtDate"));
		//datePicker1.sendKeys("02/07/2025");
		//Thread.sleep(1000);
		
		WebElement upload_file=driver.findElement(By.id(""));
		upload_file.sendKeys("D:/Shravan/New folder/Software_Testing/TCcollege.jpg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
	}

}
