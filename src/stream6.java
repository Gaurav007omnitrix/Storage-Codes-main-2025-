import java.util.*;
import java.util.stream.Collectors;


public class stream6 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();

        Collections.addAll(al,1,1,2,6,9,4,20,7,8,8,34,33,31);
//                System.out.println(al);
                //List<Integer> ls = al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
      //al.stream().map(s->s+ " ").filter(n->n.startsWith("1")).forEach(System.out::println);

      //  Set<Integer> lt= al.stream().collect(Collectors.toSet());//to print distinct elements .distinct() if list

//        Set<Integer> lr=new HashSet<>();
//        Set<Integer> lt= al.stream().filter(n -> !lr.add(n)).collect(Collectors.toSet());//print duplicate elements

       //  al.stream().findFirst().ifPresent(System.out::println);  print first element
       // al.stream().findFirst().get(); print first element
       // System.out.println(al.stream().count()); return number of elements in a list

//        Integer var= al.stream().max(Integer::compare).get(); return the maximum value present in a list
//        System.out.println(var);

      List<Integer> lt=  al.stream().sorted().toList(); //to sort the elements in list

//     al.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//       to sort the elements in descending order

     System.out.println("Printing the List after stream operation : " + lt);
            }
        }

