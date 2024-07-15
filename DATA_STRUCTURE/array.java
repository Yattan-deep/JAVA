// import Math
package DATA_STRUCTURE;

class student{

    int rollnum;
    String name;

    student(){} // default constructor 

    student( int roll , String name ) // parameterize 
    {
        this.rollnum = roll;
        this.name = name;
    }
}

public class array {
    public static void main(String[] args) {
        int arr1[] = new int[4]; // ---> by default all are 0...
        
        // int arr[2] --> ERROR...

        System.out.println(arr1[1]); // output == 0 as all are asigned to zero

        // how can we find 
        // length is a field --- > common attribute of a class 
        // field vs method 
        int size = arr1.length;
        System.out.println(size);

        // java does't have sizeof() method 

        // 2D array SAME as Cpp 
        int arr2[][] = new int[2][3];

        for( int i  = 0 ; i< arr2.length ; i++ )
        {
            for( int j = 0 ; j < arr2[i].length ; j++ )
            {
                int random_num = (int) (Math.random() * 100) ;
                arr2[i][j] = random_num;
                System.out.print(random_num + " ");
            }
            System.out.println();
        }

        System.out.println();
        // JAGGED 2-D array Internal array can be any size depends upon

        int jagged[][] = new int[3][]; // 3 row , column can be random

        jagged[0] = new int[1];
        jagged[1] = new int[3];
        jagged[2] = new int[9];

        System.out.println("2D jaggged");
        for( int i  = 0 ; i< jagged.length ; i++ )
        {
            for( int j = 0 ; j < jagged[i].length ; j++ )
            {
                int random_num = (int) (Math.random() * 100) ;
                jagged[i][j] = random_num;
                System.out.print(random_num + " ");
            }
            System.out.println();
        }

        System.out.println("\nArray of object");
        // Create class , create object give reference to array
        student s1 = new student(1,"Jashan");
        student s2 = new student(2,"Raghubir");
        student s3 = new student(3,"Sujeet");

        student arr_obj[] = new student[3];
        arr_obj[0] = s1;
        arr_obj[1] = s2;
        arr_obj[2] = s3;

        // Enhanced loop
        
        String str = "Hello\0World";
        System.out.println(str); // prints "HelloWorld"

        for( student it : arr_obj)
            System.out.println(it.rollnum + " " + it.name);
        

    }
}
