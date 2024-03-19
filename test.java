public class test {
        static void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] merge = new int[m+n];
            int i = 0;
            int j = 0;
            int k = 0;
            while(i<m && j<n){
                if(nums1[i]<=nums2[j]){
                    // System.out.print(nums1[i]+" ");
                    merge[k] = nums1[i];
                    i++;
                    k++;
                }else{
                    merge[k] = nums2[j];
                    j++;
                    k++;
                }
            }
            while(i<m){
                merge[k] = nums1[i];
                i++;
                k++;
            }
            while(j<n){
                merge[k] = nums2[j];
                j++;
                k++;
            }
            for(int a = 0; a<m+n; a++){
                nums1[a] = merge[a];
            }
        }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(arr, m, arr2, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
