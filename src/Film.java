
public class Film {
	
		//Attributs

		private String nom;
		private String description;
		private int annee;
		private boolean etat;
		
		//Constructeur
		public Film(String nom, String description, int annee) {
			this.nom = nom;
			this.description = description;
			this.annee = annee;
			this.etat = false;
		}
		
		
		//Methodes

		
		
		
		
		
		
		
		//Getter & Setter

		public boolean isEtat() {
			return etat;
		}

		public void setEtat(boolean etat) {
			this.etat = etat;
		}

		public String getNom() {
			return this.nom;
		}
		
		public String getDescription() {
			return description;
		}

		public int getAnnee() {
			return annee;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setAnnee(int annee) {
			this.annee = annee;
		}


}
