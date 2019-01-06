//Write a program that will insert a # between any duplicate letters that are placed right next to each. For example:
//Given the following string “Hello world” the output should be “Hel#lo world”

package homework.agalesanu;

public class InsertBetweenDuplicateLetters {

    public static void main(String[] args) {

        String myString = "Hello world";

        for(int i = 0; i <= myString.length(); i++){
            if(myString.charAt(i) == myString.charAt(i+1))
            {
                myString = myString.substring(0, i) + "#" + myString.substring(i, myString.length());
            }
        }
        System.out.println(myString);
    }
}