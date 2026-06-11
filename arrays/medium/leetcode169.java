// Majority Element
package medium;
import java.util.Arrays;
class Solutionam3 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}