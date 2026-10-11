public class SecondLargest{

    // This method counts how many times target appears in the array
    public static int countOccurrences(int[] nums, int target) {

        int count = 0;  // Step 1: start from 0

        // Step 2: go through every element
        for (int i = 0; i < nums.length; i++) {

            // Step 3: does the current element match the target?(for checking)
            if (nums[i] == target) {
                count++;  // yes, add one to index
            }
        }

        return count;  // Step 4: give back the final verdict
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 3, 5, 1};

        System.out.println(countOccurrences(nums, 1));  // Output: 4
    }
}