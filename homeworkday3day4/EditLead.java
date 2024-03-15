package homeworkday3day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		// Initialize the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL http://leaftaps.com/opentaps/.
        driver.get("http://leaftaps.com/opentaps/.");
        
        //Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click on the Login Button.
		driver.findElement(By.xpath("//input[contains(@class,'decorativeSubmit')]")).click();
		
		//Click on the CRM/SFA Link.
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on the Leads Button.
        driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
        
        //Click on Create Lead.
        driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
        
        //Enter the CompanyName Field Using Xpath.
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf Ltd");
        
        //Enter the FirstName Field Using Xpath.
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Siddarth");
        
        //Enter the LastName Field Using Xpath.
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Siddhu");
        
        //Enter the FirstName (Local) Field Using Xpath.
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Siddarth");
        
        //Enter the Department Field Using any Locator of Your Choice.
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
        
        //Enter the Description Field Using any Locator of your choice.
        driver.findElement(By.id("createLeadForm_description")).sendKeys("To learn automation testing course (Core Java concepts +Selenium Webdrivers+Framework) join in Testleaf Training Institution to Learn Successully and to become an Automation Tester");
        
        //Enter your email in the E-mail address Field using the locator of your choice.
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("siddarthan24@gmail.com");
        
        //Select State/Province as NewYork Using Visible Text.
        WebElement spdd=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
        Select sec=new Select(spdd);
        sec.selectByVisibleText("New York");
       
       //Click on the Create Button.
       driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
       
       //Click on the edit button.
       driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
       
       //Clear the Description Field.
       driver.findElement(By.id("updateLeadForm_description")).clear();
       
       //Fill the Important Note Field with Any text.
       driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium Automation Tester"); 
       
       //Click on the update button.
       driver.findElement(By.className("smallSubmit")).click();
       
       //Get the Title of the Resulting Page.
       System.out.println(driver.getTitle());

	}
	

}
