public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 50, 60, 40 };
        System.out.println("befor sorting");
        printarray(arr);
        selectsort(arr);
        System.out.println("-------------------------------------------");
        System.out.println("after sorting");
        printarray(arr);
    }

    static void selectsort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    int temp = arr[j];
                    arr[j] = arr[min_idx];
                    arr[min_idx] = temp;
                    min_idx = j;
                }
            }
        }
    }

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
