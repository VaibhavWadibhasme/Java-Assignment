import java.util.Scanner;

public class Febonacci{

	public static void main (String[] args)
	{
		System.out.println("Enter the place till you have to print febonacci series: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int first_no=0;
		int second_no=1;
		
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(first_no+", ");
			
			int next_no=first_no+second_no;
			first_no=second_no;
			second_no=next_no;
		}
	}
}