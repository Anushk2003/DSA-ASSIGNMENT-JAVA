package anushka;

public class Array {
    public static void main(String[] args) {
        // syntax of array
        // datatype[] variable_name = new datatype[size];
        // datatype-- what type of data is stored inside an array
        // all the type of data in an array should be same

        //ex: store 5 rollno.
        int[] rnos = new int[5];
        //rnos variable is pointing to anarray of type int


        // or directly also u can assign 5 values
        int[] rnos1 = {1, 2, 3, 4, 5};

        //lets break down

        //declaration of array ros is getting defined in the stack
        int[] ros;

        //initialization: actually here object is being created in the heap memory
        ros = new int[5];
        //if u dont mention the size it will give u error
        int[] arr = new int[5];

        String[] arr1 = new String[4];
        System.out.println(arr1[0]);
        




    }
}
