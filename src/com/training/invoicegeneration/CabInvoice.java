package com.training.invoicegeneration;

import java.util.Scanner;

public class CabInvoice {

	public static void main(String[] args) {

		System.out.println("Welcome to Cab invoice generation");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total distance in KM");
		int distance = sc.nextInt();
		System.out.println("Enter the time taken in minutes");
		int time = sc.nextInt();
		CabServiceMethods.invoiceGenerator(distance, time);

		sc.close();

	}

}
