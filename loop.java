package anushka;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // Print number from 1 to 5
        //for loop--use it when the no of loop is finite
        // syntax for FOR STATEMENT
        /* for(initialization; condition ; increment/decrement){
                // body
              }
         */

//        for(int num = 1; num<=5; num+=1){
//            System.out.println(num);
//        }

        //print numbers from 1 to n
        //print helllo world n no of times
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for(int num = 1; num<=n; num++){
//           // System.out.println(num +" ");
//            System.out.println("hello world");
//       }

        // While loop--use while loop when u dont know how many times thye loop is going to run
        /*
        syntax:
        initialization
        while(condition){
            // body
            //increment/decrement
        }
         */
//        int num = 1;
//        while(num<=5) {
//            System.out.println(num);
//            num += 1;
//
//        }
// Do while loop
// here loop is going to execute once then after that it will only execute if the condition is true
        /*
        do{
        } while(condition);

         */
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while (n <=5);

    }
}
