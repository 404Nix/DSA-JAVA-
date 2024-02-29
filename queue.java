import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args){

        Queue<String> newqueue = new LinkedList<String>();

        newqueue.offer("Audi");
        newqueue.offer("Mercedes");
        newqueue.offer("lambo");
        newqueue.offer("Ferrari");

        System.out.println(newqueue);
        newqueue.poll();
        System.out.println(newqueue.isEmpty());
        System.out.println(newqueue.size());
        System.out.println(newqueue.contains("Mercedes"));
        System.out.println(newqueue);
    }
}