package com.semanticsquare.HMS;

public class InvocationCodeTest{
  public static void main (String[] args){
    User Staff = new User();
    InsuranceBrand InsuranceBrand = new BlueCrossBlueShield();
    HealthInsurancePlan insurancePlan = new PlatinumPlan();

    insurancePlan.setOfferedBy(InsuranceBrand);
    staff.setInsurancePlan(insurancePlan);
    insurancePlan.computeMonthlyPremium(5000, 56, true);
  }
}
