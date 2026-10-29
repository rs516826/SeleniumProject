package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleDropDowndatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Datepicker.html");
driver.findElement(By.id("datepicker2")).click();

Select year=new Select(driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[2]")));
Thread.sleep(2000);
year.selectByVisibleText("2020");

Select month=new Select(driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[1]")));
Thread.sleep(2000);
month.selectByVisibleText("June");

Thread.sleep(2000);
driver.findElement(By.linkText("20")).click();






	}

}
