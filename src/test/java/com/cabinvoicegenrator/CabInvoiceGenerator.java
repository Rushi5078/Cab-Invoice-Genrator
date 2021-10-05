package com.cabinvoicegenrator;

public class CabInvoiceGenerator {
	public static final double MINIMUM_COST_PER_KILOMETER = 10.0;
	public static final int COST_PER_TIME = 1;
	public static final int MINIMUM_FARE = 5;
	
	public double  calculateFare(double distance , int time)
	{
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		if(totalFare < MINIMUM_FARE)
		  {
			return MINIMUM_FARE;
		  }
		else
	      {
			return totalFare;
		  }
	 }

}



