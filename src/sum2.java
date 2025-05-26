import java.util.Scanner;

public class sum2 {

    public static int nsum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       System.out.println("enter the no of elements");
        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++){
//             sum= sum + i;
//        }
//        System.out.println(sum);
        System.out.println( "sum="+nsum(n));
    }
}
//sum of natural numbers using for loop,while loop & function.