package Arrays;

public class kthSmallest {
    public int kthSmallest(int[] arr, int k) {
        int target = k - 1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int pivotIndex = partition(arr, left, right);

            if (pivotIndex == target) {
                return arr[pivotIndex];
            } 
            else if (pivotIndex > target) {
                right = pivotIndex - 1;
            } 
            else {
                left = pivotIndex + 1;
            }
        }

        return -1;
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, right);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
