package domain.entity;

import domain.constant.Constantes;

public class Date implements Constantes{
	/**
	 * Le jour
	 */
	private int jour;
	/**
	 * Le mois
	 */
	private int mois;
	/**
	 * L'année
	 */
	private int annee;
	
	/**
	 * Constructeur de la classe Date
	 * 
	 * @param parJour le jour
	 * @param parMois le mois 
	 * @param parAnnee l'annee
	 */
	public Date(int parJour, int parMois, int parAnnee) {
		jour = parJour;
		mois = parMois;
		annee = parAnnee;
	}

	/**
	 * Methode pour obtenir l'ann�e
	 * 
	 * @return l'ann�e
	 */
	public int getAnnee() { 
		return annee;
	}
	
	/**
	 * Methode pour obtenir le jour
	 * 
	 * @return le jour
	 */
	public int getJour() { 
		return jour;
	}

	/**
	 * Methode pour obtenir le mois
	 * 
	 * @return le mois
	 */
	public int getMois() { 
		return mois;
	}
}