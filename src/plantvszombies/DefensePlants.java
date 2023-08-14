package plantvszombies;

public abstract class DefensePlants extends Plants {
protected String plantFoodPower;
public DefensePlants (String name, double sunCost, double toughness, String family, int recharge,String plantFoodPower, String sunProduction) {
	super (name,sunCost,toughness,family,recharge,sunProduction);
	this.plantFoodPower=plantFoodPower;
}
}
