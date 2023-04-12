import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

	public static void main(String args[]) {
		// la telecommande vide
		Telecommande t = new Telecommande();

		// ajoute des objets
		// utilisation de refactor (extract method)
		// pour rendre le code plus clair
		//ajouter4Apprareils(t);

		// test d'activation
		//t.activerAppareil(1);
		//t.activerAppareil(3);
		//System.out.println(t);

		// gestion du menu
		//lancerMenu(t);

		Lampe l1 = new Lampe("Lampe Swag");
		Lampe l2 = new Lampe("Lampe pas Swag");
		Hifi h1 = new Hifi();
		Hifi h2 = new Hifi();
		ChemineeAdaptateur c1 = new ChemineeAdaptateur();
		ChemineeAdaptateur c2 = new ChemineeAdaptateur();

		t.ajouterAppareil(l1);
		t.ajouterAppareil(l2);
		t.ajouterAppareil(h1);
		t.ajouterAppareil(h2);
		t.ajouterAppareil(c1);
		t.ajouterAppareil(c2);

		TelecommandeGraphique tg = new TelecommandeGraphique(t);
	}

	/**
	 * menu qui permet de manipuler une telecommande
	 * 
	 * @param t
	 *            telecommande a manipuler
	 */
	private static void lancerMenu(Telecommande t) {
		System.out.println(t);
		Scanner sc = new Scanner(System.in);
		
		boolean fini=false;
		
		// tant qu'il y a des commandes
		while (!fini) {
			
			// demande lampe et commande
			System.out.println("entrer le numero de la lampe");
			int choix = sc.nextInt();
			System.out.println("entrer commande (+/-/exit)");
			String com = sc.nextLine();
			com = sc.nextLine();

			// si la commande est +, on active
			if (com.equals("+")) {
				System.out.println("== activer "+choix+"==");
				t.activerAppareil(choix);
			}
			// si la commande est - on descactive
			else if (com.equals("-")) {
				System.out.println("== desactiver "+choix+"==");
				t.desactiverAppareil(choix);
			}
			// si la commande est exit, on arrete
			else if (com.equals("exit")) {
				System.out.println("== Fin du programme == ");
				fini=true;
			}
			// commande non reconnue
			else {
				System.out.println("commande inconnue");
			}
			
			//affiche l'etat de le telecommande
			System.out.println(t);
		}
		sc.close();
	}

	/**
	 * creation des objets et ajout dans la telecommande
	 * 
	 * @param t
	 *            telecommande dans lequelle on ajoute 4 lampes
	 */
	private static void ajouter4Apprareils(Telecommande t) {
		Lampe l1 = new Lampe("Lampe1");
		t.ajouterAppareil(l1);

		Hifi h2 = new Hifi();
		t.ajouterAppareil(h2);

		ChemineeAdaptateur c3 = new ChemineeAdaptateur();
		t.ajouterAppareil(c3);

		Lampe l4 = new Lampe("Lampe4");
		t.ajouterAppareil(l4);
	}

}
