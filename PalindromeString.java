import java.util.Scanner;

public class PalindromeString{

	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Word to check for Paliandrome: ");
		String str=s.nextLine();
		s.close();
		String reverse="";
		int strlength=str.length();

		for(int i=(strlength-1); i>=0; i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if (str.toLowerCase().equals(reverse.toLowerCase()))
		{
			System.out.println(str+ " is a Palindrome.");
		}
		else
		{
			System.out.println(str+ " is not a Palindrome.");
		}
	}
}