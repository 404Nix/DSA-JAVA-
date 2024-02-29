import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        //put, ContainKey, remove, Size, ContainValue, get
        HashMap<String, Integer> M = new HashMap<>();
        M.put("A", 1);
        M.put("B", 2);
        M.put("C", 3);

        System.out.println(M);

        System.out.println(M.containsKey("A"));
        System.out.println(M.containsKey("D"));

        System.out.println(M.remove("C"));
        System.out.println(M);

        System.out.println(M.get("A"));
        System.out.println(M.get("D"));

        System.out.println(M.size());

        System.out.println(M.containsValue(1));
        System.out.println(M.containsValue(4));

        for(Map.Entry<String, Integer> e : M.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }


        
    }
}
