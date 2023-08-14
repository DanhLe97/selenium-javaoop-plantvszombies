package plantvszombies;

public abstract class AttackPlants extends Plants{
	protected String range;
	protected double damage;
	protected String plantFoodPower;
	protected double armingTime;
	public AttackPlants (String name, double sunCost, double toughness, String range, String family, int recharge, double damage, String plantFoodPower, String sunProduction,double armingTime) {
	super (name, sunCost, toughness, family, recharge, sunProduction);
	this.range=range;
	this.damage=damage;
	this.plantFoodPower=plantFoodPower;
	this.armingTime=armingTime;
}
}
