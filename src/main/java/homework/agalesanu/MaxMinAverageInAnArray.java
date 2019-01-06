//Write a java program that will return the min, max and average values in a given array. For example:
//Given the following array [13,20,14,5,2,8] the output should be
//Max : 20
//Min : 2
//Average: 10.3

package homework.agalesanu;

public class MaxMinAverageInAnArray {

        public int max(int [] myArray) {
            int max = 0;

            for(int i=0; i<myArray.length; i++ ) {
                if(myArray[i]>max) {
                    max = myArray[i];
                }
            }
            return max;
        }

        public int min(int [] myArray) {
            int min = myArray[0];

            for(int i=0; i<myArray.length; i++ ) {
                if(myArray[i]<min) {
                    min = myArray[i];
                }
            }
            return min;
        }

        static double average(int[] myArray){
            int sum = 0;
            float average;
            for (int i = 0; i <= myArray.length; i++) {
                sum = sum + myArray[i];
            }
            average =  (float) sum / myArray.length;
            return average;
        }

    public static void main(String[] args) {

        int [] myArray = {13,20,14,5,2,8};

        MaxMinAverageInAnArray m = new MaxMinAverageInAnArray();

        System.out.println("Maximum value in the array is: " + m.max(myArray));
        System.out.println("Minimum value in the array is: " + m.min(myArray));
        System.out.println("Average value in the array is: " + m.average(myArray));
    }
}
