package com.semanticsquare.HMS;

public class GoldPlan extends HealthInsurancePlan{
	
	public double setCoverage(double amount){
		return amount = amount * 0.8;
	}
	public double computeMonthlyPremium(double salary){
		return salary = salary - (salary * 0.07);
	}
	
}