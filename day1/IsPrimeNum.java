package week1.day1;

public class IsPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 127;
		int count=0;
	
		for (int i=1; i<=num; i++)
		{
		if(num % i ==0)
		count++;
		}
		if (count ==2)
			
			System.out.println("the given number " + num + " is prime");
		
		else 
			
			System.out.println("the given number " + num + " not prime");
		
	}
}