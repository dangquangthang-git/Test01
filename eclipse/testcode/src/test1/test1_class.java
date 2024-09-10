package test1;

import java.util.Iterator;

public class test1_class {
	public static String chuoi1 = "một con vịt";

	public static void main(String[] args) {
		String abc = "một nhà";
		System.out.println(chuoi1.indexOf("con"));
		System.out.println(chuoi1.indexOf("vịt"));
		System.out.println(abc);
		int a = 5;
		int b = 6;
		int c = a * b;
		int d = 31;
		boolean sex1 = true;
		boolean sex2 = false;
		String khac = "kết quả khác";
		if (a > b) {
			System.out.println("kết quả này sai");
		} else if (a == c) {
			System.out.println(a * c);
		} else if (d == c) {
			System.out.println("có nghiệm");
		} else if (b<c) {
			System.out.println("đây rồi");
		}else if (a<c) {
			System.out.println("assss ssCHÓ");
		}
		else {
			System.out.println(khac.toUpperCase());
		}
		
		
		System.out.println(sex1 || sex2);
		int var = 12;
		int p, q, r, s;
		p = q = r = s = var;
		System.out.println(p + q + r);
		System.out.println(b++);
		System.out.println(++b);
		System.out.println(b++ + 1);
		System.out.println(++b + 1);
		System.out.println(chuoi1.indexOf("vịt"));
		if (b>c) {
			System.out.println("có nghiệm");
		}
		else if (c<d) {
			System.out.println("vô nghiệm");
		}
		else {
			System.out.println("okkkkkk");
		}
		try {
		for (int i = 1; i <=20; i++) {
			System.out.println("số thứ tự: "+i);
			System.out.println("vô nghiệm");
			System.out.println(r );
			if (i==s) {
				System.out.println("dừng lại");
				break;
			}
		}
	} finally {
		System.out.println("ehehehe");
	}
		
}}
