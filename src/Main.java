import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Création des films
		Film film1 = new Film("Massacre à la tronconneuse","Tronconneuse",2001);
		Film film2 = new Film("Scream","Couteau",2004);
		
		
		//Utilisation de la methode contre 
		contre(film1, film2);
		
		//Initialisation du scanner
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		//Retypage de la valeur input de String a int
		int choix = Integer.valueOf(input);
		
		//Utilisation de la methode choix
		choix(film1, film2, choix);
		
	}
	
	
	//Methode qui permet d'opposer 2 films
	public static void contre(Film film1, Film film2) {
		System.out.println("Veuillez choisir un film parmis ces 2 choix:");
		System.out.println("1: " + film1.getDescription() + " "+film1.getAnnee());
		System.out.println("2: " + film2.getDescription() + " "+film2.getAnnee());

	}
	
	//Methode qui set l'etat du film en fonction du choix de l'utilisateur
	public static void choix(Film film1, Film film2,int choix) {
		while (choix!=1 && choix!=2) {
			System.out.println("invalide");
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			choix = Integer.valueOf(input);
		}
		if (choix == 1) {
			System.out.println("Vous avez choisis le premier film");
		}
		if (choix == 2) {
			System.out.println("Vous avez choisis le deuxieme film");
		}
	}
	
	
}
