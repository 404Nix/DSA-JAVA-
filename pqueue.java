import java.util.*;

public class pqueue {
    public static void main(String[] args) {
        Queue<Double> pqueue = new PriorityQueue<Double>();

        pqueue.offer(6.3);
        pqueue.offer(2.5);
        pqueue.offer(1.8);
        pqueue.offer(7.3);
        pqueue.offer(0.5);

    while(!pqueue.isEmpty()){
        System.out.println(pqueue.poll());
    }
    }
}
