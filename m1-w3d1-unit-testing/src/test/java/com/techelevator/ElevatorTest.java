package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ElevatorTest {
	private Elevator myElevator;
	@Before
	public void setup(){
		myElevator = new Elevator(1,17,1);
	}
	@Test
	public void elevator_initalizing(){
		Assert.assertEquals(1, myElevator.getShaftNumber());
		Assert.assertEquals(1, myElevator.getCurrentLevel());
		Assert.assertEquals(17,myElevator.getNumberOfLevels());

	}
	@Test
	public void is_the_door_Open(){
		Assert.assertTrue(myElevator.isDoorOpen());
	}
	@Test
	public void is_the_door_Closed(){
		Assert.assertFalse(myElevator.isDoorClose());
	}
	@Test
	public void Is_the_elevator_moving(){
		Assert.assertTrue(myElevator.isMoving());
		
	}
	@Test
	public void test_open_door_while_moving(){
		myElevator.CloseDoor();
		myElevator.isMoving();
		myElevator.OpenDoor();
		Assert.assertFalse(myElevator.OpenDoor());
	}
	@Test
	public void test_open_door_not_moving(){
		myElevator.isNotMoving();
		Assert.assertTrue(myElevator.isNotMoving());
	}
	
	@Test
	public void test_close_door(){
		myElevator.isNotMoving();
		myElevator.isDoorOpen();
		Assert.assertTrue(myElevator.isNotMoving());
	}
	@Test
	public void test_going_up(){
		myElevator.CloseDoor();
		myElevator.GoUp(4);
		Assert.assertEquals(4, myElevator.getCurrentLevel());
	}
	@Test
	public void test_going_up_sad_path(){
		myElevator.OpenDoor();
		myElevator.GoUp(4);
		Assert.assertEquals(1,myElevator.getCurrentLevel());
	}
	@Test
	public void test_going_down(){
		myElevator.CloseDoor();
		myElevator.GoUp(10);
		myElevator.GoDown(1);
		Assert.assertEquals(1, myElevator.getCurrentLevel());
	}
	@Test
	public void test_going_down_sad_path(){
		myElevator.OpenDoor();
		myElevator.GoDown(2);
		Assert.assertEquals(1, myElevator.getCurrentLevel());
	}
	@Test
	public void test_going_down_sad_path_2(){
		myElevator.CloseDoor();
		myElevator.GoDown(2);
		Assert.assertEquals(1, myElevator.getCurrentLevel());
	}
		
	
	
}
