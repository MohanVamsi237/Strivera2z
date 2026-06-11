class Solutionb17 {
    public int countOccurrences(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int left = -1, right = -1;
        int count = 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                left = mid;
                right = mid;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (left == -1) {
            return 0;
        }

        while (left > 0 && arr[left - 1] == target) {
            left--;
            count++;
        }

        while (right < arr.length - 1 && arr[right + 1] == target) {
            right++;
            count++;
        }

        return count;
    }
}