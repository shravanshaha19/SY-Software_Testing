import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Online_Shopping_Behavior_Form_Template {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fluentforms.com/forms/survey-online-shopping-behavior-template/");
		driver.findElement(By.xpath("//input[@value='Extremely often.']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("input_text")).sendKeys("Mobile");
		Thread.sleep(1000);
		driver.findElement(By.name("input_text_1")).sendKeys("amazon");
		Thread.sleep(1000);
		driver.findElement(By.name("input_text_2")).sendKeys("time consuming");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Extremely comfortable.']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Quite confident.']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Fairly confident.']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='2. Most of the time.']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='1. Credit card.']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='2. eBid.']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
