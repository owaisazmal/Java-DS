import java.util.Arrays;

public class Comp482HW1 {
    public static int binarySearch(int[] arr, int val, int start, int end) {
        if (start == end) {
            if (arr[start] > val) {
                return start;
            } else {
                return start + 1;
            }
        }
        
        int mid = (start + end) / 2;
        
        if (arr[mid] < val) {
            return binarySearch(arr, val, mid + 1, end);
        } else {
            return binarySearch(arr, val, start, mid);
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = binarySearch(arr, val, 0, i - 1);
            
            // Shift elements to make room for the value to be inserted
            int[] temp = Arrays.copyOf(arr, arr.length);
            for (int k = i; k > j; k--) {
                arr[k] = arr[k - 1];
            }
            arr[j] = val;
        }
    }
}
