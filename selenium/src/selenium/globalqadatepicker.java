package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class globalqadatepicker {
	static String Expected_year="2025";
	static String Expected_month="May";
	static String Expected_day="31";

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.xpath("(//iframe[@class=\"demo-frame\"])[1]"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		while(true)
		{
			String Actual_month=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			System.out.println(Actual_month);
			
			String Actual_year=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			System.out.println(Actual_year);
			
			if(Actual_year.equalsIgnoreCase(Expected_year)&&(Actual_month.equalsIgnoreCase(Expected_month)))
			{
				List<WebElement>daylist=driver.findElements(By.xpath("//table//tbody//tr//td"));
				for(WebElement e:daylist)
				{
					String day=e.getText();
					if(day.equals(Expected_day))
					{
						e.click();
						break;
						}
				}
				break;
				
				}
			else
			{
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			}
		}
	}
}

			
			
			
			
		
		
		

	


