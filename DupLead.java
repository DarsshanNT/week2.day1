package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DupLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//call WDM for browser driver
		WebDriverManager.chromedriver().setup();
	//launch the browser
		ChromeDriver driver = new ChromeDriver();
	//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
	//maimize the browser
		driver.manage().window().maximize();
	//enter user name with value (demosalesmanager)
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	//enter password with value (crmsfa)
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	//click on the login button 
		driver.findElement(By.className("decorativeSubmit")).click();
	//click on CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
	//click on the leads button
		driver.findElement(By.linkText("Leads")).click();
	//click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
	//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NTD");
    //enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Darsshan");
	//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NT");
	//enter firstname local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("darsshan");
	//enter department field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");
	//enter discription field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
	//enter your email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("darsshan@gmail.com");
	//select state
		WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	//convert to select class
		Select select = new Select (findElement);
	//select select by visible text
		select.selectByVisibleText("Oregon");
	//click on create button
		driver.findElement(By.name("submitButton")).click();	
	//get the title of resultingpage
		String ViewLead = driver.getTitle();
		System.out.println("ViewLead");
	//click on dup button
		driver.findElement(By.linkText("Duplicate Lead")).click();
	//clear companyname
		driver.findElement(By.id("createLeadForm_companyName")).clear();
	//enter new companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NST");
	//clear first name field
		driver.findElement(By.id("createLeadForm_firstNameLocal")).clear();
	//enter new first name
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Darsshanthangavelu");
	//click on create lead	
		driver.findElement(By.name("submitButton")).click();
	//get the title
		String viewlead = driver.getTitle();
		System.out.println("viewlead");
		
		
	}

}
