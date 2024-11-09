import java.util.Scanner;
      public class IT24103826Lab3Q2{

         public static void main(String[] args)
    {    
         //create and object called input to Scanner class
         Scanner input=new Scanner(System.in);
    
         System.out.println("Enter the monthly salary:");
         double Monthly Salary=input.nextInt();
      
         System.out.println("Enter the number of OT hours:");
         double OT Hourly Rate=input.nextInt();

         System.out.println("Enter the OT hourly rate:");
         double rate=input.nextInt();
     
         double OT Amount=OT hours*OT Hourly Rate;
         double Total Salary=Monthly Salary+OT Amount;

         System.out.println("Total Salary:"+Total Salary);}
}