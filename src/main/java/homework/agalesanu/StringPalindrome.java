//Write a program to test whether a given string is a palindrome or not. For example:
//Given the following string “aaabccbaaa” should return TRUE
//Given the following string “abccbb” should return FALSE
package homework.agalesanu;
import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

//        String a = "aaabccbaaa";
//        String b = "abccbb";
        boolean output;

        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string to check if is palindrome: ");
        str = sc.nextLine();

        for ( int i = str.length() - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (output = str.equals(rev))
            System.out.println(output);
        else
        System.out.println(output);
    }
}
