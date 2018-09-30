package com.week5.state.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.week5.state.ParkingLotMachine;


/**
 * @author Justice Ike 
 * @Course:	Object Oriented Design Pattern Course; Week 5: State Design Pattern
 * 
 * Activity: Used New York car park ticketing as theme for State Design Pattern project.
 *       
 * References: 
 *         
 *        JAVA:
 *		  HeadFirst Design Patterns, Orielly 			
 *		
 *		  How to run the program:
 *
 *		  JUnitTest: ParkingLotMachineTest.java
 *        
 */

public class ParkingLotMachineTest {

	@Test
	public void test() {
		ParkingLotMachine parkingLotMachine = new ParkingLotMachine(10);

		/////////////////////////////////10th ticket/////////////////////////////////////////////////////////
		System.out.println("\n///////// 10th ticket/////////////////////////");
		System.out.println(parkingLotMachine);
		// 10th ticket Junit validation
		parkingLotMachine.insertMoney();
		parkingLotMachine.pressButton();
		assertEquals(9, parkingLotMachine.getCount());

		/////////////////////////////////////9th ticket/////////////////////////////////////////////////////
		System.out.println("\n///////// 9th ticket/////////////////////////");
		System.out.println(parkingLotMachine);
		// 9th ticket Junit validation
		parkingLotMachine.insertMoney();
		parkingLotMachine.pressButton();
		assertEquals(8, parkingLotMachine.getCount());


		/////////////////////////////////////8th ticket///////////////////////////////////////////////////////////////
		System.out.println("\n///////// 8th ticket/////////////////////////");
		System.out.println(parkingLotMachine);
		// 8th ticket Junit validation
		parkingLotMachine.insertMoney();
		parkingLotMachine.pressButton();
		assertEquals(7, parkingLotMachine.getCount());
		
		//////////////////////////////////////////7th ticket/////////////////////////////////////////////////////////////
		System.out.println("\n///////// 7th ticket/////////////////////////");
		System.out.println(parkingLotMachine);
		// 7th ticket Junit validation
		parkingLotMachine.insertMoney();
		parkingLotMachine.pressButton();
		assertEquals(6, parkingLotMachine.getCount());

		///////////////////////////////////////////6th ticket////////////////////////////////////////////////////////////
		System.out.println("\n///////// 6th ticket/////////////////////////");
		System.out.println(parkingLotMachine);
		// 6th ticket Junit validation
		parkingLotMachine.insertMoney();
		parkingLotMachine.pressButton();
	
	}

}
