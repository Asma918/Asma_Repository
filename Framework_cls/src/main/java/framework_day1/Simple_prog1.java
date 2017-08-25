package framework_day1;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple_prog1 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("title is " +driver.getTitle());
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
		
		

	}

}
