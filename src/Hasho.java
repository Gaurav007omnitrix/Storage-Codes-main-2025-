import java.util.HashSet;
import java.util.Iterator;



public class Hasho {
    public int singleNumber(Integer[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            boolean flag = set.add(i);
            System.out.println("set.add("+i+") flag = "+flag);
            if (!flag) {
                System.out.println("if Before remove set.size() - "+set.size());
                set.remove(i);
                System.out.println("if After remove set.size() - "+set.size());
            }else {
                System.out.println(" else set.size() - "+set.size());
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }



    public static void main(String[] args) {
        Integer[] nums =new Integer[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 3;
        nums[4] = 2;
        Hasho hasho = new Hasho();
        int result = hasho.singleNumber(nums);
        System.out.println("Result = "+result);
    }
}


