package demoJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demowebshop {
  @Test
  public void f() {
	  

		WebDriver driver;
		driver=driverdemo.getDriver("CRM");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement src=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//src.click();
	
		 Actions act=new Actions(driver);
		 driver.findElement(By.name("q"));
		  WebElement sai=driver.findElement(By.name("q"));
		  
			act.keyDown(sai,Keys.ALT).sendKeys("computer").sendKeys(Keys.ALT).build().perform();
			  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
			  act.sendKeys(Keys.ENTER).build().perform();
		
		
	  
	  
	  
  }
}
