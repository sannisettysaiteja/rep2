package demoJava;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testabout {
  @Test
  public void f() {
	  WebDriver driver;
      driver=driverdemo.getDriver("CRM"); //Launch
      driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm"); //url
      driver.manage().window().maximize();
      WebElement a=driver.findElement(By.xpath("//span[text()='AboutUs']"));
      Actions act1=new Actions(driver);
      act1.moveToElement(a).build().perform();
      WebElement b=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
      Actions act2=new Actions(driver);
      act1.moveToElement(b).build().perform();
      driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
      List<WebElement> c=driver.findElements(By.tagName("p"));
      int n=c.size();
      Set<String> t_windows=driver.getWindowHandles();
      for(String s: t_windows)
         {
          driver.switchTo().window(s);
             String con=driver.getWindowHandle();
          }    
      driver.switchTo().frame(driver.findElement(By.name("main_page")));
      WebElement d=driver.findElement(By.xpath("//*[@id=\"demo3\"]"));
      System.out.println(d.getText());

		
		
		
		
	  
	  
	  
  }
}
