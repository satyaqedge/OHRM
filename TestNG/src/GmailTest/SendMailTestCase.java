package GmailTest;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;

public class SendMailTestCase extends AppUtils
{

@Parameters({"toemail","subj"})
@Test
void SendMail(String Email , String sub)
{
	System.out.println("Send Mail To:" + Email  + "Subject To:" +sub);
}
   
}
