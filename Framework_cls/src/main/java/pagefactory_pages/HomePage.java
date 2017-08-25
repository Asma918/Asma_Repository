package pagefactory_pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAbstractPage {



		public HomePage(){
		
			PageFactory.initElements(eventdriver, this);
		}
		
		@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
		WebElement CRMLink;
		public LeadPage clickCRMLink()
		{
			click(CRMLink);
			return new LeadPage();
		}
		
}



