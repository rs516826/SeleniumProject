package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerOfNextButtonEx {
	
	
	static String Exp_year="2021";
	static String Exp_month="june";
	static String Exp_day="13";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String Act_year=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println(Act_year);
			
			String Act_month=driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println(Act_month);
			
			if(Act_year.equalsIgnoreCase(Exp_year) && (Act_month.equalsIgnoreCase(Exp_month)))
{
				List<WebElement>daylist=driver.findElements(By.xpath("//table//tbody//tr//td"));
				for(WebElement e:daylist)
				{
					String day=e.getText();
					if(day.equals(Exp_day))
					{
						e.click();
						break;
					}
					
				}
}
			
					else
					{
						driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();

					}
				}
				
			
	
}
	}
		

			
			
			
		
		

	


