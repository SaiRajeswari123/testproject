package BasePackage;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;

//import LogInPage.HomePage;


public class Base{

	//private static final String TestUtil = null;
	public  static WebDriver driver;
	public  static Properties prop;
	public  Base() throws IOException{
	
		prop= new Properties();
		 FileInputStream fis=new FileInputStream("./Confiigarations\\Config1.Properties");
		prop.load(fis);
		
	}
		 
	
	
	
	public static void initialization(){
        String browserName = prop.getProperty("browserName");

        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
            driver= new ChromeDriver();
            //DesiredCapabilities dc=new DesiredCapabilities();
            //dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);


        }
        else if(browserName.equalsIgnoreCase("FF")){

            System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
            driver = new FirefoxDriver();
        }
 
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);  
        driver.get(prop.getProperty("baseurl"));
        //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
      // driver.findElement(By.xpath("link1")).click();
      // String link1xpath = prop.getProperty("link1");
        
       // driver.findElement(By.linkText(link1xpath)).click();
        
        
        String linkxpath = prop.getProperty("link");
		driver.findElement(By.linkText(linkxpath)).click();
		String link1xpath = prop.getProperty("link1");
		driver.findElement(By.linkText(link1xpath)).click();
		

    }
	

}
