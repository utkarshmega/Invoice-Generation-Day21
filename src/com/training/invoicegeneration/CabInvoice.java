package com.training.invoicegeneration;

import java.util.ArrayList;
import java.util.Scanner;

public class CabInvoice {

	public static void main(String[] args) {

		System.out.println("Welcome to Cab invoice generation");

		Scanner sc = new Scanner(System.in);
		ArrayList<CabData> details = new ArrayList<>();
		while (true) {
			System.out.println("Enter the total distance in KM");
			int distance = sc.nextInt();
			System.out.println("Enter the time taken in minutes");
			int time = sc.nextInt();
			details.add(new CabData(distance, time));
			System.out.println("Want to add more rides Y/N");
			char ch = sc.next().charAt(0);
			if (ch == 'n' || ch == 'N')
				break;

		}
		CabServiceMethods.invoiceGeneratorRides(details);
		sc.close();

	}

}
