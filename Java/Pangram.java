import java.util.*;
public class Pangram
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int f=0;
		int contains[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		    {
		        int ind=s.charAt(i)-'A';
		        contains[ind]=1;
		    }
		    else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		    {
		        int ind=s.charAt(i)-'a';
		        contains[ind]=1;
		    }
		    else{
		        continue;
		    }
		   
		}
		for(int i=0;i<=25;i++)
		{
		    if(contains[i]==0)
		    {   f=1;
		        break;
		    }
		    
		}
		if(f==1)
		{
		    System.out.println("not a pangram");
		}
		else{
		    System.out.println("pangram");
		}
	}
}