package com.bridgelab.cabInvoiceGenrator;

import com.bridgelab.cabInvoiceGenrator.model.Ride;
import org.junit.Assert;
import org.junit.Test;

public class Invoicetestcase {
	
	
	@Test
	public void giveDistanceAndTime_shouldReturnTotalFare() {
	InvoiceGenerator invoiceGenarator = new InvoiceGenerator();
	double distance = 2.0;
	int time = 5;
	double fare  = invoiceGenarator.calculateFare(distance, time);
	Assert.assertEquals( 25,fare, 0);
	
	}
	
	@Test
	public void givenLessDistanceOrTime_ShowReturnMinFare() {
		InvoiceGenerator invoiceGenarator = new InvoiceGenerator();
		double distance =0.1;		
		int time = 1;
		double fare  = invoiceGenarator.calculateFare(distance, time);
		Assert.assertEquals( 5,fare, 0);
		
	}
	
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenarator = new InvoiceGenerator();
		Ride[] rides = { new Ride(distance 2.0, time 5),
					     new Ride(distance 0.1, time)
		};
		double fare =invoiceGenarator.calculateFare(rides);
		Assert.assertEquals(30,fare,0);
		
		}
}
