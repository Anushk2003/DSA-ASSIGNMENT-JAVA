package anushka;
 import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        // .trim()--removes extra spaces from both side of the word
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch>= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }

        //System.out.println(in.next().trim());
    }
}
