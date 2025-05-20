import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Product_Order_Form_Template {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fluentforms.com/forms/product-order-form/");
		driver.findElement(By.xpath("//input[@value='I am a new customer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("input_text")).sendKeys("Mobile");
		Thread.sleep(1000);
		driver.findElement(By.name("numeric-field")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Black']")).click();
		Thread.sleep(1000);
		WebElement dropdown=driver.findElement(By.id("ff_8_dropdown"));
		Select select=new Select(dropdown);
		select.selectByIndex(2);
		Thread.sleep(1000);
		driver.findElement(By.name("address1[address_line_1]")).sendKeys("Phaltan");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[address_line_2]")).sendKeys("788975421");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[city]")).sendKeys("Phaltan");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[state]")).sendKeys("Maharashtra");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[zip]")).sendKeys("478982");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[country]")).sendKeys("India");
		Thread.sleep(1000);
		//driver.quit();
	}

}


		
			