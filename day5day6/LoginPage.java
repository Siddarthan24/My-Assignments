package homework.day5day6;

public class LoginPage extends BasePage{
	
	void performCommonTasks() {
		System.out.println("Perform common task in webpage");
		
	}
	
	public static void main(String[] args) {
		LoginPage LP=new LoginPage();
		LP.findElement();
		LP.clickElement();
		LP.enterText();
		LP.performCommonTasks();
	}

}
