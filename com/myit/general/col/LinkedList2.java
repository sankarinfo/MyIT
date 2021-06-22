package com.myit.general.col;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String args[]){  
	   LinkedList<String> ll=new LinkedList<String>();  
	   System.out.println("Initial list of elements: "+ll);  
	   ll.add("Samy");  
	   ll.add("Ajith");  
	   ll.add("Doni");  
	   System.out.println("After invoking add(E e) method: "+ll);  
	   //Adding an element at the specific position  
	   ll.add(1, "Kannan");  
	   System.out.println("After invoking add(int index, E element) method: "+ll);  
	   LinkedList<String> ll2=new LinkedList<String>();  
	   ll2.add("Sonali");  
	   ll2.add("Hari");  
	   //Adding second list elements to the first list  
	   ll.addAll(ll2);  
	   System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
	   LinkedList<String> ll3=new LinkedList<String>();  
	   ll3.add("John");  
	   ll3.add("Rahul");  
	   //Adding second list elements to the first list at specific position  
	   ll.addAll(1, ll3);  
	   System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
	   //Adding an element at the first position  
	   ll.addFirst("Lokesh");  
	   System.out.println("After invoking addFirst(E e) method: "+ll);  
	   //Adding an element at the last position  
	   ll.addLast("Harsh");  
	   System.out.println("After invoking addLast(E e) method: "+ll);         
	}  
}