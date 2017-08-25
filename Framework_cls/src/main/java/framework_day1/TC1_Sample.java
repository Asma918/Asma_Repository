package framework_day1;
import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import base.CommonMethods;

public class TC1_Sample   {

	 

	 public static void main(String[] args) {
		
		 String appurl="http://leaftaps.com/opentaps";
		 
	 CommonMethods cm=new CommonMethods();
	cm.invokeAppChrome(appurl);
	//WebElement uname= cm.locateElement("id", "username");
	cm.enterData(cm.locateElement("id", "username"), "DemoSalesManager");
	cm.enterData(cm.locateElement("id", "password"), "crmsfa");
	cm.click(cm.locateElement("className","decorativeSubmit"));
	//verifytitle
	cm.click(cm.locateElement("linkText","CRM/SFA"));
	cm.click(cm.locateElement("linkText","Create Lead"));
			 
	//verifytitle
	cm.enterData(cm.locateElement("id", "createLeadForm_companyName"), "aBC");
	cm.enterData(cm.locateElement("id", "createLeadForm_firstName"), "XYZ");
	cm.enterData(cm.locateElement("id", "createLeadForm_lastName"), "pqr");
	cm.selectValue(cm.locateElement("id","createLeadForm_dataSourceId"), "LEAD_CONFERENCE");
	
	cm.selectValue(cm.locateElement("id","createLeadForm_marketingCampaignId"), "CATRQ_CARNDRIVER");
	cm.enterData(cm.locateElement("id", "createLeadForm_primaryPhoneNumber"), "980877653");
	cm.enterData(cm.locateElement("id", "createLeadForm_primaryEmail"), "asma@testleaf.com");
	cm.click(cm.locateElement("className","smallSubmit"));
	String id_value  = cm.get_Text(cm.locateElement("id","viewLead_companyName_sp"));
	String id_number = id_value.substring(id_value.indexOf("(")+1, id_value.indexOf(")"));
	System.out.println("Generated Lead ID is "+id_number);
	cm.closeApp();
			
			/*driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company_Name");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ASma");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Parveen");
			Select src = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
			src.selectByValue("LEAD_CONFERENCE");
			Select campaign = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
			campaign.selectByValue("CATRQ_CARNDRIVER");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("980877653");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("asma@testleaf.com");
			driver.findElement(By.className("smallSubmit")).click();
			String id_value = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			String id_number = id_value.substring(id_value.indexOf("(")+1, id_value.indexOf(")"));
			System.out.println(id_number);
			driver.close();	
			*/
			

		}
}
	



