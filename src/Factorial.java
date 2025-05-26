public class Factorial {

    public static void main(String[] args) {
//        int number = 5; // Change this to the desired number
//        long factorial = calculateFactorial(number);
//        System.out.println("Factorial of " + number + " is: " + factorial);
//    }
//
//    public static long calculateFactorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * calculateFactorial(n - 1);
//        }



        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }
}