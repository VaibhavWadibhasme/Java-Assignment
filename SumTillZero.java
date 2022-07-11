import java.util.Scanner;

public class SumTillZero{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int sum=0;
		while(true)
		{
			System.out.print("Enter Number: ");
			int num=s.nextInt();
			if (num!=0)
			{
				sum=sum+num;
			}else if(num==0){
				break;
			}else{
				System.out.print("Invalid input");
			}
		}
		System.out.print("Sum: "+sum);
	}
}