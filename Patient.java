package com.semanticsquare.HMS;


class Patient extends User{
	private long patientId;
	
	
	public long getPatientId(){
		return patientId;
	}
	public void setPatientId(long patientId){
		this.patientId = patientId;
	}

	
	public static void main(String[] args){
		
		HealthInsurancePlan insurancePlan = new PlatinumPlan();					//The SuperClass is HealthInsurancePlan!!!
		Patient patient = new Patient();
		patient.setInsurancePlan(insurancePlan);
		
		double[] payments = Billing.computePaymentAmount(patient, 1000.0);
		
		System.out.println("InsurancePlan: " + patient.getInsurancePlan());
		System.out.println("plan insurance payment " + payments[0]);		
		System.out.println("patient payment " + payments[1]);	
	}
		
	
}