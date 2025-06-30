package Input;

import  java.util.*;


public class InputJava 
{
    public static void main(String[] args) 
    {
        // video-10 Input in java
        // Ex-Program
         Scanner sc =new Scanner(System.in);
        
        // String name = sc.next();   // use single word only it doesn,t print after space word or sentance
        // System.out.println("name:"+name);

        // String address = sc.nextLine();  // use for print after space sentances or word
        // System.out.println("Address: "+ address);

        // int num = sc.nextInt();    //pint int type numbers
        // System.out.println("Numbers: " +num);

//----------------------------------------------------------------------------------------------------------------------------------------

        // video-11 sum of a & b
        // Ex-Program

        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of a  b: "+ sum);*/

//----------------------------------------------------------------------------------------------------------------------------------------

// video-12 product of a & b

        // Ex-Program
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("Product of a  b: "+ product);
    }
*/
//----------------------------------------------------------------------------------------------------------------------------------------

// video-12 Area of circle
        
        // Ex-Program
        /*float r = sc.nextFloat();
        float pi = 3.14f;
        float area = pi*r*r;
        System.out.println("Area of a  circle: "+ area);*/
        
    
//----------------------------------------------------------------------------------------------------------------------------------------

// video-13 Type Conversion  (in java automatically happen type conversion)
   /* conversion happen when:
   1.type compatible (means number in convert only number type data not like or boolean)
   2.destination type > source type (means int > short, long > float)
   Implicit type -> Small to long (byte->short->int->float->->long) 
 */

//  Ex-Type Conversion
        /*int a = 10;
        double b=a;
        System.out.println(b);*/

//----------------------------------------------------------------------------------------------------------------------------------------

// video-14 Type Casting  (when we want store long data type to samall type)
   /* conerting long to small some data will lose in this type of convertion
   Explicit type -> long to small (float->int)
 */

//  Ex-Type Casting 
     /* float a = 36.13f;
      int b = (int) a;
      System.out.println(b); */


//Ex- convert char into numbers

        /*char ch1 = 'a';
        int num1 = ch1;
        char ch2 = 'b';
        int num2 = ch2;
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
*/
//----------------------------------------------------------------------------------------------------------------------------------------
  
//video-15 Type Promotion in Expression
    
// Ex Program1

        /*
        char a = 'a';
        char b ='b';
        
        System.out.println((int)(b)); //98
        System.out.println((int)(a));  //97
        System.out.println(b-a);   //1
        System.out.println(a);   // a  (type promotion is only work on expressions)

       /*  char c = a - b;
        System.out.println(c); */  //this is give error    */


        
        // Ex Program2
        short a = 5;
        byte b = 25;
        char c = 'c';
        // byte bt = a+b+c;    //this give us error 

        //if we want calculate than we can conversion 
        byte bt = (byte) (a+b+c);
        System.out.println(bt);

 }
}
