package plantvszombies;

public abstract class AttackPlants extends Plants{
	protected String range;
	protected double damage;
	protected String plantFoodPower;
	public AttackPlants (String name, int sunCost, int toughness, String range, String family, int recharge, double damage, String plantFoodPower, String sunProduction) {
	super (name, sunCost, toughness, family, recharge, sunProduction);
	this.range=range;
	this.damage=damage;
	this.plantFoodPower=plantFoodPower;
	
}
}
