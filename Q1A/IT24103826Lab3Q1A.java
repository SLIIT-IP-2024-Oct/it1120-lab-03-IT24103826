import java.util.Scanner;

public class IT24103826Lab3Q1A {
    public static void main(String[] args) 
{
        Scanner input = new Scanner(System.in);

        //input price of 1kg
        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        //input number of kg
        System.out.print("Enter the number of kg you want to buy: ");
        double kg = input.nextDouble();
  
        double total=price*kg;

        //output total amount
        System.out.println("The total amount with 10% discount:"+total);
     }
}


