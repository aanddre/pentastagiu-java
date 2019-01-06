//Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
//For example, for range numbers 1 to 100 output should be:
//Sum for range 1 to 100 : 5050
//Average for range 1 to 100 : 50.0

package homework.agalesanu;

public class SumAndAverage {

    public static void main(String[] args) {

        int sum = 0;
        double average = 0;
        int a = 1;
        int b = 100;

        while (a <= b){
            sum = sum + a;
            a++;
            average= sum/b;
        }

        System.out.println("The sum for range 1 to 100 is " + sum);
        System.out.println("The average for range 1 to 100 is " + average);
    }
}
