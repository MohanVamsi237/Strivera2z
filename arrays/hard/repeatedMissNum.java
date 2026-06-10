package hard;
import java.util.*;
class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int repeating = -1,missing = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                repeating = arr[i];
                break;
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            if (Arrays.binarySearch(arr, i) < 0) {
                missing = i;
                break;
            }
        }

        return new int[]{repeating, missing};
    }
}