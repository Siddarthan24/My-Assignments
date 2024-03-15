package homeworkday3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractionWithCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		// Initialize the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL https://leafground.com/checkbox.xhtml
        driver.get("https://leafground.com/checkbox.xhtml");
        
        //Maximize the browser window
		driver.manage().window().maximize();
		
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on basic checkbox
		driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();
		
		//Click on notification checkbox
		driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
		
		//Verify that the expected message is displayed.
		WebElement messageElement1 =driver.findElement(By.xpath("//span[text()='Checked']"));
		String actualMessage=messageElement1.getText();
		String expectedMessage="Checked";
		if(actualMessage.contains(expectedMessage)) {
			System.out.println("expected message is displayed");
		}
		else {
			System.out.println("expected message is not displayed");
		}
		
		//Click on your favorite language
		driver.findElement(By.xpath("//label[contains(text(),'Java')]")).click();
		
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		
		//Verify which tri-state option has been chosen.
		WebElement messageElement2 = driver.findElement(By.xpath("//p[text()='State = 1']"));
		
		// Verify that the expected message is displayed
		String actualMessage2 = messageElement2.getText();
		String expectedMessage2 = "State = 1";
		if (actualMessage2.contains(expectedMessage2)) {
			System.out.println("Expected message is displayed: " + expectedMessage2);
		} 
		else {
			System.out.println("Expected message is not displayed. Actual message: ");
		}
		
		//- Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		
		//Verify that the expected message is displayed.
		WebElement messageElement3=driver.findElement(By.xpath("//span[text()='Checked']"));
		String actualMessage3=messageElement3.getText();
		String expectedMessage3="Checked";
		if(actualMessage3.contains(expectedMessage3)) {
			System.out.println("Expected message displayed for toggle switch");
		}
		else {
			System.out.println("Expected message is not displayed for toggle switch");
		}
			
		
		//Verify if the Checkbox is disabled		
		WebElement Checkbox = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]"));
		if (Checkbox.isEnabled()) {
			//Check whether the checkbox is selected or not
			if (Checkbox.isSelected()) {
				System.out.println("Checkbox is already selected.");
			} else {
				System.out.println("Checkbox is disabled.");
			} 

		}
		
		//select multiple options on page
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox ui-widget')])[13]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox ui-widget')])[15]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox ui-widget')])[17]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-close')]")).click();
		
		//Close the web browser
		driver.close();
		
	}
					
		}


