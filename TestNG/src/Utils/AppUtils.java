package Utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils
{
     @BeforeTest
	void Login()
	{
		System.out.println("Login");
	}
	  @AfterTest
     void Logout()
     {
    	 System.out.println("logout");
     }
	  @BeforeSuite
	  void LunchApp()
	  {
		  System.out.println("Lunch App");
	  }
	  @AfterSuite
	  void CloseApp()
	  {
		  System.out.println("close App");
	  }
}
