package Lab3;

public class Sort1 {

    public static void sortColors(int[] A) {
        int low = 0, mid = 0, high = A.length - 1;

        while (mid <= high) {
            if (A[mid] == 0) {
                int temp = A[low];
                A[low] = A[mid];
                A[mid] = temp;
                low++;
                mid++;
            } else if (A[mid] == 1) {
                mid++;
            } else {
                int temp = A[mid];
                A[mid] = A[high];
                A[high] = temp;
                high--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {2, 0, 2, 1, 1, 0};
        System.out.println("Original Array:");
        printArray(A);

        sortColors(A);

        System.out.println("Sorted Array:");
        printArray(A);
    }
}
