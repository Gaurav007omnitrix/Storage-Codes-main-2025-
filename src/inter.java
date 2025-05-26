import java.util.*;

public class inter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        sc.close();
        System.out.println(maxRepetativeWord(input));

    }

    public static  String maxRepetativeWord(String input){
        String maxRepetativeWord = "";

        if(input == null || input.isEmpty()){
            return maxRepetativeWord;
        }

        String[] words = input.split("\\s+");
        Map<String,Integer> count = new HashMap<>();
        for(String word : words){
            count.put(word,count.getOrDefault(word,0)+1);
        }
        int maxCount = Collections.max(count.values());
        List<String> maxWords = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : count.entrySet()) {
            if (entry.getValue() == maxCount){
                maxWords.add(entry.getKey());
            }
        }
        maxRepetativeWord =  String.join(" ",maxWords);
        return maxRepetativeWord;

    }
}
