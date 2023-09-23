package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;
import orangehrm.library.LoginPage;

public class AdminLoginTestWithValidData extends AppUtils
{
	 @Parameters({"AdminUid","AdminPwd"})
     @Test
	public void CheckAdminLogin(String Auid, String Apwd)
	{
		LoginPage lp = new LoginPage();
		lp.Login(Auid, Apwd);
	    boolean res=	lp.isAdminModuleDisplay();
	    Assert.assertTrue(res);
	    lp.Logout();
	}
	
}
