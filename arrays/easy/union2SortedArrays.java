package easy;
import java.util.*;
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int[] A = new int[nums1.length + nums2.length];

        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            A[j] = nums1[i];
            j++;
        }

        for (int i = 0; i < nums2.length; i++) {
            A[j] = nums2[i];
            j++;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int x : A) {
            set.add(x);
        }

        int[] B = new int[set.size()];

        int i = 0;
        for (int x : set) {
            B[i] = x;
            i++;
        }

        Arrays.sort(B);

        return B;
    }
}