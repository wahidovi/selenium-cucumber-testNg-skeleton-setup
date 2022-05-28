package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FBLogin {



	

	@Given("user open facebook hompage")
	public void user_open_facebook_hompage() {
	
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("baharsharagin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();

	}

	@Given("user enter email and pass")
	public void user_enter_email_and_pass() {

	}

	@Then("user will be logged in")
	public void user_will_be_logged_in() {

	}

}
