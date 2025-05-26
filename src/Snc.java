import java.util.*;

public class Snc {
    public static void main(String[] args) {
        HashMap<Integer,String> hmp=new HashMap<Integer,String>();
        hmp.put(2,"two");
        hmp.put(4,"four");
        Map map = Collections.synchronizedMap(hmp);
        Set set = map.entrySet();
        synchronized(map) {
            Iterator i = set.iterator();
            while(i.hasNext()) {
                System.out.println(i.next());
            }
        }

    }
}