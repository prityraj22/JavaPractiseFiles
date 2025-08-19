public class Pattern{

    //video-1 Hallow rectangle
public static  void hallow_rectangle(int totRows, int totCols) {
    //outer loop
    for (int i = 1; i<=totRows; i++) {
        // inner columns
        for (int j=1; j<=totCols; j++) 
        {
            //boundary cells
            if(i==1 || i==totRows || j==1 || j==totCols){

                    System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}

//video-2  Hallow rectangle Dry run


    // video-3 Inverted_Rotated_Half_Pyramid 
    public static void inverted_rotated_half_pyramid(int n) {
        // Outer loop for number of rows
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Newline after each row
            System.out.println();
        }
    }
    

    // video-4 inverted_half_pyamid_withNumbers
    public static void inverted_half_pyamid_withNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
  
        System.out.println();
    }
    }


    
    // video-5 floyds triangle
    public static void infloyds_triangle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
  
        System.out.println();
    }
    } 

    //video-6 0-1 triangle
    public static void zero_one_trianle(int n) {   
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if( (i+j) % 2 == 0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
    }
   

    //video-7  Butterfly Pattern
    public static void Butterfly(int n) {
        //1st half
        for (int i=1; i<=n; i++) {
            //star i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space 2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
         System.out.println();

        }
                //2nd half
        for (int i=n; i>=1; i--) {
            //star i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space 2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();

        }
    }


//video-8  solid_rhombous
    public static void solid_rhombous(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
                    System.out.println();

        }
    }


//video-9  hollow_rhombous
   public static void hollow_rhombous(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i == n || j==1 || j==n){
                    System.out.print("*");
                }else{
                System.out.print(" ");
            }         
        }
        System.out.println();
    }
   }

    //video-10 Diamond Pattern
    public static void  diamond(int n)
    {
        //ist half
        for (int i = 1; i <= n; i++) {
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

          //2nd half
        for (int i = n; i >= 1; i--) {
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


   

    public static void main(String[] args)
     {
        //video-1 Hallow rectangle
    //    hallow_rectangle(7,5);


    //video-2 Hallow rectangle Dry run



       // video-3 Inverted_Rotated_Half_Pyramid 
    //    inverted_rotated_half_pyramid(5);

        // video-4 inverted_half_pyamid_withNumbers
        // inverted_half_pyamid_withNumbers(5);

            // video-5 floyds triangle
            // infloyds_triangle(5);


            //video-6 0-1 triangle
            // zero_one_trianle(6);

            //video-7  Butterfly Pattern
            // Butterfly(5);

            // video-8  solid_rhombous
            // solid_rhombous(7);


              // video-9  hollow_rhombous
        //    hollow_rhombous(8);


           //video-10 Diamond
           diamond(8);


    }
}