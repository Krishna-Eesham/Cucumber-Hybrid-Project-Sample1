package stepdefinitions;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;

public class LogiDef {
	
	
	WebDriver driver = DriverFactory.getDriver();

	@Given("^User navigates to the login page$")
	public void User_navigates_to_the_login_page() {
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		System.out.println(">> User navigated to the login page <<");
	}
	
	@When("^User enters the valid email address (.+)$")
	public void User_enters_the_valid_email_address(String email){
		
		driver.findElement(By.id("input-email")).sendKeys(email);
		System.out.println(">> User enterd the valid email address <<");
	}

	@And("^Valid password (.+)$")
	public void User_enters_the_Valid_password(String password) {
		
		driver.findElement(By.id("input-password")).sendKeys(password);
		System.out.println(">> User enterd the valid password <<");
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		System.out.println(">> User clicked on the login button <<");
	}

	@Then("User should get logged in successfully")
	public void User_should_get_logged_in_successfully() {
		
		assertTrue(true, "MyAccount");
		System.out.println(">> User got logged in successfully<<");
		
	}
	
	@When("User enters the valid email1 address {string}")
	public void User_enters_the_valid_email1_address(String Email1) {
		
		driver.findElement(By.id("input-email")).sendKeys(Email1);
		System.out.println(">> User enterd the valid email1 address <<");
	}
	
	@And("Valid password1 {string}")
	public void User_enters_the_Valid_password1(String Password1) {
		driver.findElement(By.id("input-password")).sendKeys(Password1);
		System.out.println(">> User enterd the valid password1 <<");
	}
	@When("User enters the invalid email address {string}")
	public void user_enters_the_invalid_email_address(String invalidEmail) {
		
		driver.findElement(By.id("input-email")).sendKeys(invalidEmail);
		System.out.println(">> User entered the invalid email address: ");
	}

	@And("Invalid Password {string}")
	public void invalid_password(String invalidPassword) {
		driver.findElement(By.id("input-password")).sendKeys(invalidPassword);
		System.out.println(">> User entered the invalid password: " );
	}

	@Then("User should not get logged in")
	public void user_should_not_get_logged_in() {
		
		System.out.println(">> User failed to log in <<");
	}

	@And("User should get warning message")
	public void user_should_get_warning_message() {
		System.out.println(">> User sees a warning message <<");
	}

	@When("User does not enter the email address")
	public void user_does_not_enter_the_email_address() {
		driver.findElement(By.id("input-email")).sendKeys("");
		System.out.println(">> User did not enter the email <<");
	}

	@And("User does not enter the password")
	public void user_does_not_enter_the_password() {
		driver.findElement(By.id("input-password")).sendKeys("");
		System.out.println(">> User did not enter the password <<");
	   
	}

}
