package pagefactory_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends CommonAbstractPage{

	public ViewLeadPage(){
	  
		PageFactory.initElements(eventdriver, this);
	}
	
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	WebElement leadId;
	
	public void getLeadId()
	{
		String id = get_Text(leadId);
		String leadid = id.substring(id.indexOf('(')+1, id.indexOf(')'));
		System.out.println("Lead Id is " +leadid);
	}
}
