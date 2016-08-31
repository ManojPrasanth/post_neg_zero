import java.util.*;

class Alpha
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character");
	String str=s.nextLine();
	char ch1[]=str.toCharArray();
	char ch=ch1[0];
		if(Character.isAlphabetic(ch))
			System.out.println("Alphabet");
		else
			System.out.println("Not a Alphabet");
	}
}