package baekjoon3;
import java.util.*;
public class B3_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int result=sc.nextInt();
		int buy=sc.nextInt();
		int add=0;
		for(int i=1; i<=buy; i++) {
			int money=sc.nextInt();
			int a=sc.nextInt();
			
			add+=(money*a);

		}
			
			if(result==add) {
				System.out.println("Yes");
			}else if(result!=add) {
				System.out.println("No");
			}
		}

	}


