package ST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement>a=driver.findElements(By.name("webform"));
		int num=a.size();
		for(int i=0;i<num;i++)
		{
			a.get(i).click();
			Thread.sleep(2000);
		}
		
		List<WebElement>b=driver.findElements(By.xpath("//input[@type='radio']"));
		int n=b.size();
		for(int j=0;j<num;j++)
		{
			b.get(j).click();
			Thread.sleep(2000);
		}
		driver.close();
	}

}
