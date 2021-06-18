package com.myit.general.funcinter;

import java.util.function.BiFunction;

public class ConstructorReferenceDemo4 {
	
	public static void main(String[] args) {
        
        MyFunctionalInterface4 mf = College::new;
        
        BiFunction<Integer, String[], College> f1 = College::new;// BiFunction Example
        BiFunction<Integer, String[], College> f2 = (id, names) -> new College(id,names);// equals to above line
            
        System.out.println(mf.getStudents(10, "Peter", "John", "Mike").getNames());
        System.out.println(f1.apply(20, "Ram,Laxhman,Ravan".split(",")).getNames());
        System.out.println(f2.apply(30, "Rahim,Akbar,Ismail".split(",")).getNames());
    }
	
}