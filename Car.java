package week.day1;

public class Car {
	 public void drive() {
		 System.out.println("SIT PROPERLY");
	}
	 public void applyBreak() {
	      System.out.println("THE USER CAN APLLY THE BREAK");
	 }
	 public void switchOnAc() {
		 System.out.println("AC IS ON");
	 }
	 public void applyAcclerate() {
		System.out.println("THE USER CAN APPLY THE ACCLERATOR");
	}
	 public void applyGear() {
		 system.out.println("THE USER CAN APPLY THE GEAR");
	 }
	 public void changeGear() {
		 system.out.println("THE USER CAN CHANGE THE GEAR");
	 }
	 public static void main(String[] args) {
		 
		 Car object = new Car();
		 object.drive();
		 object.applyBreak();
		 object.switchOnAc();
		 object.applyAcclerate();
		 
				 
	 }
}
