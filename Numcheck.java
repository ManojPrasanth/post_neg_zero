import java.util.*;
class Numcheck
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(num>0)
		{
			System.out.println("Input is Positive");
		}
		else if(num<0)
		{
		System.out.println("Input is Negative");
		}
		else
		System.out.println("Input is Zero");
	}
}