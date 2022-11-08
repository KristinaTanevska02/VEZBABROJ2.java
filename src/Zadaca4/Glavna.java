package Zadaca4;

public class Glavna {

	public static void main(String[] args) {
		Avtomobil avtomobil1 = new Avtomobil();
		avtomobil1.marka = "Fiat";
		avtomobil1.model = "Punto Grande";
		avtomobil1.pominatiKm = 25000;
		
		Avtomobil avtomobil2 = new Avtomobil ("Tesla", "S",50000);
		
		System.out.println(avtomobil1.marka + " " + avtomobil1.model + " " + avtomobil1.pominatiKm);
		System.out.println(avtomobil2.marka + " " + avtomobil2.model + " " + avtomobil2.pominatiKm);

	}

}