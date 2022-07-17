import java.util.Scanner;

public class EvenOdd2{

	public static void main(String[] args){
		System.out.print("Enter Number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		evenodd(n);
		
	}
	
	static void evenodd(int num){
		if (num%2==0){
			System.out.println(num+" Is a Even Number");
		}else{
			System.out.println(num+" Is a Odd Number");
		}
	}
}