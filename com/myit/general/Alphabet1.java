package com.myit.general;

public class Alphabet1 {

	public static void main(String[] args) {
		
		int x = 3;
		int a = x++; // a = 3, x = 4
		int b = ++a; // b = 4, a = 4
		System.out.println("x="+x);
		System.out.println("a="+a);
		System.out.println("b="+b);


		for (int k=0;k<5;++k) {
			System.out.println(k);
		}
		char last = 'E', alphabet = 'A';

	    for (int i = 1; i <= (last - 'A' + 1); ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(alphabet + " ");
	      }
	      ++alphabet;

	      System.out.println();
	    }
	}
}
