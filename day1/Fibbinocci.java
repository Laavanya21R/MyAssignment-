package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		
		
		int firstNum = 0;
		int secNum =1;
		int noOfTimes =11;
		int sum;
		
		
		for (int i=1; i<=noOfTimes; i++)
			
		{
			System.out.println(firstNum);
			
		 sum = firstNum + secNum;
			
			firstNum = secNum;
			secNum = sum;
			
			
		
		}
	}

}
