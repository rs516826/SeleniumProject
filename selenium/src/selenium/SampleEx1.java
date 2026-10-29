package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//classname objectname = new classname();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new FirefocDriver();
		//WebDriver driver2=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String extTitle="Swag Labs";
		String ActTitle=driver.getTitle();
		
		System.out.println(ActTitle);
		
		if(extTitle.equalsIgnoreCase(ActTitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
	
		Thread.sleep(3000);
		
		driver.close();
	}
		
		
		
		
		
		
		

		
	}


