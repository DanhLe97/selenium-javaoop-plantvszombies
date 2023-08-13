package selenium_javaOOP;

public class HinhTamGiac extends Hinh{
	private double a,b,c,h;
	
	public HinhTamGiac (double a, double h) {
		this.a=a;
		this.h=h;
		
	}
	@Override
	protected double dienTich() {
		// TODO Auto-generated method stub
		return (a*h)*0.5;
	}

	@Override
	protected double chuVi() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	

}
