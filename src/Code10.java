public class Code10 {
    public static void main(String[] args) {
        //leet code easy question
        //remove duplicates from unsorted array
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // Input array
        Code10_1 sol = new Code10_1();
        int k = sol.removeDuplicatesUnsorted(nums); // Calls your implementation
        System.out.println("New length: " + k);
        // Print the modified array up to k
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
        static class Code10_1 {
            // Removes duplicates in-place and returns the new length
            public int removeDuplicatesUnsorted(int[] nums) {
                java.util.HashSet<Integer> set = new java.util.HashSet<>();
                for (int num : nums) {
                    set.add(num);
}
                int index = 0;
                for (int num : set) {
                    nums[index++] = num;
                }
                return set.size();
            }
        }
    }

