class Solutionb16 {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int left = -1, right = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                left = mid;
                right = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (left == -1) {
            return new int[]{-1, -1};
        }

        while (left > 0 && nums[left - 1] == target) {
            left--;
        }

        while (right < nums.length - 1 && nums[right + 1] == target) {
            right++;
        }

        return new int[]{left, right};
    }
}