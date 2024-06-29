public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 7, 6};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {// Outer loop
            for (int j = 0; j < n - i - 1; j++) {//Inner loop
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sorted Array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
