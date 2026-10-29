package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2datepicker {
	static String Expected_day="31";
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select year=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		Thread.sleep(2000);
		year.selectByVisibleText("1998");
		Select month=new Select(driver.findElement(By.className("react-datepicker__month-select")));
		Thread.sleep(2000);
		month.selectByVisibleText("December");
		Thread.sleep(2000);
		List<WebElement>daylist=driver.findElements(By.xpath(("//div[@class=\"react-datepicker__day react-datepicker__day--031\"]")));
		for(WebElement e:daylist)
		{
			String day =e.getText();
			if(day.equals(Expected_day))
			{e.click();
			break;
			}
		}
		
		 
		
		
		
			
				
		

	}

}
