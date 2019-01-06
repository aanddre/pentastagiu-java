//Write a java program to return the index of a target element. For example:
//Given the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3 (because 5 is located at index 3 in the array)

package homework.agalesanu;

public class IndexOfATargetElement {

    public static void main(String[] args) {

        int [] myArray = {13,20,14,5,2,8};
        int index = -1;

        for(int i = 0; (i <= myArray.length) && (index == -1); i++)
        {
            if(myArray[i] == 5)
            {
                index = i;
            }
        }
        System.out.print(index);
    }
}
