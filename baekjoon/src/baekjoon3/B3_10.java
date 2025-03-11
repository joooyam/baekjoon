package baekjoon3;

import java.util.*;

public class B3_10 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

//      int n = sc.nextInt();

      for (int i = 5; i >= 1; i--) {
         for (int a = i - 1; a >= 1; a--) {
            System.out.print("-");
         }
         
         for (int b = i; b <= 5; b++) {
            System.out.print("*");
            
         }
         System.out.println();
         
      }

   }
}