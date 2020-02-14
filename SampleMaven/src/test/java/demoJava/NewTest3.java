package demoJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver ;
      driver=driverdemo.getDriver("CRM");
      driver.get("https://www.naukri.com/");
      Thread.sleep(3000);
     String text= driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div/h3")).getText();
     System.out.println(text);
  }
}
