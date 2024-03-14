public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 50, 60, 40 };
        System.out.println("befor sorting");
        printarray(arr);
        insertsort(arr);
        System.out.println("-------------------------------------------");
        System.out.println("after sorting");
        printarray(arr);
    }

    static void insertsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
