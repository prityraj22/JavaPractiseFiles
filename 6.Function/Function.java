
import java.util.Scanner;



public class Function{
 
    /* 
    //video-1
    //Ex-1
    public static void printHelloWorld1(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        return;

    }

    //Ex-2
    public static int  printHelloWorld2(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        return 3;

    }*/


     //video-2 Parameter
     //Ex-1
    //  public static void intSum(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a value of a");
    //     int a = sc.nextInt();

    //     System.out.println("Enter a value of b");
    //     int b = sc.nextInt();

    //     int sum = a+b;
    //     System.out.println("Sum of a + b : "+sum);
    //  }



    //   //Ex-2
    //   public static int calculateSum(int a, int b)  //defination:  formal parameter
    //   {
    //     int sum = a+b;
    //     return sum;
    //  }


    //video-5
    // Ex-2 swap number using functio
    // public static void swapNumbers(int a , int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a= "+a);
    //     System.out.println("b= "+b);

    // }



     //video-6 find product a & b
     //Ex- 1
    //  public static int multiply(int a , int b){
    //     int product = a*b;
    //     return product;
    //  }


    //video-7 factorial of a number
    // public static int factorial (int n ){
    //     int f=1;
    //     for(int i=1; i<=n; i++){
    //             f= f*i;
    //     }

    //     return f;
    // }



    //video-8 Binomial Coefficient   (here need factorial function )
   /*  public static int factorial (int n ){
        int f=1;
        for(int i=1; i<=n; i++){
                f= f*i;
        }

        return f;
    }

    public static int binoCoeff (int n, int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);


        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;



    }*/

    // //video-12 Overloading using parameter
    // public static int sum(int a, int b) {
    //     return a+b;
    // }

    // public static int sum(int a, int b, int c) {
    //     return a+b+c;
    // }

    



    //video-13 Overloading using parameter using data types
   /* public static int sum(int a, int b) {
            return a+b;
        }

    public static float  sum(float  a, float  b) {
            return a+b;
        }
    */ 


    //video-14 check if a num is Prime or not
    // // 1st methos
    // // public static boolean isPrime(int n){
    // //     boolean isPrime =true;
    // //     for(int i=2; i<=n-1; i++ ){
    // //         if(n%i==0){
    // //             isPrime=false; //means it completely dividing
    // //             break;
    // //         }
    // //     }
    // //     return isPrime;
    // // }

    // // 2nd method
    // public static boolean isPrime(int n){ 
    //     if(n==2){   //corner cases
    //         return true;
    //     }
    //     for(int i=2; i<=n-1; i++ ){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    // video-15 CheckPrime (Optimized method)
    // check if a num is Prime or not
    //  public static boolean isPrime(int n){ 
    //     if(n==2){   //corner cases(special case)
    //         return true;
    //     }
    //     for(int i=2; i<=Math.sqrt(n); i++ ){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }



     //video-16 Primes in range
        //Qs: Print all Primes in a range
   /* 
    public static boolean isPrime(int n){ 
        if(n==2){   //corner cases(special case)
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++ ){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int n) {
        for(int i=2; i<=n; i++){
            if(isPrime(i)){   //true
                    System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    */



         //video-17 Binary to Decimal
        //Qs: Convert from binary to decimal
            //1. In math we decimal number means -0,1,2,3,4,5,6,7,8,9  (these all are unique)
            //2. In computer language we use binary number(for bit manipulation)- 0,1  




        //video-18 Binary to Decimal Code
        //Qs: Convert from binary to decimal
        //concept


        //video-19 Binary to Decimal Code
        //Qs: Convert from binary to decimal
        /*public static void binToDec(int binNum) {
            int pow  = 0;
            int decNum = 0;
            while(binNum >0){
                int lastDigit = binNum % 10;
                decNum= decNum+(lastDigit* (int)Math.pow(2, pow));

                pow++;
                binNum =binNum/10;
            }

            System.out.println("decimal of "+ binNum+ " = "+decNum);
        }*/
        

        
            //video-20  Decimal to binary
        //Qs: Convert from Decimal to binary
        //Concept define


