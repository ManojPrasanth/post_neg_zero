import java.util.*;

class Vowel
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character");
	String str=s.nextLine();
	char ch1[]=str.toCharArray();
	char ch=ch1[0];
	
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("Vowel");
		
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("Vowels");
		
		else
			System.out.println("Consonant");
	}
}