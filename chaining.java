import java.util.*;
public class chaining {
    public static void main(String[] args) {
        int bucket = 7;
        myhash hash = new myhash(bucket);

        //inserting keys into hashing table using chaining
        hash.insert(20);
        hash.insert(10);
        hash.insert(55);
        hash.insert(25);
        hash.insert(44);
        hash.insert(60);

        System.out.println(hash.table);

        //deleting a key form hash table.
        hash.delete(60);
        hash.delete(44);

        System.out.println(hash.table);

        //seaching for a key(it will return boolean value)
        System.out.println(hash.search(60));
        System.out.println(hash.search(55));
    }
}

class myhash{
    int bucket;
    ArrayList<LinkedList<Integer>> table ;
    myhash(int b){
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
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
