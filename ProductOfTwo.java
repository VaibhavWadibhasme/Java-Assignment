import java.util.Scanner;

public class ProductOfTwo{

	public static void main (String[] args){
		System.out.print("Enter two number: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		System.out.println("Product of Two Number is: "+product(a,b));
		

	}

	static int product(int x, int y){
		int p=x*y;
		return p;
	}
}