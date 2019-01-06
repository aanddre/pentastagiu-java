//Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array has 2 or more elements.
//For example:
//For the following input [13,6,2,8,2,3] the output should be : FALSE
//For the following input [13,6,2,8,2,13] the output should be : TRUE

package homework.agalesanu;

public class FirstAndLastElementOfAnArrayAreTheSame {

    public static void main(String[] args) {

        int[] myArray = {13, 6, 2, 8, 2, 13};

        System.out.println (myArray.length >= 2 && myArray[0] ==  myArray[myArray.length-1]);

    }
}
