package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;
import orangehrm.library.LoginPage;

public class AdminLoginTestWithInvalidData extends AppUtils
{
	 @Parameters({"Ruid","Rpwd"})
     @Test
	public void AdminLogin(String uid, String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.Login(uid, pwd);
		boolean res= lp.isErrMsgDisplay();
		Assert.assertTrue(res);
	}
}
