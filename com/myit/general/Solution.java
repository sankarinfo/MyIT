package com.myit.general;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'maxEvents' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arrival
     *  2. INTEGER_ARRAY duration
     */

    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
    // Write your code here
    	if(arrival.size()!=duration.size()) {
    		return 0;
    	}
    	int companies = arrival.size();

		if (companies < 2) {
			return companies;
		}

		int max = 0;
		int nextAvailableTime = arrival.get(0);

		Map<Integer, PriorityQueue<Integer>> arrivalDurationMap = getArrivalDurationMap(arrival, duration);

		for (int c = 0; c < companies; c++) {
			Integer arrivalTime = arrival.get(c);
			Integer eventDuration = arrivalDurationMap.get(arrivalTime).poll();

			if (arrivalTime >= nextAvailableTime) {
				max++;
				nextAvailableTime = arrivalTime + eventDuration;
			} else if (thereIsTimeToAddThisEvent(arrival, nextAvailableTime, c, eventDuration)) {
				max++;
				nextAvailableTime += eventDuration;
			}
		}

		return max;    
	}
    
	private static boolean thereIsTimeToAddThisEvent(List<Integer> arrival, int nextAvailableTime, int c,
			Integer eventDuration) {

		List<Integer> distinctArrivals = new ArrayList<Integer>(new HashSet<Integer>(arrival));
		int index = distinctArrivals.indexOf(arrival.get(c));

		if (index + 1 < distinctArrivals.size()) {
			return nextAvailableTime + eventDuration <= distinctArrivals.get(index + 1);
		}

		return index == distinctArrivals.size() - 1;
	}

    private static Map<Integer, PriorityQueue<Integer>> getArrivalDurationMap(List<Integer> arrival,
			List<Integer> duration) {

		Map<Integer, PriorityQueue<Integer>> durationByArrival = new HashMap<>();

		for (int i = 0; i < arrival.size(); i++) {
			Integer arrivalTime = arrival.get(i);
			Integer durationValue = duration.get(i);

			if (!durationByArrival.containsKey(arrivalTime)) {
				durationByArrival.put(arrivalTime, new PriorityQueue<Integer>(Arrays.asList(durationValue)));
			} else {
				durationByArrival.get(arrivalTime).add(durationValue);
			}
		}

		return durationByArrival;
	}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Integer[] arrivalTime = { 1, 2, 2, 3 };
        
        List<Integer> arrival = Stream.of(arrivalTime)
        	      .collect(Collectors.toList());
       
        Integer[] d = { 1, 2, 2, 2 };
        
        List<Integer> duration = Stream.of(d)
        	      .collect(Collectors.toList());

        int result = Result.maxEvents(arrival, duration);

        System.out.println("Testing=======>"+result);
    }
}
