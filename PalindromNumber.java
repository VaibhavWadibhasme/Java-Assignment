import java.util.Scanner;

public class PalindromNumber{

	public static void main(String[] args)
	{
		System.out.println("Enter number : ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		int original_num=num;
		int reverse_num=0, rem;

		while(num>0)
		{
			rem=num%10;
			reverse_num=reverse_num*10+rem;
			num/=10;
		}
		if(original_num==reverse_num){
			System.out.println(original_num+" is a Palindrom Number");
		}else{
			System.out.println(original_num+" is not a Palindrom Number");
		}
	}
}