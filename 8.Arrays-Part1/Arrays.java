

public class Arrays 
{

    //video: 4 Arrays as function argument
    public static void update (int marks[], int nonChangeable) 
    {
        nonChangeable =10;
        for(int i=0; i<marks.length; i++)
        {
            marks[i] = marks[i]+1;
        }
    }
   
     


    public static void main(String[] args) 
    {
        // video-3
       /* 
        int marks[] = new int[100];
        System.out.println("length of marks: "+marks.length);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of phy");
        marks[0] = sc.nextInt();  //phy

        System.out.println("Enter marks of phy");
        marks[1] = sc.nextInt();  //chem

        System.out.println("Enter marks of phy");
        marks[2] = sc.nextInt();  //math

        

        System.out.println("phy:" +marks[0]);
        System.out.println("chem:" +marks[1]);
        System.out.println("math:" +marks[2]);

        marks[2] = marks[2]+5;
        System.out.println("math:" +marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2]) /3;
        System.out.println("percentage: "+percentage+"%");
    */



    //video-4 Passing arrays as argument
        int marks[] = {97,98, 99};
        int nonChangeable = 5;
        update(marks,nonChangeable);  //functional call

        System.out.println(nonChangeable);

        for (int i = 0; i <marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
            System.out.println();

    }
    
}
