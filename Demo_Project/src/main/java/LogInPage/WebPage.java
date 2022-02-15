package LogInPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



//import com.corp.qa.PageLayer.HomePage;

import BasePackage.Base;

public class WebPage extends Base{

	


	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement button;

	
	//Initializing the Page Objects:
	public WebPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
		
		
		//Action - validate Login and action on Elements
		public HomePage login22(String firstname1, String lastname1) throws IOException{
			
			firstname.click();
			firstname.sendKeys(firstname1);
			lastname.click();
			lastname.sendKeys(lastname1);
			button.click();
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
			
			
			return new HomePage();
			
		}
}




//input[@type='submit']
