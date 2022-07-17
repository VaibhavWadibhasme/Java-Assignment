import java.util.Scanner;

public class MaxOfThree{

	public static void main(String[] args){
		System.out.print("Enter the Numbers: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		s.close();
		max(a,b,c);
		System.out.println();
		min(a,b,c);
		}

	static void max(int x, int y, int z){
		if(x>y){
			if(x>z){
				System.out.print("Max: "+x);
			}else{
				System.out.print("Max: "+z);
			}
		}else if(y>z){
			System.out.print("Max: "+y);
		}else{
			System.out.print("Max: "+z);
		}

	}
	static void min(int x, int y, int z){
		if(x<y){
			if(x<z){
				System.out.print("Min: "+x);
			}else{
				System.out.print("Min: "+z);
			}
		}else if(y<z){
			System.out.print("Min: "+y);
		}else{
			System.out.print("Min: "+z);
		}

	}
}