package zadaca_7;

import java.util.Scanner;
public class MainClass {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
		
		System.out.println("Vnesi ja goleminata na stranata a.");
		int a = sc.nextInt();
		System.out.println("Vnesi ja goleminata na stranata b.");
		int b = sc.nextInt();
		System.out.println("Vnesi ja goleminata na stranata c.");
		int c = sc.nextInt();
		
		
		Triagolnik t1 = new Triagolnik();
		t1.a = a;
		t1.b = b;
		t1.c = c;
		
		t1.Perimetar();
		System.out.println("Perimetarot na triagolnikot iznesuva: " + t1.Perimetar());
		
		t1.Poluperimetar();
		t1.Plostina();
		System.out.println("Poluperimetarot na triagolnikot e: " + t1.Poluperimetar());
		System.out.printf("Plostinata na triagolnikot e: "  + t1.Plostina());	
		}
	}
}

