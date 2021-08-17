package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	static WebDriver driver;
	public static String url = "https://boratech.herokuapp.com/";
	
@Given("User is Home Page")
public void user_is_home_page() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
		
}

@When("User click on Register Link")
public void user_click_on_register_link() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//a[text()='Register']")).click();
    
}

@Then("User Navigate to Register page")
public void user_navigate_to_register_page() {
    // Write code here that turns the phrase above into concrete actions
 WebDriverWait wait = new WebDriverWait(driver, 5);
 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text()='Sign Up']")));
 
}

@When("User insert personal info into Register page")
public void user_insert_personal_info_into_register_page() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("name")).sendKeys("jhonata oliveira");
	driver.findElement(By.name("email")).sendKeys("jhonataoliveira@gmail.com");
	driver.findElement(By.name("password")).sendKeys("jhonata1234");
	driver.findElement(By.name("password2")).sendKeys("jhonata1234");
}

@When("User press on Register button")
public void user_press_on_register_button() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
}

@Then("User check if the new name is displayed on Dashboard")
public void user_check_if_the_new_name_is_displayed_on_dashboard() {
    // Write code here that turns the phrase above into concrete actions

	WebDriverWait wait = new WebDriverWait(driver, 5);
	 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[text()= 'jhonata oliveira']")));
	 
}
}