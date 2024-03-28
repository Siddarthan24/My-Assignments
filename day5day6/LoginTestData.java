package homework.day5day6;

public class LoginTestData extends TestData{
	
	void enterUsername() {
		System.out.println("Enter the username");
	}
	void enterPassword() {
		System.out.println("Enter the password");
	}
	
	public static void main(String[] args) {
		LoginTestData ltd=new LoginTestData();
		ltd.enterCredentials();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.navigateToHomePage();
		
	}

}
