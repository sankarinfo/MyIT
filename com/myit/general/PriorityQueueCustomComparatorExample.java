package com.myit.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparatorExample {
	public static void main(String[] args) {
        // A custom comparator that compares two Strings by their length.
        Comparator<String> stringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        /*
        The above Comparator can also be created using lambda expression like this =>
        Comparator<String> stringLengthComparator = (s1, s2) -> {
            return s1.length() - s2.length();
        };

        Which can be shortened even further like this =>
        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
        */

        // Create a Priority Queue with a custom Comparator
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

        // Add items to a Priority Queue (ENQUEUE)
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        // Remove items from the Priority Queue (DEQUEUE)
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }
        
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Atesting"));
        personList.add(new Person("Dtesting"));
        personList.add(new Person("Atesting"));
        personList.add(new Person("Btesting"));
        
        Collections.sort(personList, (Person a, Person b) -> a.getName().compareTo(b.getName()));
        personList.forEach(a->System.out.println("v-->"+a.getName()));
       // System.out.println("personList --->"+personList.forEach(System.out::println));
    }
	
	public static class Person {
		
		String name;
		
		Person(String name) {
			this.name = name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
	}
}
