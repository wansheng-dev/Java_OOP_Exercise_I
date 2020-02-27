package com.ch2.as3projectzookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		setEnergyLevel(300);
	};
	
	public void fly() {
		int newEnergyLevel = getEnergyLevel() - 50;
		setEnergyLevel(newEnergyLevel);
		System.out.print("Print the sound a bat taking off & Current energy: " + getEnergyLevel());
	};
	
	public void eatHumans() {
		int newEnergyLevel = getEnergyLevel() + 25;
		setEnergyLevel(newEnergyLevel);
		System.out.print("So-well, never mind. & Current energy: " + getEnergyLevel());
	};
	
	public void attackTown() {
		int newEnergyLevel = getEnergyLevel() - 100;
		setEnergyLevel(newEnergyLevel);
		System.out.print("Print the sound of a town on fire. & Current energy: " + getEnergyLevel());
	};

}
