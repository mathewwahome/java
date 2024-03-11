public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 1, 3 };
        int value = 7; // Element to search for
        int index = linearSearch(arr, value);
        if (index != -1) {
            System.out.println("Element " + value + " found at index " + index);
        } else {
            System.out.println("Element " + value + " not found in the array");
        }
    }

    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }
}
