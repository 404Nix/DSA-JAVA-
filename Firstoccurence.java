public class Firstoccurence {
        public static void main(String[] args) {
            int arr[] = {5,10,10,10,10,20,30};
            int x = 10;
            System.out.println(firstocc(arr, x, arr.length));
        }
        static int firstocc(int arr[], int x, int n) {
            int low = 0, high = n-1;
            while (low<=high) {
                int mid = (low + high)/2;
                if (x > arr[mid]) {
                    low = mid + 1;
                }
                else if (x < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    if (mid == 0 || arr[mid-1] != arr[mid]) {
                        return mid;
                    }
                    else{
                        high = mid -1;
                    }
                }
            }
            return -1;
        } 
}
