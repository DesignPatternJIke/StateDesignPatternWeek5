package com.week5.state;

public class SoldOutState implements TicketState {
    ParkingLotMachine parkingLotMachine;
 
    public SoldOutState(ParkingLotMachine parkingLotMachine) {
        this.parkingLotMachine = parkingLotMachine;
    }
 
	public void insertMoney() {
		System.out.println("You can't insert money, the machine is sold out");
	}
 
	public void ejectMoney() {
		System.out.println("You can't eject, you haven't inserted a money yet");
	}
 
	public void pressButton() {
		System.out.println("You pressed the button, but there are no parking lot ticket");
	}
 
	public void dispenseParkingLot() {
		System.out.println("No parking lot ticket dispensed");
	}
	
	public void refill() { 
		parkingLotMachine.setState(parkingLotMachine.getNoMoneyState());
	}
 
	public String toString() {
		return "Car park is full";
	}
}
