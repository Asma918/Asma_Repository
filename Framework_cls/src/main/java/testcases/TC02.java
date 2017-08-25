package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.AnnotationsClass;


public class TC02 extends AnnotationsClass{

	@Test
	public void TC2() throws InterruptedException {
		// TODO Auto-generated method stub		
		
		enterData(locateElement("id", "username"), "DemoSalesManager");
		enterData(locateElement("id", "password"), "crmsfa");	
		click(locateElement("className", "decorativeSubmit"));
		//click(locateElement("xpath", "//input[@value='Login']"));				
		click(locateElement("linkText", "CRM/SFA"));			
		click(locateElement("linkText", "Leads"));						
		click(locateElement("linkText", "Find Leads"));				
		enterData(locateElement("xpath", "(//input[@name='firstName'])[3]"),"bb");
		click(locateElement("xpath", "//button[text()='Find Leads']"));		
		Thread.sleep(5000);		
        click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        
        boolean checkTitle = verifyTitle("View Lead | opentaps CRM");
        if(checkTitle){
        	        	
            click(locateElement("linkText", "Edit"));        	           
            enterData(locateElement("id", "updateLeadForm_companyName"),"Glencore");
        	            
            click(locateElement("xpath", "//input[@value='Update']"));
            
        	String companyName = get_Text(locateElement("id", "viewLead_companyName_sp"));
        	
        	if(companyName.contains("Glencore")){
        		System.out.println("The Company Name is updated");
        	}
        }
        else{
        	System.out.println("The Title did not match");
        }

		closeApp();

	}

}
