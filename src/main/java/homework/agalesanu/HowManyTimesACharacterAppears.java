//Write a program that will count how many times a character appears in a String. For example:
//Given the string “Hello java world” and the target character ‘a’ the output should be 2 (since ‘a’ appears twice in “Hello java world”)

package homework.agalesanu;

public class HowManyTimesACharacterAppears {

    public static void main(String[] args) {

        String myString = "Hello java world!";

        int  count = 0;
        for (int i = 0; i < myString.length(); i++)
        {
            if(myString.charAt(i) == 'a')
                count++;
        }
        System.out.print(count);
    }

}
