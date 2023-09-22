package stepdefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM
{
	public WebDriver driver;
	public String empid;
	
	@Given("i open browser with the url {string}")
	public void i_open_browser_with_the_url(String url)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get(url);
	}
	@Then("i should see login page")
	public void i_should_see_login_page()
	{
	   if(driver.findElement(By.id("btnLogin")).isDisplayed())
	   {
		   System.out.println("System Displayed Login Page");
	   }
	}
	@When("i entered username as {string}")
	public void i_entered_username_as(String uid)
	{
	   driver.findElement(By.id("txtUsername")).sendKeys(uid);
	}
	@When("i entered password as {string}")
	public void i_entered_password_as(String pwd)
	{
	   driver.findElement(By.id("txtPassword")).sendKeys(pwd);  
	}
	@When("i click login button")
	public void i_click_login_button() 
	{
	  driver.findElement(By.id("btnLogin")).click();
	}
	@Then("i should see admin module")
	public void i_should_see_admin_module()
	{
	    if(driver.findElement(By.linkText("Admin")).isDisplayed())
	    {
	    	System.out.println("Admin Module Displayed");
	    }
	}
	@When("i click logout")
	public void i_click_logout() 
	{
	  driver.findElement(By.partialLinkText("Welcome")).click();
	  driver.findElement(By.linkText("Logout")).click();
	}
	
	@When("i close browser")
	public void i_close_browser() 
	{
	   driver.quit();
	}
	
	@When("click login button")
	public void click_login_button()
	{
		 driver.findElement(By.id("btnLogin")).click();
	}
	@Then("i should see error message")
	public void i_should_see_error_message()
	{
	   String emsg= driver.findElement(By.id("spanMessage")).getText().toLowerCase();
	   if(emsg.contains("invalid") || emsg.contains("empty"))
	   {
		   System.out.println("Error Message Displayed");
	   }
	}
	
	@When("i go to add employee page")
	public void i_go_to_add_employee_page() 
	{
	   driver.findElement(By.linkText("PIM")).click();
	   driver.findElement(By.linkText("Add Employee")).click();
	}
	@When("i enter firstname as {string}")
	public void i_enter_firstname_as(String fname)
	{
	   driver.findElement(By.id("firstName")).sendKeys(fname);
	}
	@When("i enter lastname as {string}")
	public void i_enter_lastname_as(String lname)
	{
	   driver.findElement(By.id("lastName")).sendKeys(lname);
	}
	@When("i click save")
	public void i_click_save()
	{
	  empid= driver.findElement(By.id("employeeId")).getAttribute("value");
	  driver.findElement(By.id("btnSave")).click();
	}
	@Then("i Should see Registered Employee in employee list")
	public void i_should_see_registered_employee_in_employee_list() 
	{
	  driver.findElement(By.linkText("Employee List")).click();
	  driver.findElement(By.id("empsearch_id")).sendKeys(empid);
	  driver.findElement(By.id("searchBtn")).click();
	  
	  WebElement table=	driver.findElement(By.id("resultTable"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		for(int i=1; i<rows.size(); i++)
		{
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empid))
			{
				System.out.println("System displaying New Employee Registration in Eployee list");			}
		}
	 
	
	
	}
	

}