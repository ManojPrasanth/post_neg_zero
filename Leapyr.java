import java.util.*;

class Leapyr
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the year");
	int yr=s.nextInt();
	if(yr%100!=0)
	{
		if(yr%4==0)
		  System.out.println("Leap year");
		else
	  	  System.out.println("Not a leap year");
	}
	else if(yr%400==0)
		System.out.println("Leap year");
	else
	   System.out.println("Not a leap year");

	}
}	