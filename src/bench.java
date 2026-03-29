import java.util.Scanner;

public class bench {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr.length - j - 1; k++) {
                    if (arr[k] > arr[k + 1]) {
                        int temp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                    }
                }
            }


        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }

    }
}

