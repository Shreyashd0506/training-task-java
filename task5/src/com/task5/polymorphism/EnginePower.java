package com.task5.polymorphism;


public class EnginePower {
	 
    // Calculate power for petrol engine
    int calculatePower(int cc) {
        return cc * 2;
    }
 
    // Calculate power for diesel engine
    int calculatePower(int cc, int turboBoost) {
        return (cc * 2) + turboBoost;
    }
 
    // Calculate power for electric motor
    int calculatePower(double batteryCapacity) {
        return (int)(batteryCapacity * 50);
    }
}
 
