public class ArraySum {

    // This method takes an array and returns the sum of all its elements
    public static int sumOfArray(int[] nums) {

        int sum = 0;  // Step 1: start the total at 0(kyoki hmne koi array element nhi dale abhi tak)

        // Step 2: go through every element in the array
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];  // yaha p hmne current element(jo loop mein aayega) ko total mein jod diya 
        }
        // Step 3: give back the final total
        return sum;  
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int result = sumOfArray(nums);

        System.out.println(result);  // yaha p output 15 aayega
    }
}