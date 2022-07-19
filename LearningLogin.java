package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningLogin {

	private static String title;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//we have to call wdm for the browser driver
		
		WebDriverManager.chromedriver().setup();
		  String property = System.getProperty("webdriver.chrome.driver");
		 System.out.println(property);
		 
	//launch the browser (chrome)
		 ChromeDriver driver = new ChromeDriver();
		 
	//load the URL
		 driver.get("http://leaftaps.com/opentaps");
		 
    //maximize the browser
		 driver.manage().window().maximize();
		 
    //close browser
		 //driver.close();
		 
		             // after learning html basics
		             // and login with the help of html

    //find the user name and enter the user name value (demosalesmanager)
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
	//find the password field and enter the password value (crmsfa)
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
	//click the login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
	//get the text
		 String text = driver.findElement(By.tagName("h2")).getText();
		 System.out.println(text);
		 
	//finally, we need to check we are in correct page
		 WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		 
	/*
	 * what is ebelement
	 * 
	 *   the method find element will find the first match element by the given locator in the DOM web page
	 *      otherwise
	 *      if there is no match it will throw exception no such elements
	 *      	 
	 */
		 
	//get the attribute and print
		  
		 String attribute = logout.getAttribute("value");
		 System.out.println(attribute);
		 if(attribute.equals("Logout")) {
		 System.out.println("successfully Logged In");
		 }
		 
	//click CRMSFA
		  
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
	//click leads tab
		 driver.findElement(By.linkText("Leads")).click();
		 
	//click create lead link
		 driver.findElement(By.linkText("Create Lead")).click();
		 
	//enter company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
		 
	//enter first name
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Darsshan");
		 
	//enter the last name
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NT");
		  
	//find the first dropdown in sourse
		 WebElement createLeadForm_dataSourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 
	//convert to select class
		 Select source = new Select (createLeadForm_dataSourceId);
		 
	//select source by visible text
		 source.selectByVisibleText("Existing Customer");
		 
	//click create lead
		 driver.findElement(By.name("submitButton")).click();
		 
	//verify the verify page title
		 String title = driver.getTitle();
		 System.out.println(title);
		 if(title.equals("View Lead | opentaps CRM"))
			 System.out.println("the page is verified");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		

	}

}
