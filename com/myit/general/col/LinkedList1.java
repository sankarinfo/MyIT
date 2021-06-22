package com.myit.general.col;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Kishore");  
		  al.add("Sonali");  
		  al.add("Kishore");  
		  al.add("Mari");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }  
	}  
}
