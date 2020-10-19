package com.training.invoicegeneration;

import java.util.ArrayList;

public class CabServiceMethods {

	/*
	 * to find the fare for the given time and distance
	 */
	public static int invoiceGenerator(int distance, int time) {
		int total_fare;
		total_fare = (10 * distance) + (time * 1);
		if (total_fare < 5)
			total_fare = 5;
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
		System.out.println("****Invoice****");
		System.out.println("Total Aggregate fare : Rs." + fare);

	}

}
