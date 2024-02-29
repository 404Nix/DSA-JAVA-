import java.util.ArrayList;
import java.util.LinkedList;

class practice{
    public static void main(String[] args) {
        chaining Hash = new chaining(7);
        Hash.insert(20);
        Hash.insert(30);
        Hash.insert(40);
        Hash.insert(50);

        System.out.println(Hash.table);
        Hash.delete(50);
        System.out.println(Hash.table);
        System.out.println(Hash.search(40));
    }
}


class chaining {
    int bucket;
    ArrayList<LinkedList<Integer>> table;

    chaining(int b){
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < bucket; i++) {
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(int key){
        int i = key % bucket;
        table.get(i).add(key);
    }

    void delete(int key){
        int i = key % bucket;
        table.get(i).remove((Integer)key);
    }

    boolean search(int key){
        int i = key % bucket;
        return table.get(i).contains(key);
    }

}