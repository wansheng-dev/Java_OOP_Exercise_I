package com.ch2.as3projectzookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {};
	
	public void throwSomething() {
		int newEnergyLevel = getEnergyLevel() - 5;
		setEnergyLevel(newEnergyLevel);
		System.out.print("The gorilla has thrown something." + getEnergyLevel());
	};
	
	public void eatBananas() {
		int newEnergyLevel = getEnergyLevel() + 10;
		setEnergyLevel(newEnergyLevel);
		System.out.print("The gorilla is satisfied." + getEnergyLevel());
	};
	
	public void climb() {
		int newEnergyLevel = getEnergyLevel() - 10;
		setEnergyLevel(newEnergyLevel);
		System.out.print("The gorilla has climbed a tree." + getEnergyLevel());
	};
}
