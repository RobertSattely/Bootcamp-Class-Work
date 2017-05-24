package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	private Airplane myPlane;
	
	@Before
	public void setup(){
		myPlane = new Airplane(10, 100, "123456");
	}
	@Test
	public void airplane_inialized(){
		Assert.assertEquals(0, myPlane.getBookedFirstClassSeats());
		Assert.assertEquals(0, myPlane.getBookedCoachSeats());
		
		Assert.assertNotNull("Plane number should not be null", myPlane.getPlaneNumber());
		Assert.assertEquals(6, myPlane.getPlaneNumber().length());

		Assert.assertEquals(10, myPlane.getTotalFirstClassSeats());
		Assert.assertEquals(100, myPlane.getTotalCoachSeats());
		
		Assert.assertEquals(10, myPlane.getAvailableFirstClassSeats());
		Assert.assertEquals(100, myPlane.getAvailableCoachSeats());
	}

	@Test
	public void can_reserve_a_first_class_seat(){
		boolean reserve = myPlane.Reserve(true, 1);
		
		Assert.assertTrue("Should be able to reserve a first class seat", reserve);
		
		Assert.assertEquals(1, myPlane.getBookedFirstClassSeats());
		Assert.assertEquals(9, myPlane.getAvailableFirstClassSeats());
		
		
	}
	@Test
	public void can_reserve_a_coach_seat(){
		boolean reserve = myPlane.Reserve(false, 23);
		
		Assert.assertTrue("Should be able to reserve a coach seat", reserve);
		
		Assert.assertEquals(23, myPlane.getBookedCoachSeats());
		Assert.assertEquals(77, myPlane.getAvailableCoachSeats());
	}
	
	@Test
	public void can_not_reserve_a_First_Class_seat(){
		boolean reserve = myPlane.Reserve(true, 11);
		
		Assert.assertFalse("Plane is full, shouldnt be able to reserve",reserve);
		Assert.assertEquals(10, myPlane.getAvailableFirstClassSeats());
	}
	@Test
	public void can_not_reserve_a_coach_seat(){
		boolean reserve = myPlane.Reserve(false, 101);
		
		Assert.assertFalse("Plane is full, shouldnt be able to reserve",reserve);
		Assert.assertEquals(100, myPlane.getAvailableCoachSeats());
	}
}
