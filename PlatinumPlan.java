package com.semanticsquare.HMS;


public class PlatinumPlan extends HealthInsurancePlan {

	public double setCoverage(double amount){
		return amount = amount * 0.9;
	}
	public double computeMonthlyPremium(double salary){
		return salary = salary - (salary * 0.08);
	}

	public double computeMonthlyPremium(double salary, int age, boolean smoking){
		return 0.08 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}

}
