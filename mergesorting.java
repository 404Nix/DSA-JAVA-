public class mergesorting {
    public static void main(String[] args) {
        int[] arr = {10,5,15,20,30};
        printarray(arr);
        mergesort(arr, 0, arr.length-1);
        printarray(arr);

    }

    static void mergesort(int[] arr, int l, int r){
        int m = l+(r-l)/2;
        if (r>l) {
            mergesort(arr, l, m);
            mergesort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m+1+i];
        }

        int i=0,j=0,k=l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k] = left[i];
            i++; k++;
        }
        while (j<n2) {
            arr[k] = right[j];
            j++; k++;
        }
    }

    

    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
