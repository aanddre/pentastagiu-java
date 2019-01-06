//Write a java program that will concatenate 2 arrays. For example:
//Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]

package homework.agalesanu;
import java.util.Arrays;

public class ConcatenateArrays {

    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 5, 6, 7, 8 };

        // Create empty array of required length.
        int[] merged = new int[array1.length + array2.length];

        // Copy first array into new array.
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }
        // Copy second array into new array.
        // ... Use offset to assign elements.
        for (int i = 0; i < array2.length; i++) {
            merged[array1.length + i] = array2[i];
        }

        // Print results.
        System.out.println("The first array was: " + Arrays.toString(array1));
        System.out.println("The second array was: " + Arrays.toString(array2));
        System.out.println();
        System.out.println("The new array is: " + Arrays.toString(merged));
    }
}
