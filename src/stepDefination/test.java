package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {
	
	public static WebDriver Driver;
	
	@Given("^User is on home page of Krossover Website$")
	public void user_is_on_home_page_of_Krossover_Website() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("https://v2-pre-prod-app.krossover.com/intelligence/login");
		Driver.manage().window().maximize();
	}
	
	@When("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	   System.out.println("Login Page displayed ");
	    
	}    
	
	@When("^User enter the valid credentail$")
	public void user_enter_the_valid_credentail() throws Throwable {
	    
		Driver.findElement(By.xpath("html/body/section/div[3]/main/div/form/div[1]/input")).sendKeys("adityakumar643@gmail.com");
		Driver.findElement(By.xpath("html/body/section/div[3]/main/div/form/div[2]/input")).sendKeys("Welcome@home");
		Driver.findElement(By.id("sign-in-cta")).click();
		Driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	}
	
	@Then("^message displayed Login Successfully \\.$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    System.out.println("Login Successful");

}
}



