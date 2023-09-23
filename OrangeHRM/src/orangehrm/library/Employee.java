package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.AppUtils;

public class Employee extends AppUtils
{
	public boolean AddEmployee(String fname, String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		 String empid=  driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
	    WebElement table=	driver.findElement(By.id("resultTable"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		boolean isempidDisplay = false;
		for(int i=1; i<rows.size(); i++)
		{
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empid))
			{
				isempidDisplay = true;
				break;
			}
		}
		return isempidDisplay;
		
	}
	
	public void DeleteEmployee(String empid)
	{
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
		 WebElement table= driver.findElement(By.id("resultTable"));
		 List<WebElement> rows= table.findElements(By.tagName("tr"));
		 for(int i = 1; i<rows.size(); i++)
		 {
			 List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			 if(cols.get(1).getText().equals(empid))
			 {
				 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				 driver.findElement(By.id("btnDelete")).click();
				 driver.findElement(By.id("dialogDeleteBtn")).click();
			 }
			 
		 }
		
	}
	public boolean AddEmployee(String fname, String mname, String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("middleName")).sendKeys(mname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		 String empid=  driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
	    WebElement table=	driver.findElement(By.id("resultTable"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		boolean isempidDisplay = false;
		for(int i=1; i<rows.size(); i++)
		{
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empid))
			{
				isempidDisplay = true;
				break;
			}
		}
		return isempidDisplay;
		
	}
}
