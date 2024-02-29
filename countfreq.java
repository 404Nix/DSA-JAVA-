import java.util.HashMap;
import java.util.Map;

public class countfreq {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,40,30,20};

        countfrequency(arr);
    }

    static void countfrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (map.containsKey(arr[i])) {
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     } else {
        //         map.put(arr[i], 1);
        //     }
        // }
            for(int x : arr){
                map.put(x, map.getOrDefault(x, 0)+1);
            }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
