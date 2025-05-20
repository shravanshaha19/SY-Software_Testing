import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slip17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement b=driver.findElement(By.id("doubleClickBtn"));
		Actions a=new Actions(driver);
		a.doubleClick(b).build().perform();
		Thread.sleep(2000);
		WebElement b1=driver.findElement(By.id("rightClickBtn"));
		Actions a1=new Actions(driver);
		a1.contextClick(b1).build().perform();
		Thread.sleep(2000);
		WebElement b2=driver.findElement(By.id("TGXHD"));
		Actions a2=new Actions(driver);
		a2.click(b2).build().perform();
		Thread.sleep(2000);
	}

}
