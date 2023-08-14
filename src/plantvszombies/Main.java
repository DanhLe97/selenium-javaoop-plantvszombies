package plantvszombies;

public class Main {
public static void main(String[] plantvszombies) {
	Peashooter peashoot = new Peashooter();
	System.out.println(peashoot.getInfo());
	System.out.println(peashoot.getAction());
	System.out.println(peashoot.getProduct());
	
	SunFlower sunf = new SunFlower();
	System.out.println(sunf.getInfo());
	System.out.println(sunf.getAction());
	System.out.println(sunf.getProduct());
	
	TwinSunflower tsun = new TwinSunflower();
	System.out.println(tsun.getInfo());
	System.out.println(tsun.getAction());
	System.out.println(tsun.getProduct());
	
	PrimalSunflower psun = new PrimalSunflower();
	System.out.println(psun.getInfo());
	System.out.println(psun.getAction());
	System.out.println(psun.getProduct());
	
	WallNut nut = new WallNut();
	System.out.println(nut.getInfo());
	System.out.println(nut.getAction());
	System.out.println(nut.getProduct());
	
	PotatoMine pot = new PotatoMine();
	System.out.println(pot.getInfo());
	System.out.println(pot.getAction());
	System.out.println(pot.getProduct());
	
	CabbagePult cab = new CabbagePult();
	System.out.println(cab.getInfo());
	System.out.println(cab.getAction());
	System.out.println(cab.getProduct());
}
}
