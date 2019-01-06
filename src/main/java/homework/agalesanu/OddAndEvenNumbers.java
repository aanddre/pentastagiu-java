//Write a Java program to find the number of even and odd integers in a given array of integers. For example:
//Given the following array [13,20,14,5,2,8] the output should be:
//Odd elements count : 2
//Even elements count : 4

package homework.agalesanu;

public class OddAndEvenNumbers {

    public static void main(String[] args) {

        int [] myArray = {13,20,14,5,2,8};
        int counto = 0;
        int counte = 0;

        for(int i = 0; i <= myArray.length-1; i++){
            if(myArray[i]%2 == 0){
                counte++;
            }
            else
                counto++;
        }
        System.out.println("Odd elements count : " + counto);
        System.out.println("Even elements count : " + counte);
    }
}
