package oppgaver;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

import java.util.Arrays; 


public class oppgave4 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		double skatt = 0;
		
		System.out.println("Inntekt?:");
		int inntekt = Integer.parseInt(myObj.nextLine());
		if (inntekt > 934050) {
			skatt = inntekt*0.1452;
		} else if (inntekt <= 934050 && inntekt > 580650) {
			skatt = inntekt*0.1152;
		} else if (inntekt <= 580650 && inntekt > 230950) {
			skatt = inntekt*0.0241;
		} else if (inntekt <= 230950 && inntekt > 164100) {
			skatt = inntekt*0.0093;
		} 
		System.out.println("inntekt: " + (inntekt-skatt));
		System.out.print("trinnskatt: " + skatt);

	}
}