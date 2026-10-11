public class LargestNumber {

    // This method counts how many even numbers are in the array
    public static int countEven(int[] nums) {

        int count = 0;  // Step 1: start from 0(coz we don't found any even no. yet)

        // Step 2: go through every element
        for (int i = 0; i < nums.length; i++) {

            // Step 3: check if the current number is even
            if (nums[i] % 2 == 0) {
                count++;  // it's even, so add one to the index
            }
        }

        return count;  // Step 4: give back the final verdict
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println(countEven(nums));  // Output: 3
    }
}
