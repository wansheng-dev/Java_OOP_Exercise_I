package com.ch2.as3projectzookeeper;

public class Mammal {
	
	private int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return this.energyLevel;
	};
	
	public int getEnergyLevel() {
		return this.energyLevel;
	};
	
	public void setEnergyLevel(int num) {
		this.energyLevel = num;
	};
}
