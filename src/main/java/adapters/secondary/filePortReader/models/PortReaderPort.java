package adapters.secondary.filePortReader.models;

public class PortReaderPort {
	/**
	 * Nom du port
	 */
	private String nom;

	/**
	 * Tableau à deux dimmensions des MareeJour
	 */
	private PortReaderMareeJour[][] marees = new PortReaderMareeJour[12][31];

	/**
	 * Constructeur de la classe Port
	 * 
	 * @param parNom nom du port
	 */
	public PortReaderPort(String parNom) {
		nom = parNom;
		for(int i=0;i<marees.length;i++) {
			for(int j=0;j<marees[i].length;j++) {
				marees[i][j] = new PortReaderMareeJour();
			}
		}
	}

	/**
	 * Methode toString de la classe
	 * 
	 * @return le nom du port
	 */
	public String toString(){
		return nom;
	}

	/**
	 * Methode pour d�finir une valeurs du tableau
	 */
	public void setJour(int jour, int mois, PortReaderMareeJour mareeJour) {
		marees[mois-1][jour-1] = mareeJour;
	}

	/**
	 * Methode pour d�finir une ligne du tableau
	 */
	public void setMois(int mois, PortReaderMareeJour[] mareeJour) {
		marees[mois-1] = mareeJour;
	}

	/**
	 * Methode pour definir la hauteur d'une heure pr�cise
	 * 
	 * @param jour le jour
	 * @param mois le mois
	 * @param heure l'heure
	 * @param hauteur la hauteur
	 */
	public void setHauteur(int jour, int mois, int heure, String hauteur) {
		marees[mois-1][jour-1].setHauteur(heure,hauteur);
	}

	/**
	 * Methode pour obtenir une valeurs du tableau
	 * 
	 * @param jour le jour
	 * @param mois le mois
	 * @return la MareeJour
	 */
	public PortReaderMareeJour getValue(int jour,int mois){
		return marees[mois-1][jour-1];
	}
}
