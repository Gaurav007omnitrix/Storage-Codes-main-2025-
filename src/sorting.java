public class sorting {
    public static void main(String[] args) {
//-------------------------bubble sorting--------------------------
        int[] arr = {6, 0, 2, 4, 6, 8};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
            int sh = arr[n - 2]; // second highest element
            System.out.println(sh);
        }



//------------------------fibonacci----------------------------
//        int n1=0,n2=1,n3,count=10;
//        System.out.print(n1+" "+n2);
//
//        for(int i=2;i<count;++i)
//        {
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }
//-------------------------palindrome-------------------------------
//        int r,sum=0,temp;
//        int n=454;
//
//        temp=n;
//        while(n>0){
//            r=n%10;
//            sum=(sum*10)+r;
//            n=n/10;
//        }
//        if(temp==sum)
//            System.out.println("palindrome number ");
//        else
//            System.out.println("not palindrome");

//-------------------prime number----------------------
//        for (int n = 1; n <= 10; n++) {
//            if (n > 1 && isPrime(n)) {
//                System.out.println(n);
//            }
//        }
//    }
//
//    private static boolean isPrime(int num) {
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
        }
}
