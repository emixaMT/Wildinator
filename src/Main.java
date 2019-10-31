import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Création de la collection de film
		Film film1 = new Film("Paranormal Activity 2","Les caméras c'est pas toujours pour les sex-tape.",2010);
		Film film2 = new Film("Blood Island","Des vacances qui tournent à l'horreur.",2011);
		Film film3 = new Film("The Thing","Un prédateur protéiforme venu d’un autre monde tente de survivre et de prospérer aux dépens d’humains terrorisés qu’il infecte et pousse à s’entre-tuer.",2011);
		Film film4 = new Film("Eraserhead","Torture gratuite démoniaque.",1977);
		Film film5 = new Film("Saw","Tu t'ai déjà réveillé attaché a un chiotte, un inconnus en face de toi et une scie.",2004);
		Film film6 = new Film("Scream","Tu t'appretes a regarder un film d'horreur quand tout a coup le telephonne sonne.",1997);
		Film film7 = new Film("The birds","Trouves tu que les épouvantails ont une utilitée? Après ce film tu auras changé d'avis.",1963);
		Film film8 = new Film("28 Days Later","Un film avec des chimpanzés où les gentils font des bétises et ca dérape!",2003);
		/*Film film9 = new Film("The Hills have Eyes", "Anniversaire de mariage raté", 2005);
		Film film10 = new Film("Captif", "Torture après une mission humanitaire", 2010);
		Film film11 = new Film("Psychos", "S'enfuir avec de l'argent peut mener à la mort", 1960);
		Film film12 = new Film("The project Blair Witch", "Une sorcière dans les bois", 1999);
		Film film13 = new Film("the Ring","la télé vous fait mourrir de peur",2002);
        Film film14 = new Film("Shining","un hotel cachant de terrible secret vous fera basculer peu a peu dans la folie",1980);
        Film film15 = new Film("Don't breathe","Même avec un handicap il reste le plus dangereux",2016);
        Film film16 = new Film("Sept jours à vivre","quand le compte a rebours est lancé impossible de l'arreter",2000);*/

		
		ArrayList<Film> filmsDepart = new ArrayList<>();
		filmsDepart.add(film1);
		filmsDepart.add(film2);
		filmsDepart.add(film3);
		filmsDepart.add(film4);
		filmsDepart.add(film5);
		filmsDepart.add(film6);
		filmsDepart.add(film7);
		filmsDepart.add(film8);
		/*filmsDepart.add(film9);
		filmsDepart.add(film10);
		filmsDepart.add(film11);
		filmsDepart.add(film12);
		filmsDepart.add(film13);
		filmsDepart.add(film14);
		filmsDepart.add(film15);
		filmsDepart.add(film16);*/
		
		
		ArrayList<Film> filmsTour2 = new ArrayList<>();
		int i=filmsDepart.size()-1;
		entete();

		//Tour 1
		
		tour1(filmsDepart, filmsTour2, i);
		
	
		
		//Tour 2
		System.out.println("--------------------------------------------------------------");System.out.println("");
		System.out.println("Ok maintenant on passe au tour 2, il va prendre vos choix et les confronter entre eux !");
		System.out.println("");System.out.println("--------------------------------------------------------------");
		ArrayList<Film> filmsTour3 = new ArrayList<>();
		i = filmsTour2.size()-1;
		
		tour2(filmsTour2, filmsTour3, i);
		/*
		//Tour 3
		System.out.println("");System.out.println("");System.out.println("");
		System.out.println("Maintenant c'est le 3eme tour, allez c'est bientot fini !");
		System.out.println("");*/
		//ArrayList<Film> filmsTour4 = new ArrayList<>();
		//i = filmsTour3.size()-1;
			
		//tour3(filmsTour3, filmsTour4, i);
		
		
		
		
		//Tour final
		System.out.println("--------------------------------------------------------------");System.out.println("");
		System.out.println("Et voila le dernier choix a faire !");
		System.out.println("");System.out.println("--------------------------------------------------------------");
		
		//contre(filmsTour4.get(0), filmsTour4.get(1));
		
		contre(filmsTour3.get(0), filmsTour3.get(1));
		//Initialisation du scanner
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		//Conversion de la valeur input de String a int
		int choix = Integer.valueOf(input);
		
		choix(filmsTour3.get(0), filmsTour3.get(1), choix);
		
		if(choix == 1) {
			System.out.println("Visiblement, la description de "+filmsTour3.get(0).getNom() + " vous a convaincu, bon visionnage 👻");
		}
		if(choix == 2) {
			System.out.println("Visiblement, la description de "+filmsTour3.get(1).getNom() + " vous a convaincu, bon visionnage 👻");
		}
		
	}

	
	
	//Methode qui permet d'opposer 2 films
	public static void entete() {
		System.out.println(" 	  __    __ _ _     _ _             _             \n" + 
				"	 / / /\\ \\ (_) | __| (_)_ __   __ _| |_ ___  _ __ \n" + 
				"	 \\ \\/  \\/ / | |/ _` | | '_ \\ / _` | __/ _ \\| '__|\n" + 
				"	  \\  /\\  /| | | (_| | | | | | (_| | || (_) | |   \n" + 
				" 	   \\/  \\/ |_|_|\\__,_|_|_| |_|\\__,_|\\__\\___/|_|   \n" + 
				"                                                ");
		System.out.println("                            @@@\n" + 
				"                             @@@\n" + 
				"                              @@@\n "+
				"                              @@@\n" + 
				"                      @@@@@@@@@@@@@@@@@@@@@@\n" + 
				"                    @@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
				"                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
				"                @@@@@@@@ @@@@@@@@@@@@@@@@ @@@@@@@@\n" + 
				"              @@@@@@@@@   @@@@@@@@@@@@@@   @@@@@@@@@\n" + 
				"            @@@@@@@@@@     @@@@@@@@@@@@     @@@@@@@@@@\n" + 
				"           @@@@@@@@@@       @@@@  @@@@       @@@@@@@@@@\n" + 
				"           @@@@@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@@\n" + 
				"           @@@@@@@@@@@@@@@@@@        @@@@@@@@@@@@@@@@@@\n" + 
				"           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
				"           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
				"           @@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@\n" + 
				"            @@@@@@@@  @@ @@ @@ @@ @@ @@ @@ @  @@@@@@@@\n" + 
				"              @@@@@@@                        @@@@@@@\n" + 
				"                @@@@@@  @@ @@ @@ @@ @@ @@ @ @@@@@@\n" + 
				"                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
				"                    @@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
				"                      @@@@@@@@@@@@@@@@@@@@@@"
				);
		System.out.println("");
		System.out.println("Le but est de vous présenter une brève description d'un film ainsi que l'année de sortie de ce dernier");
		System.out.println("Plusieurs choix consécutifs vont amener à vous faire choisir parmis vos choix précédents pour vous ressortir un seul film !");
		System.out.println("Let's go ! 🎃");System.out.println("");
	}
	
	public static void contre(Film film1, Film film2) {
		System.out.println("Veuillez choisir un film parmis ces 2 choix:");
		System.out.println("1: " + film1.getDescription() + " "+film1.getAnnee());
		System.out.println("2: " + film2.getDescription() + " "+film2.getAnnee());

	}
	
	//Methode qui set l'etat du film en fonction du choix de l'utilisateur
	public static void choix(Film filmGauche, Film filmDroite,int choix) {
		filmGauche.setEtat(false);
		filmDroite.setEtat(false);
		while (choix!=1 && choix!=2) {
			System.out.println("Invalide, veuillez choisir 1 ou 2 ");
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			choix = Integer.valueOf(input);
		}
		if (choix == 1) {
			System.out.println("Vous avez choisis le premier film");
			System.out.println("");
			filmGauche.setEtat(true);
		}
		if (choix == 2) {
			System.out.println("Vous avez choisis le deuxieme film");
			System.out.println("");

		}
	}
	
	
	public static void tour1(ArrayList<Film> filmsDepart, ArrayList<Film> filmsTour2, int i) {
		while(i>0) {
			Random r = new Random();
			int rand1 = r.nextInt(filmsDepart.size());
			int rand2 = r.nextInt(filmsDepart.size());
			while(rand2 == rand1) {
				rand2 = r.nextInt(filmsDepart.size());
			}
			//Utilisation de la methode contre 
			contre(filmsDepart.get(rand1), filmsDepart.get(rand2));
			
			//Initialisation du scanner
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			
			//Retypage de la valeur input de String a int
			int choix = Integer.valueOf(input);
			
			//Utilisation de la methode choix
			choix(filmsDepart.get(rand1), filmsDepart.get(rand2), choix);
			
			if(filmsDepart.get(rand1).isEtat()) {
				filmsTour2.add(filmsDepart.get(rand1));
			}
			else {
				filmsTour2.add(filmsDepart.get(rand2));
			}
			filmsDepart.remove(rand1);
			if(rand1<rand2) {
				filmsDepart.remove(rand2-1);
			}else {
				filmsDepart.remove(rand2);
			}
			i-=2;
			System.out.println("");System.out.println("");
		}
	}
	
	public static void tour2(ArrayList<Film> filmsTour2, ArrayList<Film> filmsTour3, int i) {
		while(i>0) {
			Random r = new Random();
			int rand1 = r.nextInt(filmsTour2.size());
			int rand2 = r.nextInt(filmsTour2.size());
			while(rand2 == rand1) {
				rand2 = r.nextInt(filmsTour2.size());
			}
			//Utilisation de la methode contre 
			contre(filmsTour2.get(rand1), filmsTour2.get(rand2));
			
			//Initialisation du scanner
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			
			//Retypage de la valeur input de String a int
			int choix = Integer.valueOf(input);
			
			//Utilisation de la methode choix
			choix(filmsTour2.get(rand1), filmsTour2.get(rand2), choix);
			
			if(filmsTour2.get(rand1).isEtat()) {
				filmsTour3.add(filmsTour2.get(rand1));
			}
			else {
				filmsTour3.add(filmsTour2.get(rand2));
			}
			filmsTour2.remove(rand1);
			if(rand1<rand2) {
				filmsTour2.remove(rand2-1);
			}else {
				filmsTour2.remove(rand2);
			}
			i-=2;
		}
	}

	public static void tour3(ArrayList<Film> filmsTour3, ArrayList<Film> filmsTour4, int i) {
		while(i>0) {
			Random r = new Random();
			int rand1 = r.nextInt(filmsTour3.size());
			int rand2 = r.nextInt(filmsTour3.size());
			while(rand2 == rand1) {
				rand2 = r.nextInt(filmsTour3.size());
			}
			//Utilisation de la methode contre 
			contre(filmsTour3.get(rand1), filmsTour3.get(rand2));
			
			//Initialisation du scanner
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			
			//Retypage de la valeur input de String a int
			int choix = Integer.valueOf(input);
			
			//Utilisation de la methode choix
			choix(filmsTour3.get(rand1), filmsTour3.get(rand2), choix);
			
			if(filmsTour3.get(rand1).isEtat()) {
				filmsTour4.add(filmsTour3.get(rand1));
			}
			else {
			filmsTour4.add(filmsTour3.get(rand2));
			}
			filmsTour3.remove(rand1);
			if(rand1<rand2) {
				filmsTour3.remove(rand2-1);
			}else {
				filmsTour3.remove(rand2);
			}
			i-=2;
		}
	}


}
