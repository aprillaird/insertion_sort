// April Laird - Chapter 23

import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort {
	public static void main(String[] args) {
		int[] list = new int[100];
		for (int i = 0; i < list.length; i++) {
		    list[i]=ThreadLocalRandom.current().nextInt(1,1000000);
		}
		
		System.out.println("The sorted list of random numbers is: ");	
		
		// Get the start time
		long start = System.currentTimeMillis();
		
		// Call the insertion sort method, print the list
		insertionSort(list);
		
		// Get the end time
		long end = System.currentTimeMillis();
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
				
		// Amount of time
		System.out.println("The insertion sort took " + (end - start) + " milliseconds.");
	}
	
	/* Method performs insertion sort by repeatedly inserting
	 * a new element into a sorted sublist until the whole
	 * list is sorted.
	 */ 
	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int currentElement = list[i];
			int k;
			for (k = i -1; k >= 0 && list[k] > currentElement; k--) {
				list[k + 1] = list[k];
			}
			list[k + 1] = currentElement;
		}
	}

}
