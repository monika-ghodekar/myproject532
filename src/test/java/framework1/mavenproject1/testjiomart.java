package framework1.mavenproject1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jiomartproject.jiomart;


public class testjiomart extends jiomart{
	private static final Logger logger = LogManager.getLogger(testjiomart.class);
	jiomart jm=new jiomart();
	WebDriver driver; 
       
	@BeforeSuite
	public void OpenBrowser()
	{
		System.out.println("Opening Browser");
		 
		 logger.info("this is a information log message");
	}

	@BeforeClass
	public void OpenApp()
	{

		System.out.println("Opening Application");
        logger.warn("this is a warning log message");

	}

     @BeforeMethod
     public void Loginscenario()
     {
    	
    	 jm.login();
    	 System.out.println("Login succesfully");
    	 logger.info("this is a information log message");
     }
     @Test(priority=0)
     public void homepagesearch1() throws InterruptedException
     {
    	 jm.homepagesearch(driver);
	        logger.warn("this is a warning log message");
    	 
     }
     @Test(priority=1)
     public void offers() throws InterruptedException
     {
    	 jm.alloffers(driver);
    	 logger.debug("this is a debug log message");
    	 
    	 
     }
     @Test(priority=2)
     public void availability() throws InterruptedException
     {
    	 jm.instock(driver);
    	 
    	 
     }
     @AfterMethod
     public void logout1()
     {
     	jm.logout();
     	 
     	logger.info("this is a information log message");
     System.out.println("Sucessfully Logout");


     }

 @AfterClass
public static void CloseApp()

{
	 logger.warn("this is a warning log message");
	System.out.println("Closing application");
}

@AfterSuite
public static void CloseBrowser()
{
	 logger.warn("this is a warning log message");
System.out.println("Closing Browser");
}





	
	
}
