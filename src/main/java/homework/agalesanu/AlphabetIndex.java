//Write a program that will return a different string representing the alphabet index of each letter.
//Assuming we have the following alphabet encoding
//a = 0
//b = 1
//c = 2
//d = 3
//…
//For the given string “abcd” the output should be “0123”

package homework.agalesanu;

public class AlphabetIndex {

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            //ASCII code
            System.out.print(alphabet.charAt(i) - 'a' + 1);
        }
    }
}
