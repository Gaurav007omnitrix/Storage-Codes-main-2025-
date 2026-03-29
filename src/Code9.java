public class Code9 {
    public static void main(String[] args) {
        // LeetCode Problem 26: Remove Duplicates from Sorted Array
        int[] nums = {1,1,2}; // Input array

        Code9_1 sol = new Code9_1();
        int k = sol.removeDuplicates(nums); // Calls your implementation

        System.out.println("New length: " + k);

        // Print the modified array up to k
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Code9_1 {
    // Removes duplicates in-place and returns the new length
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // First element is always unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}