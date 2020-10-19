package com.training.invoicegeneration;

import java.util.ArrayList;

public class CabServiceMethods {
	
	private static int Costperkm = 10;
	private static int costpermin = 1;
	private static int minimumfare = 5;
	

	/*
	 * to find the fare for the given time and distance
	 */
	public static int invoiceGenerator(int distance, int time) {
		int total_fare;
		total_fare = (Costperkm * distance) + (time * costpermin);
		if (total_fare < minimumfare)
			total_fare = minimumfare;
		return total_fare;

	}

	/**
	 * to find the total fare of all the rides
	 */
	public static void invoiceGeneratorRides(ArrayList<CabData> details) {

		int fare = 0;
		for (CabData entry : details) {
			fare += invoiceGenerator(entry.distance, entry.time);
		}
		double avgFare = fare/(details.size() * 1.0);
		System.out.println("****Enhanced Invoice****");
		System.out.println("Total Number of Rides : " +details.size());
		System.out.println("Total Aggregate fare : Rs." + fare);
		System.out.println("Average fare : Rs." + avgFare);
	}

}
