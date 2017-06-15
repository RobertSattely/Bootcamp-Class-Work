package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SmartPhoneTest {
	private SmartPhone myCell;
	
	@Before
	public void setup(){
	myCell = new SmartPhone("007911food","T-BooBoo");
	}
	@Test
	public void initialize_phone_number(){
		Assert.assertEquals("007911food",myCell.getPhoneNumber());
	}
	@Test
	public void initialize_smartphone_carrier(){
		Assert.assertEquals("T-BooBoo",myCell.getCarrier());
	}
	@Test
	public void test_operating_system(){
		myCell.setOperatingSystem("Best Software");
		Assert.assertEquals("Best Software",myCell.getOperatingSystem());
	}
	@Test
	public void battery_charge(){
		Assert.assertEquals(100, myCell.getBatteryCharge());
	}
	@Test
	public void is_on_call_test(){
		myCell.AnswerPhone();
		Assert.assertTrue(myCell.isOnCall());
	}
	@Test
	public void test_hang_up(){
		myCell.HangUp();
		Assert.assertFalse(myCell.isOnCall());
	}
	@Test
	public void test_the_call(){
		Assert.assertTrue(myCell.Call("1233214444", 2));
	}
	@Test
	public void lets_we_recharge_battery(){
		myCell.Call("606521222", 2);
		myCell.RechargeBattery();
	}



}


