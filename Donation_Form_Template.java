import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Donation_Form_Template {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fluentforms.com/forms/donation-form/");
		driver.findElement(By.name("names[first_name]")).sendKeys("Shravan");
		Thread.sleep(1000);
		driver.findElement(By.name("names[last_name]")).sendKeys("Shaha");
		Thread.sleep(1000);
		driver.findElement(By.name("input_text_2")).sendKeys("7299861008");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("shravanshaha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[address_line_1]")).sendKeys("Phaltan");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[address_line_2]")).sendKeys("Baramati");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[city]")).sendKeys("Phaltan");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[state]")).sendKeys("Maharashtra");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[zip]")).sendKeys("415523");
		Thread.sleep(1000);
		driver.findElement(By.name("address1[country]")).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(By.name("numeric-field")).sendKeys("100000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Credit Card']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
