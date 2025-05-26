import java.util.Arrays;
import java.util.Scanner;

public class penso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of n");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( int i=0; i < n; i++)
        {
            arr[i] = sc.nextInt(); //insertion of elements in an array
        }
//        System.out.println("reverse");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i]);
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        for(int i:arr){
//            System.out.println(i);
//        }
    }
}
