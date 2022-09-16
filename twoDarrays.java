package anushka;
import java.util.Scanner;
import java.util.Arrays;

public class twoDarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //defining a string array
        String[] str = new String[4];

        // taking inputs of arrays
        for(int i= 0;i< str.length; i++){
            str[i] = in.next();
        }

        //modifying
        str[1] = "kunal";

        System.out.println(Arrays.toString(str));
    }
}
