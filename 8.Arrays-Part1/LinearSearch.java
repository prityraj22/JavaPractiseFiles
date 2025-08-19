public class LinearSearch{
    
//  video-6   
/* public static int linearSearch(int numbers[], int keys) {
    
    for(int i = 0; i<numbers.length; i++)
    {
        if(numbers[i]==keys){
            return i;
        }
    }

    return -1;
}*/


    //video-7 largest Number
   /*  public static int getLargest(int num[]) 
    {
        int largest = Integer.MIN_VALUE;      // -infinity
        int smallest = Integer.MAX_VALUE;     // +infinity

        for(int i=0; i<num.length; i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
            smallest = num[i];               
            }
            
        }
        System.out.println("Smallest numbers is: "+smallest);
        return largest;
    }*/
    

     //video-8 Binary search concept


    //video-9 Binary search code
    /* 
    public static int binarySearch(int num[], int key)
     {
        int start=0, end = num.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            //Comparision
            if(num[mid] == key){
                return mid;
            }if(num[mid]<key){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }*/


    //video:10 Reverse Array
    /*public static void reverse(int nums[]) {
        int first = 0, last = nums.length-1;

        while(first < last){
            //swap
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
        
    }*/


    //  //video-11 Pairs in an array
    //     public static void printPairs(int numbers[])
    //      {
    //         int tp =0;
    //         for(int i =0; i<numbers.length; i++)
    //         {
    //             int curr = numbers[i];
    //             for (int j = i+1; j < numbers.length; j++)
    //             {
    //                 System.out.print("("+curr +","+numbers[j]+")");
    //                 tp++;
    //             }
    //             System.out.println();
    //         }
    //         System.out.println("Total numbers of pairs: "+tp);
    //     }

    



    
     //video-12 Subarrays in an array
        public static void printSubArrays(int numbers[])
         {
            int ts =0;
            for(int i =0; i<=numbers.length; i++)
            {
                int start =i;
                for (int j = i; j < numbers.length; j++)
                {
                    int end = j;
                    
                    for(int k = start; k<=end; k++){
                        System.out.print(numbers[k]+" ");
                        ts++;
                    }
                    System.out.println();
                }
                System.out.println();
                }
            System.out.println("Total numbers of pairs: "+ts);
        }

    public static void main(String[] args) 
    {
        //  video-6  
        /*
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Index of the key is:"+index);
        }
    }*/


    //video-7 largest Number
   /*  int num[] ={2,7,9,3,5};
    System.out.println("largest Numbers is: "+getLargest(num)); */



    //video-8 Binary search concept

    //video-9 Binary search code
   /*  int num[] ={2,4,6,8,10,12,14,16};
    System.out.println("Index for key is : "+binarySearch(num, 16));  */

    //video:10 Reverse Array
      /*   int numbers[] = {2,4,6,8,10};
        reverse(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();*/


        //video-11 Pairs in an array
        // int numbers[] = {2,4,6,8,10};
        // printPairs(numbers);


        //video-12 Subarrays
          int numbers[] = {2,4,6,8,10};
        printSubArrays(numbers);

        // dry run of subarray program
        /*✅ i = 0 (start = 0)
        j = 0 → end = 0 → k = 0 → print 2

        j = 1 → end = 1 → k = 0,1 → print 2 4

        j = 2 → end = 2 → k = 0,1,2 → print 2 4 6

        j = 3 → end = 3 → k = 0,1,2,3 → print 2 4 6 8

        j = 4 → end = 4 → k = 0,1,2,3,4 → print 2 4 6 8 10

        🌟 Output:
            2
            2 4
            2 4 6
            2 4 6 8
            2 4 6 8 10
            ✅ i = 1 (start = 1)
            j = 1 → end = 1 → k = 1 → print 4

            j = 2 → end = 2 → k = 1,2 → print 4 6

            j = 3 → end = 3 → k = 1,2,3 → print 4 6 8

            j = 4 → end = 4 → k = 1,2,3,4 → print 4 6 8 10

        🌟 Output:
        4
        4 6
        4 6 8
        4 6 8 10
        ✅ i = 2 (start = 2)
        j = 2 → end = 2 → k = 2 → print 6

        j = 3 → end = 3 → k = 2,3 → print 6 8

        j = 4 → end = 4 → k = 2,3,4 → print 6 8 10

        🌟 Output:
        6
        6 8
        6 8 10
        ✅ i = 3 (start = 3)
        j = 3 → end = 3 → k = 3 → print 8
        j = 4 → end = 4 → k = 3,4 → print 8 10

      🌟 Output:

        8
        8 10
        ✅ i = 4 (start = 4)
        j = 4 → end = 4 → k = 4 → print 10

      🌟 Output:
        10
*/



}
}
