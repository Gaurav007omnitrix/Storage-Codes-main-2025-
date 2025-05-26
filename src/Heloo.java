import java.util.ArrayList;
import java.util.List;

public class Heloo {
    public static void main(String[] args) {
        List<Integer> lt=new ArrayList<Integer>();
        lt.add(1);
        lt.add(2);
        lt.add(3);
    List<Integer>  msg =new ArrayList<Integer>();
        msg.add(5);
        msg.add(6);
        lt.addAll(msg);
        System.out.println(lt);
    }
}

