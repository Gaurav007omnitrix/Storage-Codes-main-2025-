import java.util.List;

public class ok {
    public static void main(String[] args) {

        List<Integer> ls= List.of(1,2,3,4,5);
        //average using streams
        ls.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
        
    }
}
