import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <=n){
            int temp = b;
            b = b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
         sc.close();
    }
}


// 0,1,1,2,3,5,8,13,21,34......
// 0,1,2,3,4,5,6,07,08,09  index