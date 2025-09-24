class BinarySearchIterative {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // to avoid overflow

            if (arr[mid] == target) {
                return mid; // target found
            }
            else if (arr[mid] < target) {
                low = mid + 1; // search right half
            }
            else {
                high = mid - 1; // search left half
            }
        }
        return -1; // target not found
    }
