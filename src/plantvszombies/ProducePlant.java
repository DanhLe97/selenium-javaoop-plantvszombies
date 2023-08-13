package plantvszombies;

public abstract class ProducePlant extends Plants{
	protected String sunProduction;
	
	protected ProducePlant (String name, double sunCost, double toughness, String family, int recharge, String sunProduction) {
		super(name, sunCost,toughness, family, recharge, sunProduction);
	this.sunProduction=sunProduction;
	}
}
