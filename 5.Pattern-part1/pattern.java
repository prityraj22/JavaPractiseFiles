

class pattern{
    public static void main(String[] args) {

        /*Print star pattern : for print star some basic things we have to notic:
            1.Lines --->outer loop
            2.number of times----> inner loop(i)
            3.what to print ----> *   
        */

        // Ex-1 Print pattern
        // for (int line=1; line<=4; line++) {
        //     for (int star=1; star<=line; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //    // Ex-2 Print inverted star pattern
           int n = 7;
           for (int line=1; line<=n; line++) {
            for (int star=7; star>line; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

