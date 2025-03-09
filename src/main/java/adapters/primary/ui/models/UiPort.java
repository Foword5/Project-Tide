package adapters.primary.ui.models;

public class UiPort{
	/**
	 * Nom du port
	 */
	private String nom;

	/**
	 * Constructeur de la classe Port
	 * 
	 * @param parNom nom du port
	 */
	public UiPort(String parNom) {
		nom = parNom;
	}

	/**
	 * Methode toString de la classe
	 * 
	 * @return le nom du port
	 */
	public String toString(){
		return nom;
	}
}
