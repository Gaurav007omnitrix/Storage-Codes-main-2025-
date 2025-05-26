import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream10 {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(1, 2, 6, 8, 9, 10, 34);
        List<String> ps = Arrays.asList("abc", "ffg", "ddf", "ert", "seff");

//        List<String> g=ps.stream().filter(i->!i.matches("^[aeiouAEIOU].*")).collect(Collectors.toList());
//        System.out.println(g); //eliminate words starting with vowel

//        List<String> g=ps.stream().filter(i->!i.endsWith("g")).collect(Collectors.toList());
//        System.out.println(g);  //print the words which !endwith "g"

//        --------array sorting------
//        int[] arr = new int[5];
//        int temp = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
// ---------------------------------------------


    }
}
