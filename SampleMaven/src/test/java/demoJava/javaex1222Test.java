package demoJava;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class javaex1222Test 
{
  @Test(enabled=false)
  public void Keyboardactions() {
	  
	  WebDriver driver;
	  driver=driverdemo.getDriver("CRM");
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q"));
	  WebElement sai=driver.findElement(By.name("q"));
	//  sai.sendKeys("accenture");
	  Actions act=new Actions(driver);
	  
	act.keyDown(sai,Keys.ALT).sendKeys("accenture").sendKeys(Keys.ALT).build().perform();
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
  }  
  
 
  
@Test
public void dnd() throws Exception {
	
	WebDriver driver;
	driver=driverdemo.getDriver("CRM");
	driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement src=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	WebElement dst=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[1] "));
	Actions act5=new Actions(driver);
	act5.dragAndDrop(src,dst).build().perform();
    WebElement s1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tfoot/tr/td[2]"));
    Thread.sleep(2000);
    String A_val=s1.getText();
    String E_val="$3999";
    Assert.assertEquals(A_val,E_val);
    System.out.println("Drag and drop is success");  
    
    
    
}

}








