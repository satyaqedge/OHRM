package orangehrm.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.AppUtils;

public class AdminUtils extends AppUtils
{
	String adminuid="Admin";
    String adminpwd= "Qedge123!@#"; 
    LoginPage lp;
    @BeforeTest
	public void AdminLogin()
	{
		 lp = new LoginPage();
		lp.Login(adminuid, adminpwd);
		
	}
     @AfterTest
    public void AdminLogout()
    {
    	lp.Logout();
    }
    
}
