package CucumberJava;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 



public class stepdefinition { 
   WebDriver driver = null; 
	
   @Given("user navigates to averex") 
   public void goToAverex() { 
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver(); 
      driver.navigate().to("http://patientengagementdemo.azurewebsites.net/"); 
   } 
	
   @When("I enter Username as \"admin\" and Password as \"123.Com!\"") 
   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
      driver.findElement(By.id("UserName")).sendKeys(arg1);
      driver.findElement(By.id("Password")).sendKeys(arg2);
      driver.findElement(By.id("LoginSubmit")).click(); 
   } 
	
   @Then("login should be unsuccessful") 
   public void validateRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
      "http://patientengagementdemo.azurewebsites.net/Home/AdminDashboard")){
         System.out.println("Test Pass"); 
      } else { 
         System.out.println("Test Failed"); 
      } 
      driver.close(); 
   }    
}
