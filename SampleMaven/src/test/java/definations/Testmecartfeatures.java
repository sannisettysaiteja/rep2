package definations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Testmecartfeatures {

	@Given("Application launched by registered user for cart")
	public void application_launched_by_registered_user_for_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for application launch");
	}

	@Then("user verifyin add item")
	public void user_verifyin_add_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for add item");
	}

	@Then("user verifying remove item")
	public void user_verifying_remove_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for remove item");
	}

	@Then("user verifies the max count of items in cart")
	public void user_verifies_the_max_count_of_items_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for max items in cart");
	}

	}


