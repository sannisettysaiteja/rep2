import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testme {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver sai1;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	sai1 =new ChromeDriver();
	sai1.get("https://www.facebook.com/");
	WebElement ab=sai1.findElement(By.name("email"));
	//ab.click();
	WebElement cd=sai1.findElement(By.name("userName"));
	WebElement ef=sai1.findElement(By.id("pass"));
//	WebElement 
//	cd.sendKeys("Lalitha");
//	ef.sendKeys("password123");
//	WebElement gh=sai1.findElement(By.name("Login"));
//	gh.click();
//		
		

	}

}
