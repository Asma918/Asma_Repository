package pagefactory_testcases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.AnnotationsClass;
import pagefactory_pages.LoginPage;

public class LoginTC extends AnnotationsClass {
@Test(dataProvider="DataForCeateLead")


	public void login(String uname,String pWd,String comName,String fName, String lName, String email,String phNum)
	{
		new LoginPage()
		.enterUsername(uname)
		.enterPassword(pWd)
		.clickLoginButton();
		/*.clickCRMLink()
		.clickCreateLead()
		.enterCompanyName()
		.enterFistName()
		.enterLastName()
		.selectSource()
		.selectCampaignId()
		.enterPhNum()
		.enterEmail()
		.clickCreateLeadButton()
		.getLeadId();
		*/	
	}
	




@DataProvider(name="DataForCeateLead")
public Object[][] input()
{
	Object data[][]=new Object[1][7];
	data[0][0]="DemoSalesManager"; data[0][1]="crmsfa";
	data[0][2]="CG"; data[0][3]="firstname"; data[0][4]="lastname";
	data[0][5]="abc@gamil.com"; data[0][6]="1234569870";
	return data;
}

}
