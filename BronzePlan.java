package com.semanticsquare.HMS;

public class BronzePlan extends HealthInsurancePlan{

	public double setCoverage(double amount){
		return amount = amount * 0.6;
	}
	public double computeMonthlyPremium(double salary){
		return salary = salary - (salary * 0.05);
	}

	public double computeMonthlyPremium (double salary, int age, boolean smoking){
		return 0.05 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
