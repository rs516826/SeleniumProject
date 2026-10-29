package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();

	}

}
