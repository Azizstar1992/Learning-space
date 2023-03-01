package interview2;

public class MergeSort {
    
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // if the array is null or has only one element, it is already sorted
        }
        int[] aux = new int[arr.length]; // create an auxiliary array for merging
        mergeSort(arr, aux, 0, arr.length - 1); // call the recursive merge sort function
    }
    
    private static void mergeSort(int[] arr, int[] aux, int left, int right) {
        if (left >= right) {
            return; // base case: if the subarray has one or fewer elements, it is already sorted
        }
        int mid = left + (right - left) / 2; // find the midpoint of the subarray
        mergeSort(arr, aux, left, mid); // recursively sort the left half of the subarray
        mergeSort(arr, aux, mid + 1, right); // recursively sort the right half of the subarray
        merge(arr, aux, left, mid, right); // merge the two sorted halves
    }
    
    private static void merge(int[] arr, int[] aux, int left, int mid, int right) {
        // copy the subarray to the auxiliary array
        for (int i = left; i <= right; i++) {
            aux[i] = arr[i];
        }
        int i = left; // pointer to the left half of the subarray
        int j = mid + 1; // pointer to the right half of the subarray
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = aux[j++]; // if the left half is exhausted, copy the remaining elements from the right half
            } else if (j > right) {
                arr[k] = aux[i++]; // if the right half is exhausted, copy the remaining elements from the left half
            } else if (aux[j] < aux[i]) {
                arr[k] = aux[j++]; // if the current element in the right half is smaller, copy it
            } else {
                arr[k] = aux[i++]; // if the current element in the left half is smaller, copy it
            }
        }
    }
    
    
}