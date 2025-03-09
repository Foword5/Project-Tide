package domain.Entity;

/**
 * Classe réunissant les inforamtions d'une marée lors d'une journée
 *
 */
public class MareeJour {
	/**
	 * Liste des heures des deux possibles pleine mer de la journ�e
	 */
	private String[] heuresPleineMer = new String[2];
	/**
	 * Liste des hauteur de mer des deux possibles pleine mer de la journ�e
	 */
	private String[] hauteursPleineMer = new String[2];

	/**
	 * Liste des heures des deux possibles basse mer de la journ�e
	 */
	private String[] heuresBasseMer = new String[2];
	/**
	 * Liste des hauteur de mer des deux possibles basse mer de la journ�e
	 */
	private String[] hauteursBasseMer = new String[2];

	/**
	 * Liste des deux possibles coefficient de la journ�e
	 */
	private String[] coefficient = new String[2];

	/**
	 * Liste des hauteurs de mer pour chaques heures
	 */
	private String[] hauteursMer = new String[24];

	/**
	 * Constructeur prenant tout les attributs
	 * 
	 * @param parHeuresPleineMer Liste des heures des deux possibles pleine mer de la journ�e
	 * @param parHauteursPleineMer Liste des hauteur de mer des deux possibles pleine mer de la journ�e
	 * @param parHeuresBasseMer Liste des heures des deux possibles basse mer de la journ�e
	 * @param parHauteursBasseMer Liste des hauteur de mer des deux possibles basse mer de la journ�e
	 * @param parCoefficient Liste des deux possibles coefficient de la journ�e
	 * @param parHauteursMer Liste des hauteurs de mer pour chaques heures
	 */
	public MareeJour(String[] parHeuresPleineMer,String[] parHauteursPleineMer, String[] parHeuresBasseMer, String[] parHauteursBasseMer, String[] parCoefficient, String[] parHauteursMer){
		heuresPleineMer = parHeuresPleineMer;
		hauteursPleineMer = parHauteursPleineMer;
		heuresBasseMer = parHeuresBasseMer;
		hauteursBasseMer = parHauteursBasseMer;
		coefficient = parCoefficient;
		hauteursMer = parHauteursMer;
	}

	/**
	 * Constructeur ne prenant pas la liste des hauteurs de mer
	 * 
	 * @param parHeuresPleineMer Liste des heures des deux possibles pleine mer de la journ�e
	 * @param parHauteursPleineMer Liste des hauteur de mer des deux possibles pleine mer de la journ�e
	 * @param parHeuresBasseMer Liste des heures des deux possibles basse mer de la journ�e
	 * @param parHauteursBasseMer Liste des hauteur de mer des deux possibles basse mer de la journ�e
	 * @param parCoefficient Liste des deux possibles coefficient de la journ�e
	 */
	public MareeJour(String[] parHeuresPleineMer,String[] parHauteursPleineMer, String[] parHeuresBasseMer, String[] parHauteursBasseMer, String[] parCoefficient) {
		heuresPleineMer = parHeuresPleineMer;
		hauteursPleineMer = parHauteursPleineMer;
		heuresBasseMer = parHeuresBasseMer;
		hauteursBasseMer = parHauteursBasseMer;
		coefficient = parCoefficient;

		hauteursMer = new String[] {"--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--"};
	}

	/**
	 * Constructeur ne prenant que la liste des hauteurs de mer
	 * 
	 * @param parHauteursMer
	 */
	public MareeJour(String[] parHauteursMer){
		heuresPleineMer = new String[]{"--:--","--:--"};
		hauteursPleineMer = new String[]{"--","--"};
		heuresBasseMer = new String[]{"--:--","--:--"};
		hauteursBasseMer = new String[]{"--","--"};
		coefficient = new String[]{"--","--"};

		hauteursMer = parHauteursMer;
	}

