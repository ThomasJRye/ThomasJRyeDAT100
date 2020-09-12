package oppgaver;

import static javax.swing.JOptionPane.showInputDialog;




public class oppgave5 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			sjekkKarakter();
		}

		
		
	}
	
	public static void sjekkKarakter() {
		int poeng = Integer.parseInt(showInputDialog("poeng:"));


		if (poeng < 0 || poeng > 100) {
			System.out.println("Ugyldig verdi");
			sjekkKarakter();
		} else if (poeng > 90) {
			System.out.print("A");
		} else if (poeng > 80) {
			System.out.print("B");
		} else if (poeng > 60) {
			System.out.print("C");
		} else if (poeng > 50) {
			System.out.print("D");
		} else if (poeng > 40) {
			System.out.print("E");
		} else {
			System.out.print("F");
		}
	}
}