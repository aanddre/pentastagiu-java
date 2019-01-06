//Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example:
//For an input of x = 20 the output should be:
//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5

package homework.agalesanu;

public class FibonacciNumbersAndAverage {

    public static void main(String[] args) {

        int x = 20, t1 = 1, t2 = 1;
        System.out.print("The first " + x + " Fibonacci numbers are: ");

        for (int i = 0; i <= x; i++)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

//        double average = sum1/x;
//        System.out.print("The average is " + average);
    }
}
