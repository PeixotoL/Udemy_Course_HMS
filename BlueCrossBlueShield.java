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

  public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking){
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
    }
  }
}
