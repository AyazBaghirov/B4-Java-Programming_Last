package day41_collection.queue;

import java.util.PriorityQueue;

public class QueueObjects {

    public static void main(String[] args) {

        // add() ------- > offer()
        // remove() ---- > poll()  -- > removes the element
        // get() ------- > peak() -- > gives you the element which is at the TOP




        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // Insertion order is NOT KEPT (RANDOM ORDER), does NOT allow null

        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2); // Duplicates are allowed
        //priorityQueue.add(null); // null is NOT allowed --- > NullPointerException
        System.out.println(priorityQueue);


        priorityQueue.offer(30);
        System.out.println(priorityQueue);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);

        System.out.println();

        priorityQueue.poll();   // FIFO -- > First in First Out -- > first one was removed
        System.out.println(priorityQueue);
        priorityQueue.poll();   // FIFO -- > First in First Out -- > first one was removed
        System.out.println(priorityQueue);







    }
}