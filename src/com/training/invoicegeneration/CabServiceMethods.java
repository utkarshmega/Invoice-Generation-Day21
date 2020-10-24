package com.training.invoicegeneration;

import java.util.ArrayList;

public class CabServiceMethods {

	private static int Costperkm_normal = 10;
	private static int costpermin_normal = 1;
	private static int minimumfare_normal = 5;

	private static int Costperkm_premium = 15;
	private static int costpermin_premium = 2;
	private static int minimumfare_premium = 20;

	/*
	 * to find the fare for the given type of ride and given time and distance
	 */
	public static int invoiceGenerator(int rideType, int distance, int time) {
		int total_fare = 0;
		if (rideType == 1) {
			total_fare = (Costperkm_normal * distance) + (time * costpermin_normal);
			total_fare = total_fare > minimumfare_normal ? total_fare : minimumfare_normal;
		} else {
			total_fare = (Costperkm_premium * distance) + (time * costpermin_premium);
			total_fare = total_fare > minimumfare_premium ? total_fare : minimumfare_premium;
		}

		return total_fare;

	}

	/**
	 * to find the total fare of all the rides
	 */
	public static void invoiceGeneratorRides(ArrayList<CabData> details) {

		int fare = 0;
		for (CabData entry : details) {
			fare += invoiceGenerator(entry.rideType, entry.distance, entry.time);
		}
		double avgFare = fare / (details.size() * 1.0);
		System.out.println("****Enhanced Invoice****");
		System.out.println("Total Number of Rides : " + details.size());
		System.out.println("Total Aggregate fare : Rs." + fare);
		System.out.println("Average fare : Rs." + avgFare);
	}

}
