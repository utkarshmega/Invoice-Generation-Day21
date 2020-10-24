package com.training.cabenum;

public enum CabRideCostsEnum {
	
	Normal(10, 1, 5), Premium(15, 2, 20);
	
	public int costPerKm;
	public int costPerMin;
	public int minimumFare;
	
	CabRideCostsEnum(int costPerKm, int costPerMin, int minimumFare) {
		this.costPerKm = costPerKm;
		this.costPerMin = costPerMin;
		this.minimumFare = minimumFare;
	}

}
