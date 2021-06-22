package com.myit.general.col;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String args[]){  
		  
	  LinkedList<String> ll=new LinkedList<String>();  
       ll.add("3Somali");  
       ll.add("1Kadali");  
       ll.add("2Ajali");  
       ll.add("4Ajali"); 
       ll.add("6Ajali"); 
       ll.add("5Ajali"); 
       //Traversing the list of elements in reverse order  
       Iterator<String> i=ll.descendingIterator();  
       while(i.hasNext())  
       {  
           System.out.println(i.next());  
       }  
         
	 }  
}
