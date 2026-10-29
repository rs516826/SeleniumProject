package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dbclickandrightclickEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Actions action=new Actions(driver);
		WebElement dbclick=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(dbclick).perform();
		
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclick).perform();
				
		

	}

}
