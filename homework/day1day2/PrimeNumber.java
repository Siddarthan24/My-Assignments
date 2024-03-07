package homework.day1day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=17;
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
		}
		}
		if(count==2) {//only 2 divisors like 1 and same number of declaration
			System.out.println("Number is Prime Number");
		}
		else {
			System.out.println("Number is not a prime number");
		}
			

	}

}
