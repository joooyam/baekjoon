package baekjoon2;

import java.util.*;

public class B2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		
		if(hour==0)
		{	 	
			if (min-45>=0) 
			{
				System.out.println("0 " + (min-45));
			}
			else 
			{
				min = 60 + (min - 45);
			}
		}
		if(hour!=0) 
		{		
			if (min-45>=0)
			{
				System.out.println(hour + " " + (min - 45));
			}
			else
			{
				hour = hour - 1;
				min = 60 + (min - 45);
				System.out.println(hour + " " + min);
			}
		}
		
	}
}
