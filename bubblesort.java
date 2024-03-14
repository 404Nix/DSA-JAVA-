public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 50, 60, 40 };
        System.out.println("befor sorting");
        printarray(arr);
        bubblysort(arr);
        System.out.println("-------------------------------------------");
        System.out.println("after sorting");
        printarray(arr);
    }

    static void bubblysort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped = false) {
                break;
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
