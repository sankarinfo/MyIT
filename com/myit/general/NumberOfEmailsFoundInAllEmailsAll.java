package com.myit.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NumberOfEmailsFoundInAllEmailsAll {

	public static void main(String[] args) {
		System.out.println(NumberOfEmailsFoundInAllEmailsAll.findNumberOfEmailsExistsInAllEmails());
	}
	
	public static int findNumberOfEmailsExistsInAllEmails() {
		
        Collection<String> friendList = new ArrayList<String>(Arrays.asList("friend@catena-technologies.com", "bff@uni.edu.sg", "provost@uni.edu.sg", "john@doe.com"));
        Collection<String> allEmails  = new ArrayList<String>(Arrays.asList("enemy@uni.edu.sg", "bff@uni.edu.sg", "evil@spam.com", "bff@uni.edu.sg", "friend@catena-technologies.com"));

        int occurrences = 0;
        for(String email : friendList ) {
        	occurrences += Collections.frequency(allEmails , email);
        }	

        long total = friendList.stream().flatMap(eid -> allEmails.stream().filter(aid -> aid.equals(eid))).count();
        System.out.println("testing---"+total);
        
        return occurrences;
	}
}
