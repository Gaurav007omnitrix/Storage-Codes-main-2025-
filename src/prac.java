import java.util.HashMap;
import java.util.Map;


public class prac {
    public static void main(String[] args) {

        String str="GeekforGeeks";
        Map<Character,Integer> mp=new HashMap<>();
        for(Character c:str.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(Character c: str.toCharArray()) {
            if(mp.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }

    }
}
