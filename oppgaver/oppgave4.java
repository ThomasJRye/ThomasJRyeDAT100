package oppgaver;

import static javax.swing.JOptionPane.*;

public class oppgave4 {

	public static void main(String[] args) {
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");

		String riktigBrukernavn = "braBruker";
		String riktigPassord = "braPassord";
		
		if (brukernavn.equals(riktigBrukernavn) && passord.equals(riktigPassord)) {
			System.out.println("Riktig passord og brukernavn");
		} else {
			System.out.print("Feil brukernavn eller passord");
		}


	}

}
