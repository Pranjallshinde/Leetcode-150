//Time Complexity: O(log n) (binary search on both sides).
//Space Complexity: O(1)

  class FirstAndLastOccurrence {
    // Function to find first occurrence
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid; // possible answer
                high = mid - 1; // look on left side for first occurrence
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Function to find last occurrence
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid; // possible answer
                low = mid + 1; // look on right side for last occurrence
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
