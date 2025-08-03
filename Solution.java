class Solution {
    public static int[] sortArray(int[] nums) {
        // Selection sort algorithm
        for (int i = 0; i < nums.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minpos] > nums[j]) {
                    minpos = j;
                }
            }
            // Swap
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
        return nums; // Return the sorted array
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) { // Corrected loop condition
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 2, 0, 0};
        nums = sortArray(nums); // Call the static method
        printArray(nums); // Print the sorted array
    }
}