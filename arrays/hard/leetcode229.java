// Majority Element II
package hard;
import java.util.*;
class Solutionah2 {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        int n = nums.length;
        int i = 0;

        while (i < n) {
            int count = 1;

            while (i + 1 < n && nums[i] == nums[i + 1]) {
                i++;
                count++;
            }

            if (count > n / 3) {
                list.add(nums[i]);
            }

            i++;
        }

        return list;
    }
}