package com.myit.general;

public class FindFackNotes {

	public static void main(String[] args) {
		
		System.out.println("IsFackNote "+FindFackNotes.isNoteConstructUsingMagazine());
		        
	}
		
	public static boolean isNoteConstructUsingMagazine() {
		String note = "ceba";
		String magazine = "abcde";
		
	    if(note.length()>magazine.length()) return false;
		
		char[] notesChars = note.toCharArray();
		
		for ( char nc : notesChars ) {
			if( magazine.contains(Character.toString(nc)))
				magazine = magazine.replaceFirst(Character.toString(nc), "");
			else
				return false;
		}
				
		return true;
	}
	
}
