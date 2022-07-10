import java.util.Scanner;

public class Evenodd{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int a=s.nextInt();
		s.close();
		
		if (a%2==0)
		{
			System.out.println("Number "+a+" is Even Number");
		}else{
			System.out.println("Number "+a+" is Odd Number");
		}
	}
}