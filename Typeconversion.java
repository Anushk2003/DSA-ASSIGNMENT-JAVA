package anushka;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Typeconversion {
    public static void main(String[] args) {







        //Type casting--compressing the bigger number into smaller type explicitly
        int num = (int)(56.789f);
        System.out.println(num);
        // automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a);
        byte c = 100;
        int d = a*b / c;
        System.out.println(b);

        int number = 'A';
        System.out.println('A');
        // int * float = float
        // int *int = int
        //float * bool = float
        //int/char = int
        //double - short = negative number double
        //if u have multiple types then entire result is converted to bigger type

    }
}
