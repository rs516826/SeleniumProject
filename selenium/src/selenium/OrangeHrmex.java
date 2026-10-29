package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(9000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		Thread.sleep(2000);
		
		//pim link
		driver.findElement(By.xpath("(//a[@class=\"oxd-main-menu-item\"])[2]")).click();
		Thread.sleep(3000);
		
		//add button
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		Thread.sleep(3000);
		//upload a file
		//dirname:\\foldername\\filename.entension
		//ex. D:\\test\\sample.docx
		File file=new File("C:\\Users\\rs516\\OneDrive\\Pictures\\download.png");
		WebElement fileinput = driver.findElement(By.cssSelector("input[type=file]"));
		fileinput.sendKeys(file.getAbsolutePath());
		
		
		
		
				 ;
	}

}
