package oppgaver;

import static javax.swing.JOptionPane.showInputDialog;


public class oppgave6 {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("n="));
		System.out.print(factorial(n));
	}

	private static int factorial(int n) {
		if (n > 1) {
			return n*factorial(n-1);
		} else {
			return 1;
		}
	}
}
