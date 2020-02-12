package com.semanticsquare.HMS;

public class UserTest{

	public static void main(String[] args){

		HealthInsurancePlan insurancePlan = new HealthInsurancePlan();					//The SuperClass is HealthInsurancePlan!!!
		Patient patient = new Patient();
		patient.setInsurancePlan(insurancePlan);

		double[] payments = Billing.computePaymentAmount(patient, 1000.0);

		System.out.println("InsurancePlan: " + patient.getInsurancePlan());
		System.out.println("plan insurance payment " + payments[0]);
		System.out.println("patient payment " + payments[1]);

	}

}
