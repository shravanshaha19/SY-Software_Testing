import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Upload_File {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload_file=driver.findElement(By.id("uploadfile_0"));
		upload_file.sendKeys("D:/Shravan/New folder/Software_Testing/TCcollege.jpg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(1000);
		//driver.close();
	}

}
