package baekjoon2;
import java.util.*;
public class B2_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a==b && a==c && b==c)
		{
			System.out.println((a*1000)+10000);
		}	
		
		if(!(a==b && a==c && b==c))
		{
			if(a==b || a==c ) 
			{
				System.out.println((a*100)+1000);
			}
			else if(a==b || b==c)
			{
				System.out.println((c*100)+1000);
			}
		}
		if(a!=b && b!=c && c!=a)
		{
			if(a>b && a>c)
			{
				System.out.println(a*100);
			}
			else if(b>a && b>c)
			{
				System.out.println(b*100);
			}
			else if(c>a && c>b)
			{
				System.out.println(c*100);
			}
		}
	}
}
