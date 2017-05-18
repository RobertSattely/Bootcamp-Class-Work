package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;	
	private double totalAmountOwed;
	
	
	public int getTotalNumberOfItems(){
		return totalNumberOfItems;
	}
	public void setTotalNumberOfItems(int totalNumberOfItems){
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public double getTotalAmountOwed(){
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(double totalAmountOwed){
		this.totalAmountOwed = totalAmountOwed;
	}
	
	public double getAveragePricePerItem(){
		if (totalNumberOfItems>0){
			return totalAmountOwed / totalNumberOfItems;
		}else {
			return 0.0;
		}
	}
	public void addItems(int numberOfItems, double pricePerItem){
		totalAmountOwed += pricePerItem * numberOfItems;
		totalNumberOfItems += numberOfItems; 
	}
	public void empty(){
		totalNumberOfItems = 0;
		totalAmountOwed = 0.0;
	}

	
}
