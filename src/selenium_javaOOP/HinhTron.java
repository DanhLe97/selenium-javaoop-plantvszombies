package selenium_javaOOP;

public class HinhTron extends Hinh {
	private double r;

	public HinhTron (double r) {
		this.r=r;
		
	}
	@Override

	protected double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

	@Override
	protected double chuVi() {
		// TODO Auto-generated method stub
		return Math.PI * r * 2;

	}

}
