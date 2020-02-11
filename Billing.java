package com.semanticsquare.HMS;

public class Billing{
					   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
		
		if(patientInsurancePlan == null){
			payments[0] = 0.0;
		} else{
			patientInsurancePlan.setCoverage(patientInsurancePlan, amount);
			payments[0] = patientInsurancePlan.getCoverage();
		}
		
		
		
		if (patientInsurancePlan instanceof PlatinumPlan){
			payments[1] = amount - (payments[0] + 50.0);
		} else if (patientInsurancePlan instanceof GoldPlan){
			payments[1] = amount - (payments[0] + 40.0);
		} else if (patientInsurancePlan instanceof SilverPlan){
			payments[1] = amount - (payments[0] + 30.0);
		} else if (patientInsurancePlan instanceof BronzePlan){
			payments[1] = amount - (payments[0] + 25.0);
		}else{
			payments[1] = amount - 20.0;
		}
		


        // your logic        

        return payments;
    }

}