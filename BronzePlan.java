package com.semanticsquare.HMS;

public class BronzePlan extends HealthInsurancePlan{
	
	public double setCoverage(double amount){
		return amount = amount * 0.6;
	}
	public double computeMonthlyPremium(double salary){
		return salary = salary - (salary * 0.05);
	}
}