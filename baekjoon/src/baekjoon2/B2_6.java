package baekjoon2;
import java.util.*;
public class B2_6{

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int hour=sc.nextInt();
      int min=sc.nextInt();      
      int plus=sc.nextInt();
      int pm=min+plus;
     
      if((pm/60)+hour==24)
      {
         System.out.println("0 "+(pm%60));
      }
      else if((pm/60)+hour>24)
      {
    	  System.out.println(((pm/60)+hour)-24 +" "+(pm%60));
      }
      
      if((pm/60)+hour<24)
      {	
    	  if(pm<60)
         {
             System.out.println(hour+" "+pm);
         }
    
    	  if(pm>=60)
         {
             System.out.println((pm/60)+hour+" "+(pm%60));
         } 
      }
     }
   }


   
   