//package com.semanticsquare.HMS;

public class SilverPlan extends HealthInsurancePlan implements InsuranceBrand{

	public double setCoverage(double amount){
		return amount = amount * 0.7;
	}
	public double computeMonthlyPremium(double salary){
		return salary = salary - (salary * 0.06);
	}

	public double computeMonthlyPremium (double salary, int age, boolean smoking){
		return 0.06 * salary + getOfferedBy().TestcomputeMonthlyPremium(this, age, smoking);
	}

}
