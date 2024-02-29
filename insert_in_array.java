import java.util.Scanner;

public class insert_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pos of element: ");
        int pos = sc.nextInt();
        System.out.println("Enter the element: ");
        int element = sc.nextInt();
        int arr[] = {1, 3, 4, 5, 0};
        int n = 4;
        n = insert(arr, n, pos, element);
        System.out.println("\nArray after insertion:");
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

    static int insert(int arr[], int n, int pos, int x) {
        if (n == arr.length) {
            return n;
        }
        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = x;
        return n + 1;
    }
}
