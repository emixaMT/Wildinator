import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Création de la collection de film
		Film film1 = new Film("Paranormal Activity 2","Les caméras c'est pas toujours pour les sex-tape",2010);
		Film film2 = new Film("Blood Island","Des vacances qui tournent à l'horreur ",2011);
		Film film3 = new Film("The Thing","Un prédateur protéiforme venu d’un autre monde tente de survivre et de prospérer aux dépens d’humains terrorisés qu’il infecte et pousse à s’entre-tuer",2011);
		Film film4 = new Film("Eraserhead","Torture gratuite démoniaque",1977);
		
		ArrayList<Film> films = new ArrayList<>();
		films.add(film1);
		films.add(film2);
		films.add(film3);
		films.add(film4);
		
		int size = films.size();
		
		Random r = new Random();
		int rand1 = r.nextInt(size);
		int rand2 = r.nextInt(size);
		
		//Utilisation de la methode contre 
		contre(films.get(rand1), films.get(rand2));
		
		//Initialisation du scanner
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		//Retypage de la valeur input de String a int
		int choix = Integer.valueOf(input);
		
		//Utilisation de la methode choix
		choix(films.get(0), films.get(1), choix);
		
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
