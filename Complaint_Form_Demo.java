import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complaint_Form_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fluentforms.com/forms/complaint-form/");
		driver.findElement(By.name("names[first_name]")).sendKeys("Shravan Shaha");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("shravanshaha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("7299861008");
		Thread.sleep(1000);
		driver.findElement(By.id("ff_68_description")).sendKeys("abcdugduiweew");
		Thread.sleep(1000);
		driver.findElement(By.id("ff_68_description_1")).sendKeys("xyzufhgueewu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='on']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
