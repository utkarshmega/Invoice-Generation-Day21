package com.training.invoicegeneration;

public class CabServiceMethods {
	
	public static void invoiceGenerator(int distance, int time)
	{
		int total_fare;
		total_fare = (10 * distance) + (time * 1);
		if(total_fare < 5)
			total_fare = 5;
		System.out.println("*******Invoice******* ");
		System.out.println("Total Distance : "+distance);
		System.out.println("Total Time Taken : " +time);
		System.out.println("Total amount payable : Rs." +total_fare);
		
	}

}
