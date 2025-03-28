package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Registration_AccountDef {

	WebDriver driver = DriverFactory.getDriver();

@Given("^User navigates to Register Account Page$")//Cap and Dollar Symbols are optional
public void User_navigates_to_Register_Account_Page() {
	
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	
	System.out.println(">>User got navigated to Register Account page<<");
}

@When("User enters the below details into the fields")
public void User_enters_the_below_details_into_the_fields(DataTable table) {
	
	Map<String, String> map = table.asMap(String.class,String.class);
	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(map.get("First Name"));
	System.out.println(">>User entered Fist Name in the to Register Account page<<");
	
	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(map.get("Last Name"));
	System.out.println(">>User entered Last Name in the to Register Account page<<");
	
	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(map.get("Email"));
	System.out.println(">>User entered Email in the to Register Account page<<");
	
	driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys(map.get("telphone"));
	System.out.println(">>User entered telephone in the to Register Account page<<");
	
	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(map.get("password"));
	System.out.println(">>User entered password in the to Register Account page<<");
	
	driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys(map.get("password"));
	System.out.println(">>User re-entered password in the to Register Account page<<");
		
	}

//@When("User enters the First Name {string} into the First Name field")
public void User_enters_the_First_Name(String FirstName){
	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(FirstName);
	System.out.println(">>User enterd First Name into the First Name field<<");
}

//@And("Enters the Last Name {string} into the Last Name field")
public void User_enters_the_Last_Name(String LastName){
	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(LastName);
	System.out.println(">>User enterd Last Name into the Last Name field<<");
}

//@And("Enters the Email{string}into the Email field")
public void User_enters_the_Email(String Email){
	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(Email);
	System.out.println(">>User enterd Email into the Email field<<");
}

//@And("Enters the telephone number {string} into the Telephone field")
public void User_enters_the_telephone_number(String Telephone){
	driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys(Telephone);
	System.out.println(">>User enterd telephone number into the Telephone field<<");
}

//@And("Enters the password {string} into the Password field")
public void User_enters_the_password(String Password){
	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(Password);
	System.out.println(">>User enterd password into the Password field<<");	
}

//@And("Re-enters the password {string} into the Password Confirmation field")
public void User_re_enters_the_password_into_the_Password_Confirmation(String Password){
	driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys(Password);
	System.out.println(">>User enterd password into the Password field<<");

}

@When("Checked_in the Privacy Policy check box")
public void checked_in_the_privacy_policy_check_box() {
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
	System.out.println(">>User Checked_in the Privacy Policy check box<<");
}

@When("Clicked on Continute button")
public void clicked_on_continute_button() {
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	System.out.println(">>User Clicked on Continute button<<");
}

@Then("Account should get created successfully")
public void user_Should_Get_RegisteredAccount_Successfully() {
	
	System.out.println(">>User Account created successfully<<");
}

@When("Click on the Yes Radio button to suscribe the Newsletter")
public void click_on_the_yes_radio_button_to_suscribe_the_newsletter() {
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
	System.out.println(">>User Clicked on the Yes Radio button to suscribe the Newsletter<<");   
}

@When("User dont enther the details in any fields")
public void user_dont_enther_the_details_in_any_fields() {
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	System.out.println(">>User not nther the details in any fields<<");
}
    
@Then("Worning message should dispalped in the mandatory fiedls")
public void worning_message_should_dispalped_in_the_mandatory_fiedls() {
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	System.out.println(">>Worning message got dispalped in the mandatory fiedls<<");
}

@Then("Account should not get created successfully")
public void account_should_not_get_created_successfully() {
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	System.out.println(">>User Account not created <<");
}

@Then("Worning message to be displayed as Email address already existed")
public void worning_message_to_be_displayed_as_email_address_already_existed() {
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	System.out.println(">>Email address already existed worning message got displayed <<");
}

}
