package com.myit.general.funcinter;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceDemo {
	
        
	public static void main(String[] args) {
        
        MyFunctionalInterface1 mf = Student::new;
        
        Supplier<Student> s1 = Student::new;// Supplier Example
        Supplier<Student> s2 = () -> new Student();// equals to above line
            
        System.out.println(mf.getStudent());//Student class toString() call
        System.out.println(s1.get());//Student class toString() call
        System.out.println(s2.get());//Student class toString() call

        MyFunctionalInterfaceWithParam sp = Student::new;
        Function<String, Student> f1 = Student::new;// Function Example
        Function<String, Student> f2 = (name) -> new Student(name);// equals to above line
            
        System.out.println(sp.getStudent("Peter").getName());//Peter
        System.out.println(f1.apply("Gerhard").getName());//Gerhard
        System.out.println(f2.apply("Gerhard").getName());//Gerhard

    }
    
	
}
