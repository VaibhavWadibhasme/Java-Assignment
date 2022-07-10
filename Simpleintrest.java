import java.util.Scanner;

public class Simpleintrest{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		int p=s.nextInt();
		System.out.println("Enter Rate of Intrest: ");
		float r=s.nextFloat();
		System.out.println("Enter Time: ");
		int t=s.nextInt();
		s.close();

		float si=(p*r*t)/100;
		System.out.println("Simple Intrest : "+si);
	}
}