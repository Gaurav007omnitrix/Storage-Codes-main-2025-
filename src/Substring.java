import java.util.ArrayList;
import java.util.List;

public class Substring {
    public List<String> substringWords(String[] words){
        List<String> substring = new ArrayList<>();
        for(int i=0;i< words.length;i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    substring.add(words[i]);
                    break;
                }
            }
        }
        return substring;
    }

    public static void main(String[] args) {
        Substring sm=new Substring();
        String[] words = {"mass","as","hero","superhero","ro"};
        System.out.println(sm.substringWords(words));
    }
}
