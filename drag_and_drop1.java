import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.id("credit2"));
		WebElement to=driver.findElement(By.id("bank"));
		WebElement from1=driver.findElement(By.id("fourth"));
		WebElement to1=driver.findElement(By.id("amt7"));
		
		WebElement from2=driver.findElement(By.id("credit1"));
		WebElement to2=driver.findElement(By.id("loan"));
		WebElement from3=driver.findElement(By.id("fourth"));
		WebElement to3=driver.findElement(By.id("amt8"));
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		//Thread.sleep(000);
		act.dragAndDrop(from1, to1).build().perform();
		//Thread.sleep(1000);
		act.dragAndDrop(from2, to2).build().perform();
		//Thread.sleep(1000);
		act.dragAndDrop(from3, to3).build().perform();
		//act.dragAndDrop(from3, to3).build().perform();
		//Thread.sleep(1000);
	}

}
