package plantvszombies;

public class PotatoMine extends AttackPlants {
protected PotatoMine () {
//	public AttackPlants (String name, int sunCost, int toughness, String range, String family, int recharge, double damage, String plantFoodPower, String sunProduction,double armingTime) {

	super ("Potato Mine",25,300,"Tile","Bombard-mint",20,1800,"Duplication","",14);

}

@Override
protected String getInfo() {
	// TODO Auto-generated method stub
	return "Name: " + super.name + " Sun Cost: " + super.sunCost + " Toughness: " + super.toughness + " Area: " + super.range + " Family: " + super.family + " Recharge: " + super.recharge + " Damage: " + super.damage + " Plant Food Power: " + super.plantFoodPower+ " Arming Time: " + super.armingTime;
}

@Override
protected String getAction() {
	// TODO Auto-generated method stub
	return "When zombie steps in, it does 1800 damages";
}

@Override
protected String getProduct() {
	// TODO Auto-generated method stub
	return "When given Plant Food";
}
}
