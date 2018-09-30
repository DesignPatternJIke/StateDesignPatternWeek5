package com.week5.state;

public class NoMoneyState implements TicketState {
    ParkingLotMachine parkingLotMachine;
 
    public NoMoneyState(ParkingLotMachine parkingLotMachine) {
        this.parkingLotMachine = parkingLotMachine;
    }
 
	public void insertMoney() {
		System.out.println("You inserted dollar");
		parkingLotMachine.setState(parkingLotMachine.getHasMoneyState());
	}
 
	public void ejectMoney() {
		System.out.println("You haven't inserted any money");
	}
 
	public void pressButton() {
		System.out.println("You pressed the button, but there's no money");
	 }
 
	public void dispenseParkingLot() {
		System.out.println("You need to pay first");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for money";
	}
}
