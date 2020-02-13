//package com.semanticsquare.HMS;

public class GoldPlan extends HealthInsurancePlan{

	public double setCoverage(double amount){
		return amount = amount * 0.8;
	}
	public double computeMonthlyPremium(double salary){
		return salary = salary - (salary * 0.07);
	}

	public double computeMonthlyPremium (double salary, int age, boolean smoking){
		return 0.07 * salary + getOfferedBy().TestcomputeMonthlyPremium(this, age, smoking);
	}

}
