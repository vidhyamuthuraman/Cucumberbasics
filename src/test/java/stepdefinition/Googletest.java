package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googletest {
       WebDriver driver;
       @Given("browser window is open")
       public void opengoogle()
       {
    	   driver=new ChromeDriver();
    	  // System.out.println("open");
    	   //driver=new ChromeDriver();
   		//driver.get("https://www.google.com/"); 
       }
       @Given("Enter url")
       public void url()
       {
    	   driver.get("https://www.google.com/");
    	   //System.out.println("google");
       }
       
      @ When ("Google is opened")
      
      public void googleisopen()
      {
    	 
    	  System.out.println( driver.getTitle());
      }
    	 
      
  		@Then("search {string} with google")
  		public void search(String string)
  		{
  			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(string);
  			System.out.println("search text"+string);
  		}
       
       @Then("click Enter")
       public void clickenter()
       { driver.findElement(By.xpath("//input[@name='q']")).click();
    	   //System.out.println("Click Enter");
       }
       
       
       
       
       
       
       
       
/*	@Given("open chrome and go to google")
	public void open_chrome_and_go_to_google() 
	{
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("enter valid keyword")
	public void enter_valid_keyword() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");
		//System.out.println("Enter Keyword");
		
	    
	}

	@Then("click search or enter")
	public void click_search_or_enter() 
	{
		driver.findElement(By.xpath("//input[@name='q']")).submit();
		//System.out.println("Click search");
	}
	
	/*@Given("go to google")
	public void open_chrome_and_go_to_google1() 
	{
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}*/
	/*@When("go to Apps")
	public void gotoapps() {
		
		
		WebElement w=driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
				//driver.findElement(By.xpath("//a[@class='gb_e']"));
		Actions a=new Actions(driver);
		a.moveToElement(w).build().perform();
		
		
		//System.out.println("Enter Keyword");
		
	    
	}
	@Then("click Apps")
	public void clickapps() 
	{   
		//driver.findElement(By.xpath("//input[@name='q']")).submit();
		//System.out.println("Click search");
		//driver.findElement(By.xpath("//a[@class='gb_e']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	}*/
	

}
