public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7 }; // Array must be sorted for binary search
        int value = 7; // Element to search for
        int index = binarySearch(arr, value);
        if (index != -1) {
            System.out.println("Element " + value + " found at index " + index);
        } else {
            System.out.println("Element " + value + " not found in the array");
        }
    }

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
