package baekjoon3;
import java.util.*;
public class B3_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=0;
		int a=sc.nextInt();
		for(int i=1; i<=a; i++) {
			b+=i;
		}
		System.out.println(b);
	}

}
