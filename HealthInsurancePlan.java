//package com.semanticsquare.HMS;

public abstract class HealthInsurancePlan extends BlueCrossBlueShield implements InsuranceBrand {
  private double coverage;


	public double getCoverage(){
		return coverage;
	}

	public void setCoverage(HealthInsurancePlan insurancePlan, double amount){
		if (insurancePlan instanceof PlatinumPlan){
			this.coverage = ((PlatinumPlan)insurancePlan).setCoverage(amount);
		} else if (insurancePlan instanceof GoldPlan){
			this.coverage = ((GoldPlan)insurancePlan).setCoverage(amount);
		}else if (insurancePlan instanceof SilverPlan){
			this.coverage = ((SilverPlan)insurancePlan).setCoverage(amount);
		}else if (insurancePlan instanceof BronzePlan){
			this.coverage = ((BronzePlan)insurancePlan).setCoverage(amount);
		} else {
			this.coverage = 0.0;
		}

	}
  public abstract double computeMonthlyPremium(double salary);
	public abstract double computeMonthlyPremium(double salary, int age, boolean smoking);


	private InsuranceBrand offeredBy;

	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}

}
