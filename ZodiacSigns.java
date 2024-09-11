import java.util.Scanner;

public class ZodiacSigns{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Objects obj = new Objects();
      int day;
      int year;
      String name;
      int monthnum;
      String repeat;
      
      do{
         System.out.print("Enter your name please: ");
         name=sc.next();
         
         System.out.println("Hello "+name+"! please enter your birth date... ");
         
         System.out.print("Enter your birth month: ");
         monthnum=obj.Check();

         System.out.print("Enter your birth day: ");
         day=obj.Check();
            
         System.out.print("Enter your birth year: ");
         year=obj.Check();
         
         System.out.println("You inputted "+obj.getMonth()+" "+obj.getDay()+" "+obj.getYear()+" and");
         obj.Age(year);
         obj.Date(monthnum,day,year); 
         
         System.out.print(" Do you want to try again? Yes or No? ");
         repeat=sc.next();
         
      }while(repeat.equalsIgnoreCase("YES"));
   }
}