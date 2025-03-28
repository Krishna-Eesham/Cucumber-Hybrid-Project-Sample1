package stepdefinitions;

import io.cucumber.java.en.*;

public class Search_Def {

	
	@Given("User opens the application")
	public void user_opens_the_application() {
	    
		System.out.println(">>User opened the application<<");
	}

	@When("Enter an available product in search field")
	public void enter_an_available_product_in_search_field() {
	   
		System.out.println(">>User Enterd an available product in search field<<");
	} 

	@And("Clicked on search button")
	public void clicked_on_search_button() {
	
		System.out.println(">>User Clicked on search button<<");
	}

	@Then("Available product should get displayed in search results")
	public void available_product_should_get_displayed_in_search_results() {
	   
		System.out.println(">>Available product got displayed in search results<<");
	}

	@When("Enter a not available product in search field")
	public void enter_a_not_available_product_in_search_field() {
	    
		System.out.println(">>User Enterd a not available product in search field<<");
	}

	@Then("Product should not displayed in search results")
	public void product_should_not_displayed_in_search_results() {
	    
		System.out.println(">>Product not displayed in search results<<");
	}

	@Then("Should displays a There is no product that matches the search criteria message")
	public void should_displays_a_there_is_no_product_that_matches_the_search_criteria_message() {
	   
		System.out.println(">>There is no product that matches the search criteria message displayed <<");
	}

	@When("Not Enter any product in search field")
	public void not_enter_any_product_in_search_field() {
		
		System.out.println(">>User Not Enterd any product in search field <<");
	}
	
}
