package CucumberJava; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 

public class cucumberJava { 
   WebDriver driver = null; 
	
   @Given("I have open the browser") 
   public void openBrowser() 
   { 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver(); 
   } 
	
   @When("I open Averex website") 
   public void goToFacebook() { 
      driver.navigate().to("http://patientengagementdemo.azurewebsites.net/"); 
      
   } 
	
   @Then("Login submit button should exits") 
   public void loginButton() 
   { 
      if(driver.findElement(By.id("LoginSubmit")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      //driver.close(); 
   } 
}