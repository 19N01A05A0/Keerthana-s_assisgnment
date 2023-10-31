import java.util.ArrayList;
import java.util.Random;
import java.util.*;
public class Shuffle
{   public static void shuffle(ArrayList<Integer> newlist)
    {
        int n = newlist.size();
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            
            int temp = newlist.get(i);
            newlist.set(i, newlist.get(j));
            newlist.set(j, temp);
        }
    }
	public static void main(String[] args) {
		ArrayList<Integer> orglist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    orglist.add(sc.nextInt());
		}
		System.out.println("orginal list"+orglist);
		shuffle(orglist);
		System.out.println("new list"+orglist);
	}
}