package com.week5.state;

public interface TicketState {
	
 // Car parking lot ticket vending machine
	
	public void insertMoney();
	public void ejectMoney();
	public void pressButton();
	public void dispenseParkingLot();
	
	public void refill();
}
