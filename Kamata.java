package prokect_777;

import java.util.Scanner;

public class Kamata {
	public static void main(String[] args) {
		double depozit; // poceten depozit
		double kamatnaStapka; // godisna kamatna stapka
		double iznosKamata; // paricen iznos na kamata
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Vnesi poceten depozit: ");
		depozit = tastatura.nextDouble();
		System.out.println("Vnesi godisna kamatna stapka: ");
		kamatnaStapka = tastatura.nextDouble();
		iznosKamata = depozit * kamatnaStapka;
		depozit = depozit + iznosKamata;
		System.out.println();
		System.out.println("Paricen iznos na godisna kamata: ");
		System.out.println("iznosKamata");
		System.out.println("Zgolemen depozit posle 1 godina: ");
		System.out.println(depozit);
	}
}