	/**
	 * Constructeur ne prenant aucun argument, qui seront set ensuite.
	 */
	public MareeJour(){
		heuresPleineMer = new String[]{"--:--","--:--"};
		hauteursPleineMer = new String[]{"--","--"};
		heuresBasseMer = new String[]{"--:--","--:--"};
		hauteursBasseMer = new String[]{"--","--"};
		coefficient = new String[]{"--","--"};

		hauteursMer = new String[] {"--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--"};
	}

	/**
	 * Method toString de la classe
	 * 
	 * @return le string
	 */
	public String toString(){
		return "Heure (PM) : " + heuresPleineMer[0] + " ; hauteur (PM) : " + hauteursPleineMer[0] + 
				" ; coef. (PM) : " + coefficient[0] + " ; Heure (PM) : " + heuresPleineMer[1]+ " ; hauteur (PM) : " + hauteursPleineMer[1] +
				" ; coef (PM) : " + coefficient[1] + " ; Heure (BM) : " + heuresBasseMer[0] + " ; hauteur (BM) : " + hauteursBasseMer[0] +
				 " ; Heure (BM) : " + heuresBasseMer[1] + " ; hauteur (BM) : " + hauteursBasseMer[1];
	}
	
	/**
	 * Methode pour obtenir les heures de pleine mer
	 * 
	 * @return les heures de pleine mer
	 */
	public String[] getHeuresPleineMer() {
		return heuresPleineMer;
	}

	/**
	 * Methode pour obtenir les hauteurs de pleine mer
	 * 
	 * @return les hauteurs de pleine mer
	 */
	public String[] getHauteursPleineMer() {
		return hauteursPleineMer;
	}

	/**
	 * Methode pour obtenir les heures de basse mer
	 * 
	 * @return les heures de basse mer
	 */
	public String[] getHeuresBasseMer() {
		return heuresBasseMer;
	}

	/**
	 * Methode pour obtenir les hauteurs de basse mer
	 * 
	 * @return les hauteurs de basse mer
	 */
	public String[] getHauteursBasseMer() {
		return hauteursBasseMer;
	}

	/**
	 * Methode pour obtenir les coefficients
	 * 
	 * @return les coefficients
	 */
	public String[] getCoefficients() {
		return coefficient;
	}

	/**
	 * Metode pour obtenir une hauteur de mer � l'heure de son choix
	 * 
	 * @param heure l'heure
	 * @return la hauteur
	 */
	public String[] getHauteurs() {
		return hauteursMer;
	}

	/**
	 * Methode pour d�finir les heures de pleine mer
	 * 
	 * @param heure les heures � d�finir
	 */
	public void setHeurePleineMer(String[] heure) {
		heuresPleineMer = heure;
	}

	/**
	 * Methode pour d�finir les hauteurs de la pleine mer
	 * 
	 * @param hauteurs les hauteurs � d�finir
	 */
	public void setHauteurPleineMer(String[] hauteurs) {
		hauteursPleineMer = hauteurs;
	}

	/**
	 * Methode pour d�finir les heures de basse mer
	 * 
	 * @param heure les heures � d�fnir
	 */
	public void setHeureBasseMer(String[] heure) {
		heuresBasseMer = heure;
	}

	/**
	 * Methode pour d�finir la hauteur de la pleine mer de son choix
	 * 
	 * @param hauteurs les hauteurs � d�finir
	 */
	public void setHauteurBasseMer(String[] hauteurs) {
		hauteursBasseMer = hauteurs;
	}
	/**
	 * Methode pour d�finir les coeficients
	 * 
	 * @param coef num�ro du coeficient
	 */
	public void setCoef(String[] coef) {
		coefficient = coef;
	}

	/**
	 * Metode pour d�finir les hauteurs de mer
	 * 
	 * @param hauteurs les hauteurs
	 */
	public void setAllHauteur(String[] hauteurs) {
		hauteursMer = hauteurs;
	}
	
	/**
	 * Metode pour d�finir une hauteur de mer
	 * 
	 * @param heure l'heure
	 * @param hauteur l'hauteur
	 */
	public void setHauteur(int heure, String hauteur) {
		hauteursMer[heure] = hauteur;
	}
}
