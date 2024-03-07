package homework.day1day2;

public class Palindrome {

	public static void main(String[] args) {
		int input=121;
		int output=0;
		int originalinput=input;
		
		for(int i=input;i>0;i/=10) {
			int rem = i%10;
			output=(output*10)+rem;
			
		}
		if(originalinput==output) {
			System.out.println("palindrome number");
		}
			else {
				System.out.println("Not a palindrome number");
			}
		}
		
		
		
	
		
		
	}
	
		// TODO Auto-generated method stub
		

	


