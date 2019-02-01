import java.util.Scanner;
public class scannerInput
{
    public static void main(String[] args)
    {
        //Initialise scanner to read from console.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=input.nextInt();
         System.out.print("Enter second number:");
        int b=input.nextInt();
         System.out.print("Enter third number:");
        int c=input.nextInt();
        System.out.println("Average is " + (a+b+c)/3);
        
        
    }
}