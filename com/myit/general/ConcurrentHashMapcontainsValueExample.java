package com.myit.general;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapcontainsValueExample {
	
	public static void main(String[] args)   
    {   
        ConcurrentHashMap<String, Integer>  mymap = new ConcurrentHashMap<String,  Integer>();   
    
        mymap.put("AAA", 10);   
        mymap.put("BBB", 15);   
        mymap.put("CCC", 25);   
        mymap.put("DDD", 255);   
        mymap.put("EEE",30);   
        System.out.println(" Mappings are: " +mymap);   

        System.out.println("is 255  present? ::  "  
                           + mymap.containsValue(255));   
        System.out.println("is EEE  present? ::  "  
                + mymap.containsKey("EEE"));   
    }   

}