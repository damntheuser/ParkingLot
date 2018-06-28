


import static org.junit.Assert.*;

import org.junit.Test;

import parkinglot.ParkingLot.Lot;

public class testParkingLot {

	@Test
	public void testParkAndLeave() {
		Lot parkingLot = new Lot(6);
		parkingLot.park("KA-01-HH-1234", "White");
		parkingLot.park("KA-01-HH-9999", "White");
		parkingLot.park("KA-01-BB-0001", "Black");
		parkingLot.park("KA-01-HH-7777", "Red");
		parkingLot.park("KA-01-HH-2701", "Blue");
		parkingLot.park("KA-01-HH-3141", "Black");
		parkingLot.status();
		parkingLot.leave(4);
		parkingLot.status();
		parkingLot.park("KA-01-P-333", "White");
		parkingLot.status();
		parkingLot.park("DL-12-AA-9999", "White");
	}

	@Test
	public void testGetRegNumbersForColour() {
		Lot parkingLot = new Lot(6);
		parkingLot.park("KA-01-HH-1234", "White");
		parkingLot.park("KA-01-HH-9999", "White");
		parkingLot.park("KA-01-BB-0001", "Black");
		parkingLot.park("KA-01-HH-7777", "Red");
		parkingLot.park("KA-01-HH-2701", "Blue");
		parkingLot.park("KA-01-HH-3141", "Black");
		parkingLot.leave(4);
		parkingLot.park("KA-01-P-333", "White");
		parkingLot.park("DL-12-AA-9999", "White");
		//parkingLot.status();
		parkingLot.regNumbersForColour("White");
	}
	
	@Test
	public void testGetSlotNumbersForColour() {
		Lot parkingLot = new Lot(6);
		parkingLot.park("KA-01-HH-1234", "White");
		parkingLot.park("KA-01-HH-9999", "White");
		parkingLot.park("KA-01-BB-0001", "Black");
		parkingLot.park("KA-01-HH-7777", "Red");
		parkingLot.park("KA-01-HH-2701", "Blue");
		parkingLot.park("KA-01-HH-3141", "Black");
		parkingLot.leave(4);
		parkingLot.park("KA-01-P-333", "White");
		parkingLot.park("DL-12-AA-9999", "White");
		parkingLot.slotNumbersForColour("White");
	}
	
	@Test
	public void testGetSlotNumberForRegNumber() {
		Lot parkingLot = new Lot(6);
		parkingLot.park("KA-01-HH-1234", "White");
		parkingLot.park("KA-01-HH-9999", "White");
		parkingLot.park("KA-01-BB-0001", "Black");
		parkingLot.park("KA-01-HH-7777", "Red");
		parkingLot.park("KA-01-HH-2701", "Blue");
		parkingLot.park("KA-01-HH-3141", "Black");
		parkingLot.leave(4);
		parkingLot.park("KA-01-P-333", "White");
		parkingLot.park("DL-12-AA-9999", "White");
		parkingLot.slotNumberForRegNumber("KA-01-HH-3141");
		parkingLot.slotNumberForRegNumber("MH-04-AY-1111");
	}
}
