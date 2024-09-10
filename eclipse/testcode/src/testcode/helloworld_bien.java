package testcode;

public class helloworld_bien {

	public static String b = "first step";

	public static void main(String[] args) {
		int n = 10;
		float tuoi = 65.6f;
		boolean sex = true;
		System.out.println("ten bai nay la: " + b);
		System.out.println("ten so nay la: " + n * 6);
		System.out.println("ten so nay la: " + tuoi * 3);
		System.out.println("ten so nay la: " + sex);
		System.out.println(tuoi);

		int a = 1;
		// In rồi mới tăng
		System.out.println(a++);
		// Tăng rồi mới in
		System.out.println(++a);
		// Cộng 1 và in ra rồi mới tăng
		System.out.println(a++ + 1);
		// Cộng 1 mới tăng và in ra
		System.out.println(++a + 1);
	}

	public String dob1 = "21/04/1998";

	public void get_info() {
		System.out.println("ngay sinh toi la: " + dob1);
		System.out.println(dob1);
	}

	public String name = "thang.dangquang";
	public int age = 25;
	public String dob = "21/04/1998";
	public String job = "tester";

	public void get_info1() {

		System.out.println("Ten toi la: " + name);
		System.out.println("Tuoi toi la: " + age);
		System.out.println("Ngay sinh toi la: " + dob);
		System.out.println("Cong viec: " + job);
	}
}