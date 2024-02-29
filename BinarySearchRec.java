public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int x = 20;
        if (binarySearch(arr, 0, arr.length - 1, x) == -1) {
            System.out.println("Element does not exists in the array!");
        } else {
            System.out.println(arr[binarySearch(arr, 0, arr.length - 1, x)]);
        }
    }
    //--------------------BINARY SEARCH RECURSIVE-----------------------------
    static int binarySearch(int arr[], int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        }
        if (arr[mid] > x) {
            return binarySearch(arr, low, mid - 1, x);
        }

        if (arr[mid] < x) {
            return binarySearch(arr, mid + 1, high, x);
        }
        return mid;
    }
}
