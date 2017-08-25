package pagefactory_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadPage extends CommonAbstractPage {

	
	public LeadPage(){
		
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement createlead;
	
	public CreateLeadPage clickCreateLead()
	{
		click(createlead);
		return new CreateLeadPage();
	}
	
}

