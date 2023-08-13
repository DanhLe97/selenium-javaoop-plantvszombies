package plantvszombies;

public abstract class Plants {
	protected String name;
	protected double sunCost;
	protected double toughness;
	protected String family;
	protected int recharge;
	protected String sunProduction;

	
	protected Plants (String name, double sunCost, double toughness, String family, int recharge, String sunProduction) {
		this.name=name;
		this.family=family;
		this.recharge=recharge;
		this.sunCost=sunCost;
		this.toughness=toughness;
		this.sunProduction=sunProduction;
	}
		protected abstract String getInfo();
		protected abstract String getAction();
		protected abstract String getProduct();
}
