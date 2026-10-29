package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWaitAlertsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");

driver.findElement(By.id("timerAlertButton")).click();

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));

wait.until(ExpectedConditions.alertIsPresent());
Alert alert=driver.switchTo().alert();
alert.accept(); 
	}

}
