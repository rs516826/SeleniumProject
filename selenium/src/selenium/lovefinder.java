package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lovefinder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://proposalfinder.com/create-wedding-profile");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@value=\"Edit\"])[1]")).click();
		Thread.sleep(3000);

		 
		
		driver.findElement(By.xpath("(//input[@placeholder=\"First Name\"])[1]")).sendKeys("raj");
		driver.findElement(By.id("cp-mname")).sendKeys("kamlesh");
		driver.findElement(By.id("cp-lname")).sendKeys("singh");
		Thread.sleep(2000);
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement gender=driver.findElement(By.id("cp-gender"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",gender);
		Thread.sleep(2000);
		Select s1 = new Select(gender);
		s1.selectByVisibleText("Male");
		
		WebElement dob=driver.findElement(By.id("cp-dob"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",dob);
		js.executeScript("arguments[0].removeAttribute(\"readonly\")",dob);
		Thread.sleep(2000);
	    dob.sendKeys("31-05-2003");
		Thread.sleep(2000);
		
		WebElement age =driver.findElement(By.id("cp-age"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",age);
		js.executeScript("arguments[0].removeAttribute(\"readonly\")",age);
		Thread.sleep(2000);
	    age.sendKeys("25");
		Thread.sleep(2000);

		
		
		WebElement religion=driver.findElement(By.id("cp-religion"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",religion);
		Thread.sleep(2000);
		Select s3 = new Select(religion);
		s3.selectByVisibleText("Hindu");
		Thread.sleep(2000);
		
	
		
		WebElement cast=driver.findElement(By.id("cp-caste"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",cast);
		Thread.sleep(2000);
		Select s4 = new Select(cast);
		s4.selectByVisibleText("Yadav");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cp-mstatus")).sendKeys("Divorced");  
		Thread.sleep(2000);
		
		WebElement livingtogether=driver.findElement(By.id("cp-hc-living-together"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",livingtogether);
		Thread.sleep(2000);
		Select s5 = new Select(livingtogether);
		s5.selectByVisibleText("Yes");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cp-mothertongue")).sendKeys("Hindi");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cp-height")).sendKeys("5 ft 10 inch");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cp-complexion")).sendKeys("Fair");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cp-diet")).sendKeys("Non-Veg");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cp-weight")).sendKeys("50");
		Thread.sleep(2000);
		
		WebElement graduate=driver.findElement(By.id("cp-gtype"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",graduate);
		Thread.sleep(2000);
		Select s6 = new Select(graduate);
		s6.selectByVisibleText("Graduate");
		Thread.sleep(2000);
		
		WebElement bodytype=driver.findElement(By.id("cp-body-type"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",bodytype);
		Thread.sleep(2000);
		Select s7 = new Select(bodytype);
		s7.selectByVisibleText("Slim");
		Thread.sleep(2000);
		
		WebElement bloodgroup=driver.findElement(By.id("cp-bgroup"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",bloodgroup);
		Thread.sleep(2000);
		Select s8 = new Select(bloodgroup);
		s8.selectByVisibleText("B+ve");
		Thread.sleep(2000);
		
		WebElement hiv=driver.findElement(By.id("cp-hiv"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",hiv);
		Thread.sleep(2000);
		Select s9 = new Select(hiv);
		s9.selectByVisibleText("HIV Not Affected");
		Thread.sleep(2000);
		
		WebElement challenged =driver.findElement(By.id("cp-challenged"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",challenged);
		Thread.sleep(2000);
		Select s10 = new Select(challenged);
		s10.selectByVisibleText("No");
		Thread.sleep(2000);
		
		WebElement diseased =driver.findElement(By.id("cp-diseased"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",diseased);
		Thread.sleep(2000);
		Select s11 = new Select(diseased);
		s11.selectByVisibleText("No");
		Thread.sleep(2000);
		
		WebElement smoking =driver.findElement(By.id("cp-smoking"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",smoking);
		Thread.sleep(2000);
		Select element = new Select(smoking);
		element.selectByVisibleText("No");
		Thread.sleep(2000);
		
		WebElement drinking =driver.findElement(By.id("cp-drinking"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")",drinking);
		Thread.sleep(2000);
		Select s12 = new Select(drinking);
		s12.selectByVisibleText("Yes");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cc-tmc-search-city")).sendKeys("thane");
		Thread.sleep(2000);
		
		driver.findElement(By.id("hc-tmc-search-city")).sendKeys("thane");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class=\"basic-save save section-btn\"])[1]")).click();
		Thread.sleep(3000);
		
	
		
		
		
		
		
		
		
		
		
		   
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		//Select s5 = new Select (driver.findElement(By.xpath()))
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.id("cp-religion")).sendKeys("hindu");
		
		
		
		
		
		
		

	}

}
