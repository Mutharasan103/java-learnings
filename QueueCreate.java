package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCreate {
    public static void main(String[] args) {
        //Queue<Integer> queue= new LinkedList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(15);
        queue.add(50);
        System.out.println("The Queue is "+queue);
        System.out.println("The head of the queue is "+queue.peek());
        System.out.println(queue.remove());
        System.out.println("The queue is "+queue);
        System.out.println(queue.hashCode());

    }
}
