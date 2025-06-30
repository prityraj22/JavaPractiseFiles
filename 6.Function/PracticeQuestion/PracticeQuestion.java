package PracticeQuestion;

import java.util.Scanner;

public class PracticeQuestion {

    // Qs:1  Write a java method to compute the average of three numbers.
    /*
    public static double  average(double x, double y, double z) 
    {
        return (x+y+z)/3;
    }
    */

    /*Qs:2 Write a method named isEven that accepts an int argument. The method shouuld retuurn true if the argument is even, or false
     otherwise. Also write a program to test your method.*/
     public static boolean  isEven(int num) 
     {
         if(num % 2== 0){
            return true;
         }else{
            return false;
         }
     }

    // Method to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Method to calculate average of five numbers
    public static double averageOfFive(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Test reverse number functionality
        System.out.println("Enter a number to reverse:");
        int number = sc.nextInt();
        int reversed = reverseNumber(number);
        System.out.println("Reversed number: " + reversed);

        // Test average of five numbers
        System.out.println("Enter five numbers to find their average:");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        System.out.print("Enter fourth number: ");
        double num4 = sc.nextDouble();
        System.out.print("Enter fifth number: ");
        double num5 = sc.nextDouble();

        double average = averageOfFive(num1, num2, num3, num4, num5);
        System.out.println("Average of the five numbers is: " + average);

        // Qs:1 Solutiion
       /* System.out.println("Input the first number:");
        double x = sc.nextDouble();

        System.out.println("Input the sec number:");
        double y = sc.nextDouble();

        System.out.println("Input the third number:");
        double z = sc.nextDouble();

        System.out.println("The average value is: "+ average(x, y, z));
 */


 //Qs:2Solutiion
 

        
    }


}
