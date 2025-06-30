
import java.util.Scanner;


public class Loops
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // video-2 while loop
        /*int counter = 0;
        System.out.println("Hello world");
        while (counter < 10) { 
            counter++;
            System.out.println("Hello world");
        }*/


        // //video-3 Print number from 1 to 10
        // int num = 1;
        // System.out.println("numbers: ");
        // while(num<=10){
        //     System.out.println(num);
        //     num++;
            
        // }



         //video-4 Print number from 1 to n
         
        //   System.out.println("Enter a value: ");
        //   int range =sc.nextInt();
        //   int counter = 1;
        //  System.out.println("Enter a value: ");
        //  while(counter<=range){
        //      System.out.println(counter);
        //      counter++;
             
        //  }


              
         //video-5 Print sum of first n natural numbers (n=5 , 1+2+3+4+5)
         
        //  System.out.println("Enter a value: ");
        //  int n =sc.nextInt();
        //  int sum = 0;
        //  int i =0;

        // while ( i<=n) {
        //     sum = sum+i;
        //     i++;
        // }
        // System.out.println(sum);

            

        /*  video-6 For Loop
         Syntax:-
        for (initializaion; condition; updation) {
            
        do something
        }*/


        /* 
        // video-7 Print Square pattern
        System.out.println("enter value:");
        int n = sc.nextInt();

        for(int line=0; line<n; line++){
            System.out.println("****");
        }


        //using while
        // int line=0;
        // while(line<=n){
        //     line++;
        //     System.out.println("****");
        // }         
*/


/* 
        // video-8 Print reverse number
        //if we want last digit than apply n%10
        // if we want last digit remove than apply n/10
        System.out.println("Enter any numbers:");
        int n = sc.nextInt();
        // int n = 10997;

        while(n>0){
            int lastDigit = n%10;
            System.out.println(lastDigit);
            n= n/10;
        }
        System.out.println();
*/

/* 
    // video-9 Reverse the given number
        int n = 10899;
        int rev =0;
        while(n > 0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println("Reverse Number: "+rev);*/


        
        //video-10 Do while loop
        // int counter = 1;
        // do { 
        //     System.out.println("hello");
        //     counter++;
        // } while (counter<=10);




        // //video-11 Break Statement - to exist loop
        //     for(int i =0; i<=5; i++){
        //         if(i==3){
        //            break;
        //         }
        //         System.out.println(i);
                
        //     }
        //     System.out.println("out of loop");





        // //video-12  Question- break keyword
        // //Qs: Keep entering numbers till user enters a multiple of 10.
        // do { 
        //     System.out.println("enetr a number:");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);





        // //video-13 Continue Statement: to skip an iteration
        //         for(int i=0; i<=5; i++)
        //         {
        //             if(i==3){
        //                 continue;
        //             }
        //             System.out.println(i);
        //         }




        // //video-14 Qs: Display all numberbs entered by user except multiples of 10 using 'continue' Statement
        // do { 
        //     System.out.println(" Enter your number:");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         continue;
        //     }
        //     System.out.println(" number was "+num);
            
        // } while (true);





        //video-15 Check if a number is prime or not 
        //(prime:2,3,5,7,11 etc -which multiplied of 1 or itself ,remain are composite numbers)
        /* n-> a*b 
            4-> 4*1     6-> 1*6   2-> 1*2
                2*2         2*3       2*1
                4*1         3*2
                            6*1
*/ 
        
            System.out.println(" Enter your number:");
            int n = sc.nextInt();
            if(n==2){
                System.out.println(n+" is prime");
            }else{
                boolean isPrime = true;
                for(int i=2; i<=Math.sqrt(n); i++){
                    if (n%i==0) {
                        isPrime= false;
                    }
                }
                if(isPrime == true){
                    System.out.println(n+" is prime");
                }else
                System.out.println(n+" is not prime number");
                
            
            }
            
    



        }
    }
