package plantvszombies;

public class CabbagePult extends AttackPlants {
protected CabbagePult () {
	//	public AttackPlants (String name, int sunCost, int toughness, String range, String family, int recharge, double damage, String plantFoodPower, String sunProduction) {

	super ("Cabbage-Pult", 100,300,"Lobbed","Arma-mint",5,40,"Cabbage Count","",0);
}

@Override
protected String getInfo() {
	// TODO Auto-generated method stub
	return "Name: " + super.name + " Sun Cost: " + super.sunCost + " Toughness: " + super.toughness + " Range: " + super.range + " Family: " + super.family + " Recharge: " + super.recharge + " Damage: " + super.damage + " Plant Food Power: " + super.plantFoodPower;
}

@Override
protected String getAction() {
	// TODO Auto-generated method stub
	return "Launch a cabbage for every 3 seconds that does 40 damages";
}

@Override
protected String getProduct() {
	// TODO Auto-generated method stub
	return "When Cabbage";
}
}
