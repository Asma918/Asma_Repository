package pagefactory_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends CommonAbstractPage {

	public CreateLeadPage()
	{
		PageFactory.initElements(eventdriver, this);
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement companyName;
	public CreateLeadPage enterCompanyName()
	{
		enterData(companyName, "Capgemini");
		return this;
	}
	

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement firstName;
	public CreateLeadPage enterFistName()
	{
		enterData(firstName, "Asma");
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement lastName;
	public CreateLeadPage enterLastName()
	{
		enterData(lastName, "Parveen");
		return this;
	}

	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	WebElement selectSource;
	public CreateLeadPage selectSource()
	{
		selectValue(selectSource, "LEAD_CONFERENCE");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	WebElement selectCampaignId;
	public CreateLeadPage selectCampaignId()
	{
		selectValue(selectCampaignId, "CATRQ_CARNDRIVER");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	WebElement phoneNum;
	public CreateLeadPage enterPhNum()
	{
		enterData(phoneNum, "6312479234");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	WebElement email;
	public CreateLeadPage enterEmail()
	{
		enterData(email, "parveen@gmail.com");
		return this;
	}
		
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	WebElement createleadButton;
	public ViewLeadPage clickCreateLeadButton()
	{
		click(createleadButton);
		return new ViewLeadPage();
	}
}



