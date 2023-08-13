package selenium_javaOOP;

public class HamChung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(initialize(HinhTron.class, 10).dienTich());

		HinhVuong hv = new HinhVuong(4);
		System.out.println(hv.dienTich());
		System.out.println(hv.chuVi());
	}

	public static Hinh initialize(@SuppressWarnings("rawtypes") Class cls, double value) {

		if (cls.getSimpleName().equals("hinhTron")) {
			return new HinhTron(value);
		}
		else {
			return null;
		}
	}
}
