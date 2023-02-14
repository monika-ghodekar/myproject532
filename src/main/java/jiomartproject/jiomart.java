package jiomartproject;

import java.time.Duration;

//import org.apache.logging.log4j.core.appender.rolling.action.Duration;

//import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jiomart 
{
	WebDriver driver;
	 

	public void login()
	{
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		String url = "https://www.jiomart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void homepagesearch(WebDriver driver) throws InterruptedException 
	{
	
	WebElement search=driver.findElement(By.id("autocomplete-0-input"));
			
	search.sendKeys("Paneer");
	WebElement searchicon=driver.findElement(By.className("auto_search_icon"));
	searchicon.click();
	Thread.sleep(10000);
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	/*List<WebElement> firstResult = driver.findElements(By.xpath("//div[@id='hits']"));
	
	System.out.println("Size of the list is " +firstResult.size());

	
	
	for(WebElement list1:firstResult)
	{
		
		System.out.println(list1.getText());
		
	}
	
	System.out.println("============================================");
	
	for(int i=0 ; i<firstResult.size(); i++)
		
	{
		System.out.println("This is the secondlist "+ "  " +  firstResult.get(i).getText());
		
	}

	*/
	/*List<WebElement> firstResult = new WebDriverWait(driver,Duration.ofSeconds(20))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='right-block']")));
	
	for(WebElement result :firstResult )
	{
	
		System.out.println(result);
	
	}
	*/
	
	}  
	
	 
	public void instock(WebDriver driver) throws InterruptedException
	{
		WebElement search=driver.findElement(By.id("autocomplete-0-input"));
	
search.sendKeys("Home Appliances");
WebElement searchicon=driver.findElement(By.className("auto_search_icon"));
searchicon.click();
		WebElement chk=driver.findElement(By.xpath("//label[text()=' InStock Products ']"));
		chk.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
		Thread.sleep(10000);
		
	}
	
	
	public void alloffers(WebDriver driver) throws InterruptedException
	{
		WebElement menu=driver.findElement(By.xpath("//div[@class='menu_section']"));
		menu.click();
		WebElement offers=driver.findElement(By.xpath("//a[text()='All Offers']"));
		offers.click();
		Thread.sleep(10000);
		
		
	}


	public void logout()
	{
		
		
		driver.close();
	}
	
	
	
	
	
	

}
