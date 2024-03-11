/*
 * The algorithm works by repeatedly swapping adjacent elements if they are in
 * the wrong order until the list is sorted. - complexity of O(n^2)
 */
//the largest num to the right (asc)

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 3};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
