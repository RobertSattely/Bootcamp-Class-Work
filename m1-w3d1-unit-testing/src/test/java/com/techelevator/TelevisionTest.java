package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
	private Television myTv;
	
	@Before
	public void setup(){
		//Arrange
		myTv = new Television();
	}
	
	@Test
	public void television_initializes_correctly(){
		//act 
		//don't need
		//assert
		Assert.assertEquals(3, myTv.getSelectedChannel());
		Assert.assertEquals(2, myTv.getCurrentVolume());
		Assert.assertFalse("TV should be of", myTv.IsOn());
	}
	
	@Test
	public void can_turn_on_TV(){
		//act
		myTv.TurnOn();
		//assert
		Assert.assertTrue("TV should be on",myTv.IsOn());
	}
	@Test
	public void can_turn_Off_TV(){
		//arange
		myTv.TurnOn();
		//act
		myTv.TurnOff();
		
		//assert
		Assert.assertFalse("TV should be off",myTv.IsOn());
	}
	@Test
	public void tv_must_be_on_to_change_channel(){
		//act
		myTv.ChangeChannel(6);
		//assert
		Assert.assertEquals(3, myTv.getSelectedChannel());
	}
	@Test
	public void can_change_channel(){
		//arrange
		myTv.TurnOn();
		//act
		myTv.ChangeChannel(6);
		//assert
		Assert.assertEquals(6, myTv.getSelectedChannel());
	}
	@Test
	public void can_not_change_channel_lower_then_3(){
		myTv.TurnOn();
		//act
		myTv.ChangeChannel(2);
		//assert
		Assert.assertEquals(3, myTv.getSelectedChannel());
	}
	@Test
	public void can_not_change_channel_higher_then_18(){
		myTv.TurnOn();
		//act
		myTv.ChangeChannel(19);
		//assert
		Assert.assertEquals(3, myTv.getSelectedChannel());
	}
	@Test
	public void channel_18_is_a_valid_channel(){
		myTv.TurnOn();
		
		myTv.ChangeChannel(18);
		
		Assert.assertEquals(18, myTv.getSelectedChannel());
	}
	@Test
	public void channel_3_is_a_valid_channel(){
		//arrange
		myTv.TurnOn();
		myTv.ChangeChannel(6);
		//act
		myTv.ChangeChannel(3);
		//assert
		Assert.assertEquals(3, myTv.getSelectedChannel());
	}
	@Test //happy path
	public void can_lower_volume(){
		myTv.TurnOn();
		
		myTv.LowerVolume();
		
		Assert.assertEquals(1, myTv.getCurrentVolume());
		
	}
	@Test //sad test
	public void can_not_lower_volume_tv_off(){
		
		myTv.LowerVolume();
		
		Assert.assertEquals(2, myTv.getCurrentVolume());
	}
	@Test //sad test
	public void can_not_lower_volume_past_0(){
		//arrage
		myTv.TurnOn();
		myTv.LowerVolume();
		myTv.LowerVolume();
		//act
		myTv.LowerVolume();
		
		//assert
		Assert.assertEquals(0, myTv.getCurrentVolume());
	}
	@Test
	public void can_Lower_volume_to_0()	{
		myTv.TurnOn();
		myTv.LowerVolume();
		
		myTv.LowerVolume();
		
		Assert.assertEquals(0, myTv.getCurrentVolume());
	}
	@Test
	public void can_raise_Volume(){
		myTv.TurnOn();
		
		myTv.RaiseVolume();
		
		Assert.assertEquals(3, myTv.getCurrentVolume());
	}
	@Test
	public void can_not_raise_volume_with_tv_off(){
		
		myTv.RaiseVolume();
		
		Assert.assertEquals(2, myTv.getCurrentVolume());
	}
	@Test
	public void can_raise_volume_to_10(){
		myTv.TurnOn();
		
		for(int i = 0;i<7;i++){
		myTv.RaiseVolume();
		}
		myTv.RaiseVolume();
		
		Assert.assertEquals(10, myTv.getCurrentVolume());
		
	}
	@Test
	public void cant_raise_volume_past_10(){
		myTv.TurnOn();
		
		for(int i = 0;i<8;i++){
		myTv.RaiseVolume();
		}
		myTv.RaiseVolume();
		
		Assert.assertEquals(10, myTv.getCurrentVolume());
		
	}
}
