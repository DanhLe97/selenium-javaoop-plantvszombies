package selenium_java;

import java.util.Scanner;

public class javaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		System.out.println("Nhap so a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("Nhap so b: ");
		b = sc.nextInt();
	
		System.out.println("Tong hai so: " +tong(a,b));

	}
	protected static int tong (int a, int b) {
		int tinhTong = a+b;
		return tinhTong;
	}
	
	protected static int tong (int a, int b, int c) {
		int tinhTong = a+b;
		return tinhTong;
	}
	protected static int hieu (int a, int b) {
		int tinhHieu = a-b;
		return tinhHieu;
	}
} 

// access modifier + kiểu trả về của hàm + têm hàm (parameter)
// access modifier (public: có thể dùng ở mọi nơi)
//					default: chỉ dùng trong phạm vi 1 package
//					protected: chỉ được dùng trong package và những phần nó được kế thừa
//					private: chỉ được dùng trong class đó. ngoài ra không truy cập được


// 4: Đóng gói: có kiểu dữ liệu, method   1 Object phải có: thuộc tính và method
// Kế thừa: extend: 
// Trừu tượng: method bị ẩn bên trong, người dùng không thể truy cập sâu vào trong để can thiệp, liên quan tới bảo mật: abstract, interface
// Trừu tượng: Phải dùng override
// abstract class: thường được quyền khai báo attribute, method (không có nội dung {}), method bình thường (có nội dung)
// abstract class: dùng extend
// interface chỉ ghi interface: chỉ được phép khai báo method không có nội dung, không có access modifiers, chỉ có parameter
// interface: dùng từ khoá implement
// Đa hình: override(method và parameter phải giống với thằng cha)  | overload: nạp chồng (chỉ lấy method cũ nhưng khác parameter)  | Phụ thuộc vào kế thừa 























