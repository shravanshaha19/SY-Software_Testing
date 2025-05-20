import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_File {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("textbox")).sendKeys("Hi!My name is Shravan.");
		Thread.sleep(2000);
		driver.findElement(By.id("createTxt")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("link-to-download")).click();
		Thread.sleep(5000);
	}

}
