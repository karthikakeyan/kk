import java.util.*;


/*Given an array A of n integers and m and a target integer t,
 *return TRUE if there exists, sum of m elements in the array A matching t ,
 *else return false. - */
public class Arr {

	public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<Integer>();
		int i=0,m=0,t=0,sum=0;
		Scanner s=new Scanner(System.in);
		boolean b=true;
		System.out.println("how many elements do u wanna insert");
		int a=s.nextInt();
		for(i=0;i<a;i++)
		{
			n.add(s.nextInt());
			//System.out.println(n.get(i));
		}
		System.out.println("enter target number t");
		t=s.nextInt();
		System.out.println("enter m elements to be added");
		m=s.nextInt();
		for(int j=0;j<m;j++)
		{
			System.out.println(n.get(j));
			sum=sum+n.get(j);
		}
		System.out.println(sum);
		if(sum==t)
		{
			System.out.println(b);
			
		}
		else
		{
			System.out.println("false");
		}
		
		s.close();
	}

}
