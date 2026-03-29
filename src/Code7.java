import java.util.HashMap;
import java.util.Map;

public class Code7 {
    public static void main(String[] args) {
//  find the duplicate character in a string an its count

        String s = "gauravmahatog";   // a=4

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(map.containsKey(c))
            {
                int count = map.get(c);
                count++;
                map.put(c,count);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map); //frequency map
        for(Map.Entry<Character,Integer> mp : map.entrySet()){
            if(mp.getValue()>=2){
                System.out.println(mp.getKey() + ":" + mp.getValue());
            }
        }


    }
}
