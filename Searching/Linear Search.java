class LinearSearch {
    // Function to perform Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index if element found
            }
        }
        return -1; // return -1 if element not found
    }
