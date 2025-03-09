package Lab3;

public class BubbleSort2 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int lastUnsortedIndex = n - 1;

        while (lastUnsortedIndex > 0) {
            swapped = false;

            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
            lastUnsortedIndex--;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
