import java.util.HashSet;
public class countdistinct {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,40,30,20};
        countDistinct(arr);
    }

    static void countDistinct(int arr[]){
        HashSet<Integer> S = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            S.add(arr[i]);
        }

        for (Integer x : S) {
            System.out.println(x);
        }
    }
}
