package com.myit.general;

public class ReverseString {

	public static void main(String[] args) {
		String reverse = "testing";
		
		//Using inbuild method
		StringBuilder sb = new StringBuilder(reverse);
		System.out.println(sb.reverse().toString());
		
		//Using recursive
		new ReverseString().reverseString();
		
	}
	
	
	public void reverseString() {
	    String alphabet = "testing";
	    String reverseAlphabet = reverse(alphabet, alphabet.length()-1);
	    System.out.println("reversed string "+reverseAlphabet);
	}

	String reverse(String stringToReverse, int index){
	    if(index == 0){
	        return stringToReverse.charAt(0) + "";
	    }

	    char letter = stringToReverse.charAt(index);
	    return letter + reverse(stringToReverse, index-1);
	}

}
