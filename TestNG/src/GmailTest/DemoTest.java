package GmailTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest 
{
     @Test
	void test()
	{
		int actvalue=20;
		int expvalue=10;
		Assert.assertEquals(actvalue, expvalue);
		
	}
	
}
