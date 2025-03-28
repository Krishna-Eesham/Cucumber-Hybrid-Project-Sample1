package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {

	public static WebDriver driver;
	
	public static void init_Driver(String browserName)
	{
	if(browserName.equals("Chrome"))
	{
	driver = new ChromeDriver();
	}
	else if(browserName.equals("Firefox"))
	{
	driver = new FirefoxDriver();
	 
	}
	else if(browserName.equals("Edge"))
	{
	driver = new EdgeDriver();
	}
	else 
	{
	System.out.println("Enter a valid browser name");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} 
	
	public static WebDriver getDriver() {
		
		return driver;
	}
}