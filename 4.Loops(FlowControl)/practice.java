
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Practise Qs:1 How many times "Hello" is printed?
        // for(int i =0; i<5; i++){
        //     System.out.println("hello");  //output : 2time hello prints
        //     i+=2;
        // }   




        //Practise Qs:2 Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        /* 
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do { 
            System.out.println("Enter the number");
            number = sc.nextInt();
            if(number % 2 == 0){
                evenSum+= number;
            }else{
                oddSum+=number;
            }
            System.out.println("if want to continue press 1 or 0 for no");
            choice= sc.nextInt();
        } while (choice==1);
        System.out.println("Sum of even numbers:  "+evenSum);
        System.out.println("Sum of odd numbers:  "+oddSum);
*/


     //Practise Qs:3 Write a program to print factorial number which entered by user .

    //  System.out.println("enter any positive integer");
    //  int num = sc.nextInt();

    //  int fact = 1;

    //  for(int i =1; i<=num; i++){
    //     fact*=i;
    //  }
    //  System.out.println("factorial: "+fact);




   //Practise Qs:4 Write a program to print the multiplicaion table of a number N, entered by the user.
   System.out.println("Enter any number: ");
   int num = sc.nextInt();
   for(int i=0; i<=10; i++)
   {
        System.out.println(num+ " * " + i +"= " + num*i);
   }



    }
}
