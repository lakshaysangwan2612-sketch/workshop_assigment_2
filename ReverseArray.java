public class ReverseArray{

    // This method finds the largest number in the array
    public static int findMax(int[] nums) {

        int max = nums[0];  // Step 1: assume the first element is the largest

        // Step 2: go through the rest of the elements (start at index 1)
        for (int i = 1; i < nums.length; i++) {

            // Step 3: is the current number bigger than our max so far?
            if (nums[i] > max) {
                max = nums[i];  // yes, so it becomes the new max
            }
        }

        return max;  // Step 4: give back the largest number
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 56, 100, 16};

        System.out.println(findMax(nums));  // Output: 100
    }
}
