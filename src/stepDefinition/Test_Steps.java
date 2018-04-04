package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	 WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.firefox.driver", "D:\\Browser-Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.facebook.com");
        System.out.println("Changes for GTIHUTB");
        System.out.println("Changes in  GTIHUTB after new branch from another guy.");
        
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.id("email")).sendKeys(arg1);
		    driver.findElement(By.id("pass")).sendKeys(arg2);
		    driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	}
	
	/*@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.id("email")).sendKeys(arg1);
	    driver.findElement(By.id("pass")).sendKeys(arg2);
	    driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	    
	}*/

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	    
	}

	    
	}
