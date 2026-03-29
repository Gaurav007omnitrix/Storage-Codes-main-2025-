import java.util.Collections;
import java.util.stream.Collectors;

public class accenture {
    public static void main(String[] args) {

        String s= "gaurav";

        //reverse the string using for loop

        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();

        //array has list of 0 and nonzero elements,move all zeros to end
        int[] arr={0,3,0,5,6,0,2,8,0,1};
        //output:3,5,6,2,8,1,0,0,0,0

        //take a new array
        int[] result=new int[arr.length];  //-->In an int array by default all elements are initialized to 0
        int index=0;                        // --> that why we have not explicitly assigned 0 to result array
        for (int i=0;i< arr.length;i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        for (int i=0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }

        // java
                // find the leader elements (elements greater than all elements to their right)
                int[] input = {16, 17, 4, 3, 5, 2};

                int right_max = input[input.length - 1];
                int[] ans_array = new int[input.length];
                int k = 0;

                // store the rightmost element as the first leader
                ans_array[k++] = right_max;

                // scan from second-last element to the left
                for (int i = input.length - 2; i >= 0; i--) {
                    if (input[i] > right_max) {
                        right_max = input[i];
                        ans_array[k++] = right_max;
                    }
                }

                // print leaders in left-to-right order
                for (int i = k - 1; i >= 0; i--) {
                    System.out.print(ans_array[i]);
                    if (i > 0) System.out.print(" ");
                }
                System.out.println();

                //write the pseudocode for this logic
        /*
        Initialize right_max to the last element of the array
        Create an empty list to store leader elements
        Add right_max to the list of leader elements
        For each element from the second-last to the first in the array:
            If the current element is greater than right_max:
                Update right_max to the current element
                Add right_max to the list of leader elements
         */


    }
}
