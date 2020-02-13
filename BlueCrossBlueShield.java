//package com.semanticsquare.HMS;

public class BlueCrossBlueShield implements InsuranceBrand{
  private long id;
  private String name;

  public long getId() {
  	return id;
  }
  public void setId(long id) {
		this.id = id;
  }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

  public double TestcomputeMonthlyPremium (HealthInsurancePlan insurancePlan, int age, boolean smoking){
    if (insurancePlan instanceof PlatinumPlan){
      if (age > 55 && smoking == true){
        return 300;
      } else if (age > 55 && smoking == false) {
        return 200;
      } else if (smoking == true){
        return 100;
      } else {
        return 0;
      }
    } else if (insurancePlan instanceof GoldPlan){
      if (age > 55 && smoking == true){
        return 240;
      } else if (age > 55 && smoking == false) {
        return 150;
      } else if (smoking == true){
        return 90;
      } else {
        return 0;
      }
    } else if (insurancePlan instanceof SilverPlan){
      if (age > 55 && smoking == true){
        return 180;
      } else if (age > 55 && smoking == false) {
        return 100;
      } else if (smoking == true){
        return 80;
      } else {
        return 0;
      }
    } else if (insurancePlan instanceof BronzePlan){
      if (age > 55 && smoking == true){
        return 120;
      } else if (age > 55 && smoking == false) {
        return 50;
      } else if (smoking == true){
        return 70;
      } else {
        return 0;
      }
    }
    return 0;
  }
}
