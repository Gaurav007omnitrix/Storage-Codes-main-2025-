import java.util.Scanner;

public class prime7 {
    public static void main(String[] args) {
        int num,b,count;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A Number");
        num =s.nextInt();
        b=1;
        count=0;
        while(b<= num)
        {
            if((num%b)==0)
                count=count+1;
            b++;
        }
        if(count==2)
            System.out.println(num +" is a prime number");
        else
            System.out.println(num +" is not a prime number");
    }
}
//step 1: Read num
//
//        step 2: Set b=1, count=0
//
//        step 3: Repeat through step-5 while (b <= num)
//
//        step 4: If (num mod b) equals to 0 then set count = count + 1
//
//        step 5: b = b + 1
//
//        step 6: If count equals to 2 then print “num is prime”
//
//        Else print “num is not prime”
//
//        step 7: Exit
