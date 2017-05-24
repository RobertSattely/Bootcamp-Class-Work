package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	private FruitTree myTree;
	@Before
	public void setup(){
		//arrange
		 myTree = new FruitTree("Apples", 10);
		
	}
	@Test 
	public void tree_correctly_returns_type_of_Fruit(){
		//arrange
		FruitTree myTree = new FruitTree("Apples", 10);
		//act (one step)
		String typeOfFruit = myTree.getTypeOfFruit();
		//assert
		Assert.assertEquals("Apples", typeOfFruit);
	}
	@Test
	public void tree_returns_correct_number_of_fruits_after_initalization(){
		//arrange
		FruitTree myTree = new FruitTree("Apple", 10);
		//act
		int fruitCount = myTree.getPiecesOfFruitLeft();
		//assert
		Assert.assertEquals(10, fruitCount);
	}
	@Test
	public void can_pick_fruit(){
		//arrage is set in @Befor
		//act
		boolean success = myTree.pickFruit(5);
		//assert
		Assert.assertTrue("i should be able to pick 5 apples", success);
		Assert.assertEquals(5, myTree.getPiecesOfFruitLeft());
	}
	@Test
	public void can_not_pick_more_fruit_then_the_tree_has(){
		//act
		boolean success = myTree.pickFruit(15);
		//assert
		Assert.assertFalse("I shouldn't be able to pick more fruit",success);
		Assert.assertEquals(10,  myTree.getPiecesOfFruitLeft());
	}
}
