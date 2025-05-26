import java.util.*;
import java.util.stream.Collectors;


class distinctSortedSet8 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        Collections.addAll(list,3,3,5,4,0,4);
//        List<Integer> lt=list.stream().distinct().map(s-> s*s).filter(num-> num> 0).collect(Collectors.toList());
//        System.out.println(lt);
               //.forEach(System.out::println);
//----------------------------- Sorted Set------------------------------------------------------------------------------------------
        Set<Integer> st=new HashSet<Integer>();
        Collections.addAll(st,3,3,4,0,5,1,4);
        System.out.println(st);
    }
}