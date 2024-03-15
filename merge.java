public class merge {
    public static void main(String[] args) {
        int a[] = { 9, 10, 30, 30 };
        int b[] = { 11, 12 };

        mergesort(a, b);
    }

    static void mergesort(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while (i < m) {
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
