public class Lastoccurence {
    public static void main(String[] args) {
        int arr[] = {5,10,10,10,10,20,30};
            int x = 10;
            int low = 0, high = arr.length-1;
            System.out.println(lastocc(arr, x, arr.length, low, high));
    }
    static int lastocc(int arr[], int x, int n, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (x > arr[mid]) {
            return lastocc(arr, x, n, mid + 1, high);
        }

        else if (x < arr[mid]) {
            return lastocc(arr, x, n, low, mid - 1);
        }
        else {
            if (mid == n || arr[mid] != arr[mid + 1]) {
                return mid;
            }
            else {
                return lastocc(arr, x, n, mid + 1, high);
            }
        }
    }
}
