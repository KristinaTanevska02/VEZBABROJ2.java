package Zadaca7;

import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		Triagolnik triagolnik = new Triagolnik();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vnesi vrednost za stranata a: ");
		triagolnik.a = scanner.nextDouble();
		System.out.print("Vnesi vrednost za stranata b: ");
		triagolnik.b = scanner.nextDouble();
		System.out.print("Vnesi vrednost za stranata c: ");
		triagolnik.c = scanner.nextDouble();
		scanner.close();
		
		System.out.println("Perimetarot na triagolnikot e: "+ triagolnik.perimetar());
		System.out.println("Ploshtinata na triagolnikot e: "+ triagolnik.plostina());
	}
}

