import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefinition 
{
	WebDriver driver = null;
	
	@Given("User opens browser")
	public void user_opens_browser() 
	{
		//Add comment - 2nd Sept
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\java\\Eclipse installation\\eclipse-workspace\\Cucumber2\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("User navigates to URL")
	public void user_navigates_to_url() 
	{
		driver.navigate().to("https://www.facebook.com");
	}

	@When("user enters username and password")
	public void user_eneters_username_and_password() 
	{
	  driver.findElement(By.id("email")).sendKeys("arunamane11@gmail.com");
	  //driver.findElement(By.id("email")).clear();
	  
	  driver.findElement(By.id("pass")).sendKeys("Arvik1130@fb");
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() 
	{
	  driver.findElement(By.name("login")).click();   
	}

	@Then("User navigates to homepage")
	public void user_navigates_to_homepage() 
	{
		if(driver.getPageSource().contains("forgotten password"))
				{
					System.out.println("login not success");
				} 
		
		else
		{
			System.out.println("Login sucess");
		}
		
		/*String actualTitle = driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("validation scuccess. Actual title is "+actualTitle);
		}
		else
		{
			System.out.println("validation fail. Actual title is "+ actualTitle);
		} */
		
		driver.navigate().back();
		driver.close();
	}
	
	
	@Given("User navigates to messanger")
	public void user_navigates_to_messanger() {
	    
	}

	@And("User selects recepient")
	public void user_selects_recepient() {
	    
	}

	@When("User types message")
	public void user_types_message() {
	   	}

	@Then("User should be able to click on send button")
	public void user_should_be_able_to_click_on_send_button() {
	    
	}


}
