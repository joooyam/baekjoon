package baekjoon;
import java.util.*;
public class B2_6{

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int hour=sc.nextInt();
      int min=sc.nextInt();      
      int plus=sc.nextInt();
      
      if((min+plus)/60+hour==24)
      {
         System.out.println("0 "+((min+plus)/60)+(min+plus)%60);
      }
     
      if(!((min+plus)/60+hour==24))
      
           {
         if(min+plus<60)
         {
   //      mp=(min+plus)/60; 
             System.out.println(hour+" "+(min+plus));
         }
    
         if(min+plus>=60)
         {
             System.out.println(((min+plus)/60)+hour+" "+(min+plus)%60);
         } 
      }
   }
}

   
   