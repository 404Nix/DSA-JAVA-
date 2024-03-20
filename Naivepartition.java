public class Naivepartition {
    public static void main(String[] args) {
        int arr[] = {4,18,12,6,15};
        printarray(arr);
        partition(arr, 0, arr.length-1, 3);
        printarray(arr);
    }
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void partition(int[] arr, int l, int h, int p){
        int[] temp = new int[h-l+1];
        int index = 0;
        for (int i = l; i <=h; i++) {
            if (arr[i] <= arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = l; i <= h; i++) {
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = l; i <= h; i++) {
            arr[i] = temp[i];
        }
    }
}
