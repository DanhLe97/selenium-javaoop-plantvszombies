package plantvszombies;

public class Peashooter extends AttackPlants{
protected Peashooter () {
	super("Peashooter",100,300,"Straight","Appease-mint",5,20,"Duration","");
}

@Override
protected String getInfo() {
	// TODO Auto-generated method stub
	return "Name: " + super.name + " Sun Cost: " + super.sunCost + " Toughness: " + super.toughness + " Range: " + super.range + " Family: " + super.family + " Recharge: " + super.recharge + " Damage: " + super.damage + " Plant Food Power: " + super.plantFoodPower;
}

@Override
protected String getAction() {
	// TODO Auto-generated method stub
	return "Shoot a pea a second. A pea does 20 damages to a zombie";
}

@Override
protected String getProduct() {
	// TODO Auto-generated method stub
	return "When given Plant Food, Peashoote becomes a fast-shooting Gatling Pea, shooting 60 peas in two seconds";
}
}
