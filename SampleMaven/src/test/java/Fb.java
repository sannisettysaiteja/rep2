import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver sai1;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		sai1 =new ChromeDriver();
		sai1.get("https://www.facebook.com/");
		WebElement cd=sai1.findElement(By.name("firstname"));
		WebElement ef=sai1.findElement(By.name("lastname"));
		WebElement gh=sai1.findElement(By.id("u_0_r"));
		WebElement ij=sai1.findElement(By.id("u_0_w"));
		
		
		
		
		

	}

}
