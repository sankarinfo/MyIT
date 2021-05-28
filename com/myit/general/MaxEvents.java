package com.myit.general;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxEvents {

	public static int num_maxEvents (int[] arr, int[]dur) {
        int drop = 0;
        int NumOfEvents = arr.length;
        int [][] intervals = new int[NumOfEvents][2];

        for (int i = 0; i < NumOfEvents; i++) {
            intervals[i] = new int[] {arr[i], arr[i] + dur[i]};
        }

        Arrays.sort(intervals, (a, b) ->(a[1] - b[1]));
        // the finish time of first event;
        int curTime = intervals[0][1];

        for (int i = 1; i < NumOfEvents; i++) {
            int [] toSchedual = intervals[i];
            if (toSchedual[0] < curTime)
                drop++;
            else {
                curTime = toSchedual[1];
            }
        }
        return NumOfEvents - drop;


    }

	public static void main(String[] args) {
        int[] arrival1 = {1,3,3,5,7};
        int[] duration1 = {2,2,1,2,1};
        System.out.println(num_maxEvents(arrival1, duration1));
        System.out.println(maxEvents(arrival1, duration1));

        int[] arrival2 = {1,3,3,5,7, 6, 9};
        int[] duration2 = {2,2,1,2,1, 10, 2};
        System.out.println(num_maxEvents(arrival2, duration2));
        System.out.println(maxEvents(arrival2, duration2));

        int[] arrival = {1,3,35,7};
        int[] duration = {2,2,1,2,1};
        System.out.println(num_maxEvents(arrival, duration));
        System.out.println(maxEvents(arrival, duration));

        int[] arrival3 = {1,3,35,7, 5};
        int[] duration3 = {2,2,1,2,1};
        System.out.println(num_maxEvents(arrival3, duration3));
        System.out.println(maxEvents(arrival3, duration3));

    }

	
	private static int maxEvents(int[] arrival, int[] duration) {
		int[][] events = new int[arrival.length][2];
		for(int i=0;i<arrival.length;i++) {
			events[i] = new int[] {arrival[i], arrival[i] + duration[i]};
		}
		Arrays.sort(events, (a, b)->(a[1] - b[1]));
		Queue<int[]> minHeap = new PriorityQueue<>((a, b)->a[1] - b[1]);
		int[] first = events[0];
		for(int i=1;i<events.length;i++) {
			int[] cur = events[i];
			if(cur[0] < first[1])
				minHeap.offer(cur);
			else {
				first[1] = events[i][1];
			}	
		}
		return arrival.length - minHeap.size();
	}
}