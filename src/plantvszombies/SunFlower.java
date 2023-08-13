package plantvszombies;

public class SunFlower extends ProducePlant {
	protected SunFlower () {
		super ("Sunflower",50, 500,"Eighten-mint",5,"Normal");
		
	}

	@Override
	protected String getInfo() {
		// TODO Auto-generated method stub
		return "Name: " + super.name + " Sun Cost: " + super.sunCost + " Toughness: " + super.toughness + " Family: " + super.family + " Recharge: " + super.recharge + " Sun Production: " + super.sunProduction;
		
	}

	@Override
	protected String getAction() {
		// TODO Auto-generated method stub
		return "Produce 20 suns for every 5 seconds";
	}

	@Override
	protected String getProduct() {
		// TODO Auto-generated method stub
		return "When given Plant Food, Sunflower immediately produces 150 suns";
	}
	
}
