package homeworkday3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_HomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//- Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name.
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Siddarthan");
		//Enter the Surname.
        driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("G");
        //Enter the Mobile number or email address.
        driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("siddarthan24@gmail.com");
        //Re-Enter the email address(not mentioned in home assignment, just tried)
        driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("siddarthan24@gmail.com");
        //Enter the New password.
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sg_1603202322_@2403");
        //Select day in dob dd
        WebElement daydd=driver.findElement(By.xpath("//select[@id='day']"));
        Select s=new Select(daydd);
        s.selectByVisibleText("24");
        //Select month in dob dd
        WebElement monthdd=driver.findElement(By.xpath("//select[@id='month']"));
        Select s1=new Select(monthdd);
        s1.selectByValue("3");
        //Select year in dob dd
        WebElement yeardd=driver.findElement(By.xpath("//select[@id='year']"));
        Select s2=new Select(yeardd);
        s2.selectByVisibleText("1995");
        //select radio button in gender
        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        driver.close();
	}

}
