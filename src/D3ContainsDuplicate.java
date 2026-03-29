import java.util.Arrays;
import java.util.HashSet;

public class D3ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 1};

        D3ContainsDuplicate uniq = new D3ContainsDuplicate();
        boolean unq = uniq.containsDuplicate(nums);
        System.out.println("This Array contains duplicate: " + unq);
    }
//        public boolean containsDuplicate(int[] nums) {
//            Arrays.sort(nums);
//            for(int i=1;i<nums.length;i++){
//                if(nums[i]==nums[i-1]){
//                    return true;
//                }
//            }
//            return false;
//        }
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    return true;
                }
                set.add(nums[i]);
            }
            return false;
        }

}
