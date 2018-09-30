package com.week5.state;

public class ParkingLotMachine {
 
	TicketState soldOutState;
	TicketState noMOneyState;
	TicketState hasMoneyState;
	TicketState soldState;

 
	TicketState ticketState = soldOutState;
	int count = 0;
 
	public ParkingLotMachine(int numberParkingLots) {
		soldOutState = new SoldOutState(this);
		noMOneyState = new NoMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		soldState = new SoldState(this);


		this.count = numberParkingLots;
 		if (numberParkingLots > 0) {
			ticketState = noMOneyState;
		} 
	}
 
	public void insertMoney() {
		ticketState.insertMoney();
	}
 
	public void ejectMoney() {
		ticketState.ejectMoney();
	}
 
	public void pressButton() {
		ticketState.pressButton();
		ticketState.dispenseParkingLot();
	}

	void setState(TicketState ticketState) {
		this.ticketState = ticketState;
	}
 
	void releaseBall() {
		System.out.println("Your parking lot ticket is rolling out...");
		
	}
 
	public int getCount() {
		if (count != 0) {
			count = count - 1;
		} 
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("Someone just exited from the car park, free lot(s) : " + this.count);
		ticketState.refill();
	}

    public TicketState getState() {
        return ticketState;
    }

    public TicketState getSoldOutState() {
        return soldOutState;
    }

    public TicketState getNoMoneyState() {
        return noMOneyState;
    }

    public TicketState getHasMoneyState() {
        return hasMoneyState;
    }

    public TicketState getSoldState() {
        return soldState;
    }

 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("New York Parking, Inc.");
		result.append("\nPark and Ride by Bus or Train");
		result.append("\nNumber of unoccupied parking space: " + count + " lot");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + ticketState + "...\n");
		return result.toString();
	}
}
