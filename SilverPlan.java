package com.semanticsquare.HMS;

public class SilverPlan extends HealthInsurancePlan{
	
	public double setCoverage(double amount){
		return amount = amount * 0.7;
	}
	public double computeMonthlyPremium(double salary){
		return salary = salary - (salary * 0.06);
	}

}