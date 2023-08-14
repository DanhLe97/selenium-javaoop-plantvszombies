package plantvszombies;

public class Repeater extends AttackPlants {
	protected Repeater () {
//	public AttackPlants (String name, double sunCost, int toughness, String range, String family, int recharge, double damage, String plantFoodPower, String sunProduction,double armingTime) {

		super ("Repeater",200,300,"Straight","Appease-mint",5,20,"Duration","",0);
	}

	@Override
	protected String getInfo() {
		// TODO Auto-generated method stub
		return "Name: " + super.name + " Sun Cost: " + super.sunCost + " Toughness: " + super.toughness + " Range: "+super.range + " Family: "+super.family + " Recharge: "+super.recharge + " Damage: "+super.recharge+" Plant Food Power: "+super.plantFoodPower;
	}

	@Override
	protected String getAction() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	protected String getProduct() {
		// TODO Auto-generated method stub
		return "";
	}
}
