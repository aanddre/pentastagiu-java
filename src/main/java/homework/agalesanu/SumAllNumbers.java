//1. Write a program that will sum up all numbers from 0 up to a target number.
//For example, for an input number 5, result should be 15 (0+1+2+3+4+5)

package homework.agalesanu;

public class SumAllNumbers {

    public static void main (String [] args ) {
        int myTargetVariable = 5;

        int result = 0;
        for (int i = 0; i <= myTargetVariable; i++)
        {
            result = result + i;
        }

        System.out.println("Sum is: " + result);

        System.out.println("Second approach: Sum is: " + SumNumbers(10));
    }

    private static int SumNumbers (int targetVariable) {

        int result = 0;
        for (int i = 0; i <= targetVariable; i++)
        {
            result = result + i;
        }

        return result;
    }
}
