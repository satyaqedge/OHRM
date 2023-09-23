package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.AdminUtils;
import orangehrm.library.Employee;

public class AddEmployeeTest extends AdminUtils
{
	 @Parameters({"fname", "lname"})
	@Test
 public void EmpRegTest(String fname, String lname)
 {
	 Employee ep= new Employee();
	  boolean res= ep.AddEmployee(fname, lname);
	  Assert.assertTrue(res);
	 
 }
}
