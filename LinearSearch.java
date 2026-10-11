public class LinearSearch {

    // This method searches for target in the array
    // ye index dega agar mil jaye to, otherwise -1
    public static int linearSearch(int[] nums, int target) {
        

        // Step 1: go through every element, one by one
        for (int i = 0; i < nums.length; i++) {

            // Step 2: check if the current element is our target
            if (nums[i] == target) {
                return i;  // found it! then it will return immediately and then stop
            }
        }

        // Step 3: the loop finished and hme nhi mila(our target element)
        return -1;  //it's a common convention to indicate that search is failed
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(linearSearch(nums, 0));  // Output: 4(0 is found at 4th place)
        System.out.println(linearSearch(nums, 3));  // Output: -1(3 is not present in the array)
    }
}
