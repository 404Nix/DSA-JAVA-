public class Lomutopartition {
    public static void main(String[] args) {
        int arr[] = {4,18,12,15,6};
        printarray(arr);
        lpartition(arr, 0, arr.length-1);
        printarray(arr);
    }
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void lpartition(int[] arr, int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for (int j = l; j <= h-1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
    }
}
