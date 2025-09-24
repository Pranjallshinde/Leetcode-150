class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            }
            else if (arr[mid] > target) {
                return binarySearch(arr, low, mid - 1, target); // search left half
            }
            else {
                return binarySearch(arr, mid + 1, high, target); // search right half
            }
        }
        return -1; // target not found
    }

