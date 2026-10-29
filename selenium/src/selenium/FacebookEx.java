package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String extTitle="facebook";
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


