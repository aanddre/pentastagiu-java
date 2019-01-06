//Write a program that will test whether a string ends with another string. For example:
//Given the following strings “Hello java world” and “orld” the output should be TRUE

package homework.agalesanu;

public class StringEndsWithAnotherString {

    public static void main(String[] args) {

        String myString = "Hello java world";
        boolean output;

        output = myString.endsWith( "orld" );
        System.out.println("The output value is: " + output );

        output = myString.endsWith( "aaa" );
        System.out.println("The output value is: " + output );
    }
}
