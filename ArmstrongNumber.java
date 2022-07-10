import java.util.Scanner;

public class ArmstrongNumber{

	public static void main(String[] args)
	{
		System.out.println("Enter Number to check for Armstrong Number: ");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int original_number, remainder, result=0,n=3;
		s.close();

		for(original_number=number;original_number != 0; original_number/=10)
		{
			remainder=original_number%10;
			result+=Math.pow(remainder, n);
		}
		
		if(result==number)
		{
			System.out.println(number+" is an Armstrong number.");
		}else{
			System.out.println(number+" is not an Armstrong number.");
		}
	}
}