public class CheckPermutationWithMergeSort {

    public static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        mergeSort(sArray, 0, sArray.length - 1);
        mergeSort(tArray, 0, tArray.length - 1);

        return arraysEqual(sArray, tArray);
    }

    //  Merge Sort for char array
    public static void mergeSort(char[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    //  Merge two sorted halves
    public static void merge(char[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] leftArray = new char[n1];
        char[] rightArray = new char[n2];

        for (int i = 0; i < n1; i++) leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) arr[k++] = leftArray[i++];
        while (j < n2) arr[k++] = rightArray[j++];
    }

    //  Manual equality check
    public static boolean arraysEqual(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String[][] pairs = {
            {"apple", "papel"},
            {"carrot", "tarroc"},
            {"hello", "llloh"},
            {"abc", "bca"},
            {"test", "sett"}
        };

        for (String[] pair : pairs) {
            boolean result = isPermutation(pair[0], pair[1]);
            System.out.println(pair[0] + ", " + pair[1] + ": " + result);
        }
    }
}
