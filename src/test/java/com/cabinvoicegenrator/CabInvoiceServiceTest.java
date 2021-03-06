package com.cabinvoicegenrator;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest 
{
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare()
	{
		CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance , time);
		Assert.assertEquals(25 , fare ,0.0);
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnMinimumFare()
	{
		CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance , time);
		Assert.assertEquals(5 , fare ,0.0);
	}
	@Test
	public void givenDistanceandTime_ShouldReturnTotalfareForMultipleRide()
	{
	  CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
	  Ride [] rides = {new Ride ( 2.0 ,  5),
			           new Ride ( 0.1 , 1)};
	  double totalfare = invoiceGenerator.calculateTotalFare(rides);
	  Assert.assertEquals(30 , totalfare, 0.0);
	 }
	 	
}
	

 
  