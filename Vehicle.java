
// Programs which will covers the inheritance and access modifiers concepts


package com.cubic.assignemnt.training;


public class Vehicle {
	   String color;
private int speed;
	   int size;
	   
	   void features() {
	      System.out.println("Color : " + color);
	      System.out.println("Speed : " + getSpeed());
	      System.out.println("Size : " + size);



	
}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}



