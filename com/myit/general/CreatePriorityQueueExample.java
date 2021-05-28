package com.myit.general;

import java.util.PriorityQueue;

public class CreatePriorityQueueExample {

	public static void main(String[] args) {
		
        PriorityQueue<String> strs = new PriorityQueue<>();
        strs.add("vtesting");
        strs.add("atesting");
        strs.add("wtesting");
        System.out.println("testing :"+strs);

        // Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);
        System.out.println("testing :"+numbers);
        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }
        System.out.println("testing :"+numbers);

    }

}