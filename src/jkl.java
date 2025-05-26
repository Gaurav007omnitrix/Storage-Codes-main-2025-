import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jkl {
    public static void main(String[] args) {
        String str = "Gauravv";
        Stream.of(str).map(i->new StringBuilder(i).reverse()).forEach(System.out::println);
        str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
