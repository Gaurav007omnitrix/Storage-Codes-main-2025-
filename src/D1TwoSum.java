
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D1TwoSum {
    public static void main(String[] args) {

        int[] num ={3,5,6,8};
        int tar = 11;
        D1TwoSum Sum=new D1TwoSum();
        int[] result = Sum.twoSum(num,tar);
        System.out.println("Indices are"+ Arrays.toString(result));
    }

    public int[] twoSum(int[] num, int tar) {
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i< num.length;i++){
            int compliment = tar - num[i];
            if(mp.containsKey(compliment)){
                return  new int[] {mp.get(compliment),i};
            }
            else {
                mp.put(num[i],i);
            }
        }
        throw  new IllegalArgumentException("Nothing found");
    }

}
