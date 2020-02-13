//package com.semanticsquare.HMS;

public class InvocationCodeTest{
  public static void main (String[] args){
    User staff = new User();
    InsuranceBrand InsuranceBrand = new BlueCrossBlueShield();
    HealthInsurancePlan insurancePlan = new PlatinumPlan();

    insurancePlan.setOfferedBy(InsuranceBrand);
    staff.setInsurancePlan(insurancePlan);
    System.out.println(insurancePlan.computeMonthlyPremium(5000, 56, true));
  }
}
