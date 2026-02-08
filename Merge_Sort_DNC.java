public class Merge_Sort_DNC {

    static int[] arr = {9, 5, 2, 6, 1, 7, 3};
    static int n = arr.length;

    static void merge(int low, int mid, int high) {
        int[] brr = new int[n];

        int h = low, i = low, j = mid + 1;

        while (h <= mid && j <= high) {
            if (arr[h] < arr[j]) {
                brr[i++] = arr[h++];
            } else {
                brr[i++] = arr[j++];
            }
        }

        while (h <= mid) {
            brr[i++] = arr[h++];
        }

        while (j <= high) {
            brr[i++] = arr[j++];
        }

        for (int k = low; k <= high; k++) {
            arr[k] = brr[k];
        }
    }

    static void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void main(String[] args) {

        mergeSort(0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
