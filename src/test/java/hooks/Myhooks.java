package hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.ConfigReader;

public class Myhooks {
	
	WebDriver driver;
	
	@Before()
	public void setup() throws IOException {
		
		Properties Prop=ConfigReader.init_pr();
		DriverFactory.init_Driver(Prop.getProperty("browserName"));
		driver =DriverFactory.getDriver();
		driver.get(Prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
    @After()
    public void tearDown() {
    	
    driver.manage().deleteAllCookies();
    driver.quit();
	
    }
    
}
