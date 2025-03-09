package adapters.secondary.filePortReader.models;

/**
 * Classe réunissant les inforamtions d'une marée lors d'une journée
 *
 */
public class PortReaderMareeJour {
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
	 * Constructeur ne prenant aucun argument, qui seront set ensuite.
	 */
	public PortReaderMareeJour(){
		heuresPleineMer = new String[]{"--:--","--:--"};
		hauteursPleineMer = new String[]{"--","--"};
		heuresBasseMer = new String[]{"--:--","--:--"};
		hauteursBasseMer = new String[]{"--","--"};
		coefficient = new String[]{"--","--"};

		hauteursMer = new String[] {"--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--","--"};
	}
	/**
	 * Methode pour obtenir les heures de pleine mer
	 * 
	 * @return les heures de pleine mer
	 */
	public String[] getHeurePleineMer() {
		return heuresPleineMer;
	}

	/**
	 * Methode pour obtenir les hauteurs de la pleine mer
	 * 
	 * @return les hauteurs de la pleine mer
	 */
	public String[] getHauteurPleineMer() {
		return hauteursPleineMer;
	}

	/**
	 * Methode pour obtenir les heures de basse mer
	 * 
	 * @return les heures de basse mer
	 */
	public String[] getHeureBasseMer() {
		return heuresBasseMer;
	}

	/**
	 * Methode pour obtenir les hauteurs de la basse mer
	 * 
	 * @return les hauteurs de la basse mer
	 */
	public String[] getHauteurBasseMer() {
		return hauteursBasseMer;
	}

	/**
	 * Methode pour obtenir les coefficients
	 * 
	 * @return les coefficients
	 */
	public String[] getCoef() {
		return coefficient;
	}

	/**
	 * Methode pour obtenir les hauteurs de mer
	 * 
	 * @return les hauteurs de mer
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
