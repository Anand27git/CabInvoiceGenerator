package com.bridgelab.cabInvoiceGenrator;

import com.bridgelab.cabInvoiceGenrator.model.InvoiceSummary;
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
    public void givenMultipleRides_ShouldReturnInvoiceSummary(){
        InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
        Ride[] rides = { new Ride(2.0, 5),
                new Ride(0.1, 1)};
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary= new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }
}
