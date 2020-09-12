package oppgaver;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

import java.util.Arrays; 


public class oppgave4 {

	public static void main(String[] args) {

		int a = Integer.parseInt(showInputDialog("tall1 :"));

		int b = Integer.parseInt(showInputDialog("tall1 :"));

		int c = Integer.parseInt(showInputDialog("tall1 :"));

		if (a>=b && b>=c) {
			System.out.println(a + " " + b + " " + c);
		} if (a>c && c>b) {
			System.out.println(a + " " + c + " " + b);
		} if (b>a && a>c) {
			System.out.println(b + " " + a + " " + c);
		}  if (b>c && c>a) {
			System.out.println(b + " " + c + " " + a);
		} if (c>b && b>a) {
			System.out.println(c + " " + b + " " + a);
		} if (c>a && a>b) {
			System.out.println(c + " " + a + " " + b);
		} 
		
		
	}
}