// Maxmimum element in an array
package easy;
class Solutionae1 {
    public int largestElement(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}