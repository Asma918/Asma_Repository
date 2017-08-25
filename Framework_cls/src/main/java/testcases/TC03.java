package testcases;


import org.testng.annotations.Test;

import base.AnnotationsClass;



public class TC03 extends AnnotationsClass{
	@Test
	public void deleteLead() throws InterruptedException{
		//invokeApp("chrome", url);
		enterData(locateElement("id", "username"), "DemoSalesManager");
		enterData(locateElement("id", "password"), "crmsfa");
		click(locateElement("className", "decorativeSubmit"));
		//click(locateElement("type", "submit"));
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		click(locateElement("linkText", "Phone"));
		clear(locateElement("name", "phoneCountryCode"));
		enterData(locateElement("name", "phoneNumber"), "9790888529");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(4000);
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		String firstLead = get_Text(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		System.out.println("First Lead in search :: " +firstLead);
		click(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		click(locateElement("linkText", "Delete"));
		click(locateElement("linkText", "Find Leads"));
		enterData(locateElement("name", "firstLead"), "bb");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String errorMsg = get_Text(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Error Message :: "+errorMsg);
		String verifyNoLeadMsg = get_Text(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Verify Deleted Leads not present in list "+verifyNoLeadMsg);
		//closeBrowser();
		
		
		
		
		
	}

}
