import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        String input = "varaug";

        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.forEach((ch, freq) ->
                System.out.println(ch + ": " + freq));
    }
}
