package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovertheelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions action=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		WebElement hover=driver.findElement(By.xpath("(//span[@class=\"nav-line-2\"]"));
		action.moveToElement(hover).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[7]")).click();
		Thread.sleep(3000);
		

		
		
		
		

	}

}
