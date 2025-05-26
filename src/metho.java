

public class metho {

    static void minus(int x,int v) {
        int min=x-v;
        System.out.println(min);
        System.out.println("gello");
    }


    void add(int a, int b) {
        int sum=a+b;
        System.out.println(sum);
        System.out.println("hello");
    }

    public static void main(String[] args) {
        minus(5,4); //static-method call
        metho mt=new metho();
          mt.add(1,2); //non-static method call using object
    }
}
