import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.id("angular"));
		WebElement to=driver.findElement(By.id("droparea"));
		WebElement from1=driver.findElement(By.id("mongo"));
		WebElement to1=driver.findElement(By.id("droparea"));
		WebElement from2=driver.findElement(By.id("node"));
		WebElement to2=driver.findElement(By.id("droparea"));
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		act.dragAndDrop(from1, to1).build().perform();
		act.dragAndDrop(from2, to2).build().perform();
		//Thread.sleep(2000);
		WebElement from3=driver.findElement(By.id("angular"));
		WebElement to3=driver.findElement(By.id("droparea"));
		WebElement from4=driver.findElement(By.id("mongo"));
		WebElement to4=driver.findElement(By.id("droparea"));
		WebElement from5=driver.findElement(By.id("node"));
		WebElement to5=driver.findElement(By.id("droparea"));
		Actions act1=new Actions(driver);
		act.dragAndDrop(from3, to3).build().perform();
		act.dragAndDrop(from5, to5).build().perform();
		act.dragAndDrop(from4, to4).build().perform();
		//Thread.sleep(2000);
		WebElement from31=driver.findElement(By.id("angular"));
		WebElement to31=driver.findElement(By.id("droparea"));
		WebElement from41=driver.findElement(By.id("mongo"));
		WebElement to41=driver.findElement(By.id("droparea"));
		WebElement from51=driver.findElement(By.id("node"));
		WebElement to51=driver.findElement(By.id("droparea"));
		Actions act11=new Actions(driver);
		act.dragAndDrop(from51, to51).build().perform();
		act.dragAndDrop(from41, to41).build().perform();
		act.dragAndDrop(from31, to31).build().perform();
	}

}
