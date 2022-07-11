import java.util.Scanner;

public class MaxTillZero{// max no till enter 0

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int max=0;
		while(true)
		{
			System.out.print("Enter Number: ");
			int num=s.nextInt();
			if (num>0)
			{
				max=num;
			}else if(num==0){
				break;
			}
		}
		System.out.print("Max number: "+max);
	}
}