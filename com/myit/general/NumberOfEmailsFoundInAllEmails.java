package com.myit.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberOfEmailsFoundInAllEmails {

	public static void main(String[] args) {
		System.out.println(NumberOfEmailsFoundInAllEmails.IsTheWordPalindrome("level"));
		//System.out.println(NumberOfEmailsFoundInAllEmails.findNumberOfEmailsExistsInAllEmails());
		
		//System.out.println("isNoteConstructUsingMagazine "+NumberOfEmailsFoundInAllEmails.isNoteConstructUsingMagazine());
		
		int[] numbers = {1,2,5,11,15, 17};

        int arraySize = numbers.length;
        int x = 11;
        int result = NumberOfEmailsFoundInAllEmails.binarySearch(numbers, 0, arraySize-1, x);
        
       //System.out.println(result);

//		IntStream.of(1, 2, 3, 4, 8, 9, 6)
	//    .forEach(System.out::println);
        System.out.println("testing---------->"+1%2);	
        System.out.println("testing---------->"+2%2);	
        System.out.println("testing---------->"+3%2);	
        System.out.println("testing---------->"+4%2);	
        System.out.println("testing---------->"+8%2);	
        System.out.println("testing---------->"+9%2);	
        System.out.println("testing---------->"+6%2);	
		
        IntStream.of(1, 2, 3, 4, 8, 9, 6)
        .map(i -> i % 2 != 0 ? i + 7 : i)
        .forEach(System.out::println);
        
        final int[] nos = {1, 2, 3, 4, 8, 9, 6};
        IntStream.of(nos)
            .filter(i -> {
              if (i % 2 == 0) {
                System.out.println("Dropped " + i);
                return false;
              }
              return true;
            })
            .map(i -> i + 7)
            .forEach(a -> System.out.println(a));

        List<String> l = new ArrayList(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        String s = sl.collect(Collectors.joining(" "));
        l.add("three");
        System.out.println("Concatenated = "+s);

        List<Character> list = Arrays.asList('D', 'e', 'm', 'o');
        String str = list.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println("Concatenated = "+str);

        Stream<String> stream = Stream.of("25", "40", "90", "150", "180", "220", "350");
        List<String> list1 = stream.collect(Collectors.toList());
        System.out.println("List = "+list1);


	}
	
	public static long findNumberOfEmailsExistsInAllEmails() {
		
        Collection<String> friendList = new ArrayList<String>(Arrays.asList("friend@catena-technologies.com", "bff@uni.edu.sg", "provost@uni.edu.sg", "john@doe.com"));
        Collection<String> allEmails  = new ArrayList<String>(Arrays.asList("enemy@uni.edu.sg", "bff@uni.edu.sg", "evil@spam.com", "bff@uni.edu.sg", "friend@catena-technologies.com"));

        return friendList.stream().flatMap(eid -> allEmails.stream().filter(aid -> aid.equals(eid))).count();
	}
	
	public static boolean IsTheWordPalindrome(String word) {
		
		final String convertToLowerCase = word.toLowerCase();
		
		boolean isPalindrome = IntStream.range(0, convertToLowerCase.length() / 2)
        .noneMatch(
        		i -> convertToLowerCase.charAt(i) != convertToLowerCase.charAt(convertToLowerCase.length() - i - 1));	
	
		return isPalindrome;
	}
	
	
	public static int binarySearch(int[] array, int start, int end, int search){
		
		int midNo = (start + end)/2;
		
		if(end < start){
			 return -1;
		} 
		
		if (search < array[midNo]){
			return binarySearch(array, start, midNo - 1, search);
		}
		
		if (search > array[midNo]){
			return binarySearch(array, midNo + 1, end, search);
		}
		
		if (search == array[midNo]){
			return midNo;
		}
		
		return -1;
	}
	
	
	public static boolean isNoteConstructUsingMagazine() {
		String note = "ceba";
		String magazine = "abcde";
		
	    int noteLength = note.length();
	    int megazineLength = magazine.length();
	    
	    if(noteLength>megazineLength) return false;
		
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
