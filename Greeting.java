import java.util.Scanner;

public class Greeting{
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name ");
		String n=s.nextLine();
		s.close();
		System.out.println("Hello! "+n);
	}
}