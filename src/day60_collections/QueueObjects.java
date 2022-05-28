package day60_collections;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        //queue can't accept null
        queue.offer(34); //offer is the same as add
        System.out.println(queue);

        //System.out.println(new PriorityQueue<>().remove());  causes exception because there is no elements
        System.out.println(new PriorityQueue<>().poll());//  return null
    }
}
