public class Code8 {
    public static void main(String[] args) {
        //reverse a string without using inbuilt method,

        String s = "gaurav";
        String rev = "";

        int len = s.length();

        for(int i=len-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);

        //swap without using third variable

        int a=5,b=6;

        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println("a" +":" + a + "\n"+"b" +":" + b);

    }
}
