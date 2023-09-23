package orangehrm.library;

import org.openqa.selenium.By;

import Utils.AppUtils;

public class LoginPage extends AppUtils
{

public void Login(String uid, String pwd)
{
	driver.findElement(By.id("txtUsername")).sendKeys(uid);
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	driver.findElement(By.id("btnLogin")).click();
	
}
public boolean isAdminModuleDisplay()
{
	if(driver.findElement(By.linkText("Admin")).isDisplayed())
	{
		return true;
	}else
	{
		return false;
	}
}
public void Logout()
{
	driver.findElement(By.partialLinkText("Welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
}
public boolean isErrMsgDisplay()
{
String emsg=	driver.findElement(By.id("spanMessage")).getText().toLowerCase();
	if(emsg.contains("invalid") || emsg.contains("empty"))
	{
		return true;
	}else
	{
		return false;
	}
}
	
}
