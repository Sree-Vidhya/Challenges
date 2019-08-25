package com.myob;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Alice");
        priorityQueue.add("Charlie");
        priorityQueue.add("Bailey");
        priorityQueue.add("Fiona");
        priorityQueue.add("Sally");
        priorityQueue.add("Jerry");
        priorityQueue.add("Paul");

        System.out.println(priorityQueue);

        while(priorityQueue.isEmpty() == false) {
            System.out.println(priorityQueue.poll());
        }

    }
}
