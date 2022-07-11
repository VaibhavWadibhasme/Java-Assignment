import java.util.Scanner;

public class Substraction{

	public static void main(String[] args)
	{
		System.out.println("Enter the Number: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		int remender, product=1,sum=0;
		while(num>0)
		{
			remender=num%10;
			product=product*remender;
			sum=sum+remender;
			num=num/10;
		}
		int ans=product-sum;
		System.out.println("Substraction of product & Sum of digit of given Integaer: "+ans);
	}
}