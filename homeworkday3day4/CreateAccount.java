package homeworkday3day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize the WebDriver (ChromeDriver)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");//Load the URL http://leaftaps.com/opentaps/.
		driver.manage().window().maximize();//Maximize the browser window.
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//Enter a username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter a password
		driver.findElement(By.className("decorativeSubmit")).click();//Click the "Login" button.
		driver.findElement(By.partialLinkText("CRM")).click();//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("Accounts")).click();//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Create Account")).click();//Click on the "Create Account" button
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");//Enter a description as "Selenium Automation Tester."
		
		//Select "ComputerSoftware" as the industry.
        WebElement inDD=driver.findElement(By.name("industryEnumId"));
		Select sec=new Select(inDD);
		sec.selectByIndex(3);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement osDD = driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(osDD);
		sec1.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue.
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select sec2 = new Select(sourceDD);
		sec2.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
        WebElement mcDD=driver.findElement(By.id("marketingCampaignId"));
        Select sec3=new Select(mcDD);
        sec3.selectByIndex(6);
        
        //Select "Texas" as the state/province using SelectByValue
        WebElement spDD=driver.findElement(By.id("generalStateProvinceGeoId"));
        Select sec4=new Select(spDD);
        sec4.selectByValue("TX");
        
        //Click the "Create Account" button.
        driver.findElement(By.className("smallSubmit")).click();
        
        //Verify that the account name is displayed correctly.
        String accountName="Selenium Automation Tester";
        driver.findElement(By.id("accountName")).sendKeys(accountName);
        String verifyName=driver.findElement(By.xpath("//input[@id='accountName']")).getText();
        
        if(accountName.contains(verifyName)){
        System.out.println("Account Created Successfully");
        }
        else{
        System.out.println("Account Not Created Successfully");
        }
        //Close the browser window.
        driver.close();
	}

}
