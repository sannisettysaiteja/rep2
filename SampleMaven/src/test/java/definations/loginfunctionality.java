package definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demoJava.driverdemo;

public class loginfunctionality {
	@Given("application is launched by the guest user")
	public void application_is_launched_by_the_guest_user() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		
		

		WebDriver driver;
		driver=driverdemo.getDriver("CRM");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("Application is launched")
	public void application_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		
	}
	@When("user enters data for every mandatory field")
	public void user_enters_data_for_every_mandatory_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	
	}

	@When("submits the application")
	public void submits_the_application() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("verifies registration status")
	public void verifies_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@When("user enters valid user name {string}")
	public void user_enters_valid_user_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@When("user enters valid password   {string}")
	public void user_enters_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("user submits the application")
	public void user_submits_the_application() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("verifies the login status")
	public void verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
