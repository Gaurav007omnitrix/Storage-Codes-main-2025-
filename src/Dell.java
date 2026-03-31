import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dell {
    public static void main(String[] args) {

       // List<Integer> ls= Arrays.asList(2,3,6,7,2,9,4);
        String s= "gaurav";

       s.chars().mapToObj(c->(char)c).filter(c->s.indexOf(c) !=s.lastIndexOf(c)).distinct().forEach(System.out::println);

      s.chars().mapToObj(c->(char)c)
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
              .entrySet()
              .stream()
              .filter(i->i.getValue()==1)
              .map(i->i.getKey())
              .forEach(System.out::print);



    }
}
