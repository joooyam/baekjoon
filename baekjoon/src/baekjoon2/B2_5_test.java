package baekjoon2;
import java.util.*;
public class B2_5_test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int hour=sc.nextInt();
		int min=sc.nextInt();

		if(hour == 0)
		{
			if(min-45 >= 0) 
			{
				min -= 45;
				System.out.println(hour +" "+min);
			}
			else
			{
				hour = 23;
				min=60+(min-45);
				System.out.println(hour +" "+min);
			}
		}
		else
		{		
			if(min-45 >= 0)
			{
				min -= 45;
				System.out.println(hour +" "+min);
			}
			else 
			{
				hour -= 1;				
				min = 60 + (min - 45);
				System.out.println(hour +" "+min);
			}		
		}	
	}
}