         //video-21  Decimal to binary code
        //Qs: Convert from Decimal to binary
        /*public static void DecToBin(int n) {
            int myNum = n;
            int pow  = 0;
            int binNum = 0;
            while(n >0){
                int rem = n % 2;
                binNum= binNum+(rem* (int)Math.pow(10, pow));

                pow++;
                n =n/2;
            }

            System.out.println("binary form of "+ myNum+ " = "+binNum);
}*/
        


    public static void main(String[] args)    //execution starts from here
    {
        Scanner sc = new Scanner(System.in);

         /* 
        //video-1
        printHelloWorld1();  //function call
        printHelloWorld2();
        */


        //video-2
        //Ex-1
        // intSum();

        // // Ex-2
        // System.out.println("Enter a value of x");
        // int x = sc.nextInt();
        // System.out.println("Enter a value of y");
        // int y = sc.nextInt();
        // int addition = calculateSum(x, y);  //Call:  actual parameter/arguments 
        // System.out.println("Sum of x + y : "+addition);



        //video-3 Parameter Vs Arugement
        //Defunation :   in defintion we parameter or formal parameter
        //Function Call : At the time call it called actual parameter/arguments 


        //video-4 What is memory(important)
       // 1.In java, memory store function related data in form of call stack  
       //2. Call Stack:  means things put one upon one in stack
       //3. Here in memory each function occupy there sepearte block space under memory.
       //4. Memory's space clear after execution and return . 



       //video-5  Call by Value And Call by Reference
       //Java always call by Value.

    //    //Ex-1 swap - values exchange using program
    //     int a = 5;
    //     int b = 10;
    //     //swap
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a= "+a);
    //     System.out.println("b= "+b);


        //Ex-2 swap - values exchange using  function
        // int x = 5;
        // int y = 8;
        // swapNumbers(x, y);


        //video-6 find product a & b
        //Ex- 1
        // int res = multiply(3, 9);
        // System.out.println("product of a * b : " + res);


        //video-7 factorial of a number , n (n! = (n-1)*(n-2)*(n-3).....*1)
        //  ex-1    4!= 4*3*2*1,  3! = 3*2*1,  2!= 2*1, 1!=1, 0!=1 (negative not exist in factorial)
        // System.out.println(factorial(5));


        //video-8 Binomial Coefficient ,  n^Cr = n!/2!(n-r)!-> formula
        // System.out.println(binoCoeff(5,2 ));   //calling


        //video-9 Inbuilt and User defined Method
        // 1.Inbuilt method/function:  which exist under java.  Ex: Math class -> pow,sqrt,max 
        //2.User defined Method: which is defined by user   


        //video-10 Function Overloading
        //Multiple function with the same name but different parameter
        //Ex: multiply(int a, int b), multiply(int a, float b), multiply(float a, int b, ), multiply(double a, double b)


        //video-12 Overloading using parameter
        // System.out.println(sum(1,8));
        // System.out.println(sum(1,8,9));


         //video-13 Overloading using data types
        // System.out.println(sum(1,8));
        // System.out.println(sum(1.9f,8.9f));



        //Video-14 Check if a number is prime or not 
        //    System.out.println(isPrime(21));

        //Video-15 Check if a number is prime or not (using Optimized) 
        // System.out.println(isPrime(16));


        //video-16 Primes in range
        //Qs: Print all Primes in a range
        // PrimeInRange(10);



        //video-17 Binary to Decimal
        //Qs: Convert from binary to decimal
            //1. In math we decimal number means -0,1,2,3,4,5,6,7,8,9  (these all are unique)
            //2. In computer language we use binary number(for bit manipulation)- 0,1  


             //video-18 Binary to Decimal Code
        //Qs: Convert from binary to decimal
       //Concept define

        //video-19 Binary to Decimal Code
        //Qs: Convert from binary to decimal
            // binToDec(101);



            //video-20  Decimal to binary
        //Qs: Convert from Decimal to binary
        //Concept define


         //video-21  Decimal to binary code
        //Qs: Convert from Decimal to binary
        // DecToBin(7);



        //vdeo-22 Method Scope:-
        // concept:   variable not accessible out function where it define it only accessible within where it define.


        //vide23 Block scope:-
        //variable not accessible out braces({}) where it define it only accessible within where it define.

        //class scope : public,private,protected

    }
}