//interface yo {
//    public void see();
//}
//public class lambda5 {
//    public static void main(String[] args) {
//        int roll=47;
//        yo s1 = () -> {
//            System.out.println("Hello"+roll);
//        };
//s1.see();
//       // System.out.println(s1.see("hello"));
//    }
//    }   //lambda example
//--------------------------------------------------------------------
//interface yo{
//    public String say();
//}
//public class lambda5{
//    public static void main(String[] args) {
//        yo s=()->{
//            return "I have nothing to say.";
//        };
//        System.out.println(s.say());
//    }
//}                        //---No Parameter---
//---------------------------------------------------------------------
//interface yo{
//    public String say(String name);
//}
//
//public class lambda5{
//    public static void main(String[] args) {
//
//        // Lambda expression with single parameter.
//        yo s1=(name)->{
//            return "Hello, "+name;
//        };
//        System.out.println(s1.say("Sonoo"));
//
//        // You can omit function parentheses
//        yo s2= name ->{
//            return "Hello, "+name;
//        };
//        System.out.println(s2.say("Sonoo"));
//    }
//}                               //----Single Parameter-----
//-------------------------------------------------------
//interface Addable{
//    int add(int a,int b);
//}
//
//public class lambda5{
//    public static void main(String[] args) {
//
//        // Multiple parameters in lambda expression
//        Addable ad1=(a,b)->(a+b);
//        System.out.println(ad1.add(10,20));
//
//        // Multiple parameters with data type in lambda expression
//        Addable ad2=(int a,int b)->(a+b);
//        System.out.println(ad2.add(100,200));
//    }
//}                                      //-----Multiple Parameters------
//____________________________________________________________________________
//interface Addable{
//    int add(int a,int b);
//}
//
//public class lambda5 {
//    public static void main(String[] args) {
//
//        // Lambda expression without return keyword.
//        Addable ad1=(a,b)->(a+b);
//        System.out.println(ad1.add(10,20));
//
//        // Lambda expression with return keyword.
//        Addable ad2=(int a,int b)->{
//            return (a+b);
//        };
//        System.out.println(ad2.add(100,200));
//    }
//}                                   //-------with or without return-------
//_________________________________________________________________________
//import java.util.*;
//public class lambda5{
//    public static void main(String[] args) {
//
//        List<String> list=new ArrayList<String>();
//        list.add("ankit");
//        list.add("mayank");
//        list.add("irfan");
//        list.add("jai");
//
//        list.forEach(
//                (n)->System.out.println(n)
//        );
//    }                                //--------For each Loop--------------
//}
////__________________________________________________________________________
//@FunctionalInterface
//interface yo{
//    String say(String message);
//}
//
//public class lambda5{
//    public static void main(String[] args) {
//
//        // You can pass multiple statements in lambda expression
//        yo person = (message)-> {
//            String str1 = "I would like to say, ";
//            String str2 = str1 + message;
//            return str2;
//        };
//        System.out.println(person.say("time is precious."));
//    }
//}                      //------Multiple Statements-------
//-----------------------------------------------------------------------------
//public class lambda5{
//    public static void main(String[] args) {
//
//        //Thread Example without lambda
//        Runnable r1=new Runnable(){
//            public void run(){
//                System.out.println("Thread1 is running...");
//            }
//        };
//        Thread t1=new Thread(r1);
//        t1.start();
//        //Thread Example with lambda
//        Runnable r2=()->{
//            System.out.println("Thread2 is running...");
//        };
//        Thread t2=new Thread(r2);
//        t2.start();
//    }
//}                             //----------Creating Thread---------
//----------------------------------------------------------------------------------
//import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.List;
//class Product{
//    int id;
//    String name;
//    float price;
//    public Product(int id, String name, float price) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//}
//public class lambda5{
//    public static void main(String[] args) {
//        List<Product> list=new ArrayList<Product>();
//
//        //Adding Products
//        list.add(new Product(1,"HP Laptop",25000f));
//        list.add(new Product(3,"Keyboard",300f));
//        list.add(new Product(2,"Dell Mouse",150f));
//
//        System.out.println("Sorting on the basis of name...");
//
//        // implementing lambda expression
//        Collections.sort(list,(p1,p2)->{
//            return p1.name.compareTo(p2.name);
//        });
//        for(Product p:list){
//            System.out.println(p.id+" "+p.name+" "+p.price);
//        }
//
//    }
//}                                 //----Comparator-----------
//-----------------------------------------------------------------------------
//import java.util.ArrayList;
//        import java.util.List;
//        import java.util.stream.Stream;
//class Product{
//    int id;
//    String name;
//    float price;
//    public Product(int id, String name, float price) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//}
//public class lambda5{
//    public static void main(String[] args) {
//        List<Product> list=new ArrayList<Product>();
//        list.add(new Product(1,"Samsung A5",17000f));
//        list.add(new Product(3,"Iphone 6S",65000f));
//        list.add(new Product(2,"Sony Xperia",25000f));
//        list.add(new Product(4,"Nokia Lumia",15000f));
//        list.add(new Product(5,"Redmi4 ",26000f));
//        list.add(new Product(6,"Lenovo Vibe",19000f));
//
//        // using lambda to filter data
//        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);
//
//        // using lambda to iterate through collection
//        filtered_data.forEach(
//                product -> System.out.println(product.name+": "+product.price)
//        );
//    }
//}                                  //---Filter---Collection---Data-----
//---------------------------------------------------------------------------------------------------
import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JTextField;
public class lambda5 {
    public static void main(String[] args) {
        JTextField tf=new JTextField();
        tf.setBounds(50, 50,150,20);
        JButton b=new JButton("click");
        b.setBounds(80,100,70,30);

        // lambda expression implementing here.
        b.addActionListener(e-> {tf.setText("gaddari krbe");});

        JFrame f=new JFrame();
        f.add(tf);f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);

    }

}                              //-----Event---Listener----
//------------------------------------------------------------------------------------------
