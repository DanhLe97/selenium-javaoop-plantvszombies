package plantvszombies;

public class PrimalSunflower extends Plants {
	public PrimalSunflower() {
		super("Primal Sunflower", 75, 300, "Enlighten-mint", 5, "Large");
	}

	@Override
	protected String getInfo() {
		return "Name: " + super.name + " Sun Cost: " + super.sunCost + " Toughness: " + super.toughness + " Family: "
				+ super.family + " Recharge: " + super.recharge + " Sun Production: " + super.sunProduction;
	}

	@Override
	protected String getAction() {
		return "Produce 50 Sun for every 5 seconds";
	}

	@Override
	protected String getProduct() {
		return "When given Plant Food , Sunflower immediately produces 150 sun";
	}

}
