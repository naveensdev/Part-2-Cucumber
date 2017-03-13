package cucumber_Login;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Login {
	  
	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
				WebDriver Driver = new ChromeDriver();
				/*System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.13.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();*/
				Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				Driver.get("https://v2-pre-prod-app.krossover.com/intelligence/login");
				Driver.findElement(By.name("email")).sendKeys("adityakumar643@yahoo.com");
				Driver.findElement(By.name("password")).sendKeys("password");
				Driver.findElement(By.id("sign-in-cta")).click();
				System.out.println("Done");
	// End of script 				
	 
}
}


		

		
	

