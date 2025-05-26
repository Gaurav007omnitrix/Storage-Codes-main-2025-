import java.util.Scanner;

public class flower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the no of elements");
//        int n1= sc.nextInt();
        int[] flowerbed = {1, 0, 0, 0, 0,0, 1};
//        System.out.println("enter elements of array");
//        for(int j=0;j<n1;j++){
//            flowerbed[j]= sc.nextInt();
//        }
        System.out.println("Enter the  to check");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(true);
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;

                if (n == 0) {
                    System.out.println(true);
                    System.exit(1);
                }
            }
        }
        System.out.println(false);
    }
    }



