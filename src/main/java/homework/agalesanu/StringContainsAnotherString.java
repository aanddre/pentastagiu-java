//Write a program that test if a given String contains another String. For example:
//Given the following base String “Hello java world” and the target test String “java” the output should be TRUE.

package homework.agalesanu;

public class StringContainsAnotherString {

    public static void main(String[] args) {

        String baseString = "Hello java world";
        boolean output = baseString.contains("java");

        System.out.println(output);
    }
}
