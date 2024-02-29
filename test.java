public class test {
    public static void main(String[] args) {
        int arr[] = {15,20};
            System.out.println(searchitem(arr, 5));
    }
    static int searchitem(int arr[], int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
