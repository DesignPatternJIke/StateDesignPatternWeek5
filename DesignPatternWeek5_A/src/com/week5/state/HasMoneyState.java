package com.week5.state;

import java.util.Random;

public class HasMoneyState implements TicketState {
	Random randomWinner = new Random(System.currentTimeMillis());
	ParkingLotMachine parkingLotMachine;
 
	public HasMoneyState(ParkingLotMachine parkingLotMachine) {
		this.parkingLotMachine = parkingLotMachine;
	}
  
	public void insertMoney() {
		System.out.println("You inserted dollar");
	}
 
	public void ejectMoney() {
		System.out.println("dollar returned");
		parkingLotMachine.setState(parkingLotMachine.getNoMoneyState());
	}
 
	public void pressButton() {
		System.out.println("You pressed the ticket button...");
		}

    public void dispenseParkingLot() {
        System.out.println("Parking lot ticket dispensed..");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for money..";
	}
}
