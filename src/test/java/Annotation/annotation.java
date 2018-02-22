package Annotation; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 


public class annotation { 
   WebDriver driver = null; 
   
   
   @Given("^I am on Averex login page$") 
	public void goToFacebook() { 
	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	   driver = new ChromeDriver(); 
      driver.navigate().to("http://patientengagementdemo.azurewebsites.net/"); 
   }
	
   @When("^I enter username as \"(.*)\"$") 
   public void enterUsername(String arg1) {   
      driver.findElement(By.id("UserName")).sendKeys(arg1); 
   }
	
   @When ("^I enter password as \"(.*)\"$") 
   public void enterPassword(String arg1) {
      driver.findElement(By.id("Password")).sendKeys(arg1);
      driver.findElement(By.id("LoginSubmit")).click(); 
   } 
	
   @Then("^Login should fail$") 
   public void checkFail() {  
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "http://patientengagementdemo.azurewebsites.net/Home/AdminDashboard")){ 
            System.out.println("Test1 Pass"); 
      } else { 
         System.out.println("Test1 Failed"); 
      } 
      driver.close(); 
   }
	
   @Then("^Relogin option should be available$") 
   public void checkRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "http://patientengagementdemo.azurewebsites.net/")){ 
            System.out.println("Test2 Pass"); 
      } else { 
         System.out.println("Test2 Failed"); 
      } 
      driver.close(); 
   }
   
   
} 