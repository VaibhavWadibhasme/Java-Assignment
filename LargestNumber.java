import java.util.Scanner;

public class LargestNumber{

	public static void main(String[] args)
	{
		System.out.println("Enter Two Number for checking which one is largest: ");
		Scanner s= new Scanner(System.in);
		long first_no=s.nextLong();
		long second_no=s.nextLong();
		s.close();

		if(first_no>second_no)
		{
			System.out.println(first_no+" is the Largest Number");
		}else{
			System.out.println(second_no+" is the Largest Number");
		}
	}
}