public class qsortlomuto {
    public static void main(String[] args) {
        int arr[] = {4,18,12,6,15};
        printarray(arr);
        qsortl(arr, 0, arr.length-1);
        printarray(arr);
    }
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void qsortl(int[] arr, int l, int h){
        if (l<h) {
            int p = Lpartition(arr, l, h);
            qsortl(arr, l, p-1);
            qsortl(arr, p+1, h);
        }
    }
    static int Lpartition(int[] arr, int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j = l; j<=h-1; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }
}
