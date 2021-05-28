package com.myit.general;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LampdaExpression {

	
	public static void main(String[] args) {
		
		String sone = "civic";
		String stwo = "civic";
		char []m  = sone.toCharArray();
		char []n  = stwo.toCharArray();
		Arrays.sort(m);
		Arrays.sort(n);
		System.out.println(m);
		System.out.println(n);

		System.out.println(Arrays.equals(m, n));
		
	    EvenOdd evenOdd = (int a) -> {
			if(a%2==0){
				System.out.println("Number "+a+" is even.");
			}else{
				System.out.println("Number "+a+" is odd.");
			}
		};
				
		evenOdd.check(10);
		evenOdd.check(11);
			    
		Arithmetic division = (int a) -> ( a%2 );
		System.out.println(division.operation(13)==1);
		
		int number = 100;
        boolean isPrime =  !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
        System.out.println("isPrime--->"+isPrime);
        
	}
	
	interface Arithmetic {
		int operation(int a);
	}

	interface EvenOdd {
		void check(int a);
	}

}
