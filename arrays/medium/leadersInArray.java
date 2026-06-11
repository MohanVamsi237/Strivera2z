package medium;
import java.util.*;
class Solutionam9 {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = nums[nums.length - 1];
        list.add(max);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                list.add(nums[i]);
            }
        }

        Collections.reverse(list);
        return list;
    }
}