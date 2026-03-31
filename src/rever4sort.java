import java.util.Arrays;
import java.util.Scanner;

public class rever4sort {
    public static void main(String[] args) {
//        int n, res,j=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of elements in the array:");
//        n = sc.nextInt();
//        int arr[] = new int[n];
//        int rev[] = new int[n];
//        System.out.println("Enter "+n+" elements ");
//        for( int i=0; i < n; i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Reverse of an array is :");
//        for(int i= arr.length-1;i>=0 ; i--)
//        {
//
//            System.out.print(arr[i]+" ");
//
//        }
//    }
//}
//For sorting normal array we use:---- Arrays.sort(array); then print the array.
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n =sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the "+n+" elements:");
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();}

        Arrays.sort(arr);


        System.out.println( Arrays.toString(arr));
         sc.close();
        }
        }

