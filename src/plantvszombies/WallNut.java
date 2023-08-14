package plantvszombies;

public class WallNut extends DefensePlants {
	protected WallNut() {
		//String name, double sunCost, double toughness, String family, int recharge,String plantFoodPower, String sunProduction
		super("Wall-Nut",50,4000,"Reinforce-mint",20,"Armor","");
	}

	@Override
	protected String getInfo() {
		// TODO Auto-generated method stub
		return "Name: " + super.name + " Sun Cost: " + super.sunCost + " Toughness: " + super.toughness + " Family: " + super.family + " Recharge: " + super.recharge + " Plant Food Power: " + super.plantFoodPower;
	}

	@Override
	protected String getAction() {
		// TODO Auto-generated method stub
		return "Absorb 4000 damages";
	}

	@Override
	protected String getProduct() {
		// TODO Auto-generated method stub
		return "When given Plant Food, Wall-nut gains full-body metal amor, capable or absorbing 8000 damages";
	}
	
	

}
