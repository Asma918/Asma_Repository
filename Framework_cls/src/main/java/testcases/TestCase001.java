package testcases;

import org.testng.annotations.Test;

import base.AnnotationsClass;

public class TestCase001 extends AnnotationsClass{

		@Test
		public void test() {
			//String appurl="http://leaftaps.com/opentaps";
			  
			//invokeAppChrome(appurl);
			enterData(locateElement("id", "username"), "DemoSalesManager");
			enterData(locateElement("id", "password"), "crmsfa");
			click(locateElement("className", "decorativeSubmit"));
			/*boolean a= verifyTitle("Opentaps Open Source ERP + CRM");
			if(a==true)
				System.out.println("Title verified");
			else
				System.out.println("Title does not match");
			click(locateElement("linkText", "CRM/SFA"));
			click(locateElement("linkText", "Create Lead"));
					 
			//verifytitle
			enterData(locateElement("id", "createLeadForm_companyName"),"XYZ");
			enterData(locateElement("id", "createLeadForm_firstName"), "XYZ");
			enterData(locateElement("id", "createLeadForm_lastName"), "XYZ");
			selectValue(locateElement("id", "createLeadForm_dataSourceId"),"LEAD_CONFERENCE");
			selectValue(locateElement("id", "createLeadForm_marketingCampaignId"),"CATRQ_CARNDRIVER");
			enterData(locateElement("id", "createLeadForm_primaryPhoneNumber"),"980877653");
			enterData(locateElement("id", "createLeadForm_primaryEmail"), "asma@testleaf.com");
			click(locateElement("className", "smallSubmit"));
			String id_value  = get_Text("id","viewLead_companyName_sp");
			String id_number = id_value.substring(id_value.indexOf("(")+1, id_value.indexOf(")"));
			System.out.println("Generated Lead ID is "+id_number);
		closeApp();
	*/	}

	}


