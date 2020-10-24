package com.training.invoicegeneration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CabInvoice {

	public static void main(String[] args) {

		System.out.println("Welcome to Cab invoice generation");
		HashMap<Integer, ArrayList<CabData>> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		ArrayList<CabData> details;
		while (true) {
			details = new ArrayList<>();
			System.out.println("Enter user id");
			int userid = sc.nextInt();
			while(true) {
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
			if(!hm.containsKey(userid)) {
				hm.put(userid, details);
			}
			else
				hm.put(userid, details);
			System.out.println("Want to add for new user Y/N");
			char ch = sc.next().charAt(0);
			if (ch == 'n' || ch == 'N')
				break;
		}	
		while(true) {
			System.out.println(hm.keySet());
			System.out.println("Enter the user id for which the total fare needs to be displayed");
			int userid_inp = sc.nextInt();
			if(hm.containsKey(userid_inp))
				CabServiceMethods.invoiceGeneratorRides(hm.get(userid_inp));
			else 
				System.out.println("Invalid user or user don't exist");
			System.out.println("Want to display detail for more user Y/N");
			char choice = sc.next().charAt(0);
			if(choice == 'n' || choice == 'N')
				break;
		}
		sc.close();

	}

}
