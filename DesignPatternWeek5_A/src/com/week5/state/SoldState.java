package com.week5.state;

public class SoldState implements TicketState {
    ParkingLotMachine parkingLotMachine;
 
    public SoldState(ParkingLotMachine parkingLotMachine) {
        this.parkingLotMachine = parkingLotMachine;
    }
       
	public void insertMoney() {
		System.out.println("Please wait, we're already giving you a parking lot ticket");
	}
 
	public void ejectMoney() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void pressButton() {
		System.out.println("Turning twice doesn't get you another parking lot ticket!");
	}
 
	public void dispenseParkingLot() {
		parkingLotMachine.releaseBall();
		if (parkingLotMachine.getCount() > 0) {
			parkingLotMachine.setState(parkingLotMachine.getNoMoneyState());
		} else {
			System.out.println("Oops, out of parking lot tickets!");
			parkingLotMachine.setState(parkingLotMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "dispensing a parking lot ticket";
	}
}
