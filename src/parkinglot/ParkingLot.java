package parkinglot;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class ParkingLot {
	static class Car {
		String regNumber;
		String colour;
		Car (String regNumber, String colour) {
			this.regNumber = regNumber;
			this.colour = colour;
		}
	}
	
	static class Lot {
		int capacity;
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		//PriorityQueue<Integer> freeSlots = new PriorityQueue<Integer>();
		PriorityQueue<Integer> freeSlots;
		
		Lot (int capacity) {
			this.capacity = capacity;
			freeSlots = new PriorityQueue<Integer>(capacity);
			for(int i = 1; i <= this.capacity; i++) {
				freeSlots.add(i);
			}
			System.out.println("Created a parking lot with " + this.capacity 
					+ " slots");
		}
		
		public void park(String regNumber, String colour) {
			Car newCar = new Car(regNumber, colour);
			if(!freeSlots.isEmpty()) {
				int freeSlot = freeSlots.remove();
				map.put(freeSlot, newCar);
				System.out.println("Alloted slot number : " + freeSlot);
			}else {
				System.out.println("Sorry, parking lot is full");
			}
		}
		
		public void leave(int slot) {
			if(slot > capacity) {
				System.out.println("The slot you want to free is not in"
						+ "range of your parking lot");
				return;
			}
			if(map.containsKey(slot)) {
				freeSlots.add(slot);
				map.remove(slot);
				System.out.println("Slot number " + slot + " is free");
			}
		}
		
		public void status() {
			System.out.println("Slot No.\t" + "Registration No\t\t" + "Colour");
			for(Map.Entry<Integer, Car> entry: map.entrySet()) {
				System.out.println(entry.getKey() + "\t\t" + entry.getValue().regNumber
						+ "\t\t" + entry.getValue().colour);
			}
		}
		
		//registration_numbers_for_cars_with_colour
		public void regNumbersForColour(String colour) {
			for(Map.Entry<Integer, Car> entry : map.entrySet()) {
				if(entry.getValue().colour.matches(colour)) {
					System.out.print(entry.getValue().regNumber + " ");
				}
			}
		}
		
		//slot_numbers_for_cars_with_colour
		public void slotNumbersForColour(String colour) {
			for(Map.Entry<Integer, Car> entry : map.entrySet()) { 
				if(entry.getValue().colour.matches(colour)) {
					System.out.print(entry.getKey() + ", ");
				}
			}
		}
		
		//slot_number_for_registration_number
		public void slotNumberForRegNumber(String regNumber) {
			for(Map.Entry<Integer, Car> entry : map.entrySet()) {
				if(entry.getValue().regNumber.matches(regNumber)) {
					System.out.println(entry.getKey() + "");
					return;
				}
			}
			System.out.println("Not found");
		}
		
	}
	
	public static void main(String args[]) {
		
	}
}