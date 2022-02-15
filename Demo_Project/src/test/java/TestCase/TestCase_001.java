package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import BasePackage.Base;

import LogInPage.HomePage;
import LogInPage.WebPage;

public class TestCase_001 extends Base {

	public WebPage lp;
    HomePage homePage;
	 //Step2
	public TestCase_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

    @BeforeMethod
    public void SSSetUp() throws IOException {
        /*
         * Setting up browser and website to execute test scripts
         */
        initialization();
        /*
         * To access all login elements and actions we made an object of LoginPageNew
         * class
         */
        lp=new WebPage();   
    }
    @Test
    public void validateLoginnnn() throws IOException
    {
    	homePage = lp.login22(prop.getProperty("firstname"), prop.getProperty("lastname"));
    }
}
