package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentdatepicker {
	
	static String Exp_year="2020";
	static String Exp_month="September";
	static String Exp_day="17";
	
	public static void main(String[] args)throws InterruptedException {  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker1")).click();
		
		
		while(true)
		{
			String Act_year=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println(Act_year);
			
			String Act_month=driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println(Act_month);
			
			if(Act_year.equalsIgnoreCase(Exp_year)  && (Act_month.equalsIgnoreCase(Exp_month)))
			{
				
				List<WebElement>daylist=driver.findElements(By.xpath("//table//tbody//tr//td"));
				for(WebElement e:daylist) {
					String day=e.getText();
					if(day.equals(Exp_day))
					{
						e.click();
						break;
					}
				}
				Thread.sleep(2000);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
				
				
				
					}
				}
			}
			
			
			
			
			
			
			
		
	
		
		
	
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
