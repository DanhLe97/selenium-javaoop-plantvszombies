package selenium_javaOOP;

public class HinhVuong extends Hinh {
	private double a;

	public HinhVuong(double a) {
		this.a = a;

	}

	@Override
	protected double dienTich() {
		return a * a;
	}

	@Override
	protected double chuVi() {
		return a * 4;
	}

}
