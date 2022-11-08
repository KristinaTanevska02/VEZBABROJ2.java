package Zadaca5;

public class Glavna {

	public static void main(String[] args) {
		Predmet p1 = new Predmet();
		p1.ime = "Objektno orientirano programiranje";
		p1.profesor = "Ilija Jolevski";
		p1.brKrediti = 6;
		p1.semestar = "III semestar";
		
		System.out.println(p1.ime + ", " + p1.profesor + ", " + p1.brKrediti + " krediti, " + p1.semestar + ".");
		
		Predmet p2 = new Predmet();
		p2.ime = "Veb tehnologii";
		p2.profesor = "Zoran Kotevski";
		p2.brKrediti = 6;
		p2.semestar = "II semestar";
		
		System.out.println(p2.ime + ", " + p2.profesor + ", " + p2.brKrediti + " krediti, " + p2.semestar + ".");
		
		
		Predmet p3 = new Predmet();
		p3.ime = "Matematika 2";
		p3.profesor = "Sonja Mancevska";
		p3.brKrediti = 6;
		p3.semestar = "II semestar";
		
		System.out.println(p3.ime + ", " + p3.profesor + ", " + p3.brKrediti + " krediti, " + p3.semestar + ".");
		
	}

}
