package adapters.primary.ui.models;

import adapters.primary.ui.constant.Constantes;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UiDate implements Comparable <UiDate>,Constantes,Serializable{
	private static final long serialVersionUID = 1L;
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
	 * Le jour de la semaine
	 */
	private int jourSemaine ;
	
	/**
	 * Constructeur de la classe Date
	 * 
	 * @param parJour le jour
	 * @param parMois le mois 
	 * @param parAnnee l'annee
	 */
	public UiDate(int parJour, int parMois, int parAnnee) {
		jour = parJour;
		mois = parMois;
		annee = parAnnee;
		
		GregorianCalendar date = new GregorianCalendar (annee,mois-1,jour);
		jourSemaine = date.get (Calendar.DAY_OF_WEEK);		
		if (jourSemaine == 1)
			jourSemaine = 7;
		else jourSemaine -= 1; 
	}
	
	/**
	 * Constructeur sans parametre, qui réfère à la date d'aujourd'hui
	 */
	public UiDate() { 
		GregorianCalendar dateAuj = new GregorianCalendar ();
//		annee = dateAuj.get (Calendar.YEAR);
		annee = 2021;
		mois = dateAuj.get (Calendar.MONTH) + 1; 
		jour = dateAuj.get (Calendar.DAY_OF_MONTH);
		jourSemaine = dateAuj.get (Calendar.DAY_OF_WEEK);
		if (jourSemaine == 1)
			jourSemaine = 7;
		else jourSemaine -= 1; 
	}
	
	/**
	 * Methode de comparaison
	 * retourne 0 si this et parDate sont égales,
	 * -1 si this pr�c�de parDate,
	 *  1 si parDate pr�c�de this
	 */
	public int compareTo (UiDate parDate) {
		if (annee < parDate.annee)
			return -1;
		if (annee > parDate.annee)
			return 1;
		// les ann�es sont =
		if (mois < parDate.mois)
			return -1;
		if (mois > parDate.mois)
			return 1;
		// les mois sont =
		if (jour < parDate.jour)
			return -1;
		if (jour > parDate.jour)
			return 1;
		return 0;	
	}
	
	/**
	 * Methode pour savoir si une date est aujord'hui
	 * 
	 * @return true si oui et false si non
	 */
	public boolean isToday() {
		if(this.compareTo(new UiDate()) == 0) return true;
		else return false;
	}
	
	/**
	 * Methode pour obtenir la date du lendemain
	 * 
	 * @return la date du lendemain
	 */
	public UiDate dateDuLendemain ()   {	
		if (jour < dernierJourDuMois(mois,annee))
			return  new UiDate (jour+1,mois,annee);
		else if (mois < 12)
			return new UiDate (1,mois+1,annee);
		else return new UiDate (1,1,annee+1);	
	}  

	/**
	 * Methode pour obtenir la date de la veille
	 * 
	 * @return la date de la veille
	 */
	public UiDate dateDeLaVeille () {    
		if (jour > 1)
			return  new UiDate (jour-1,mois,annee);
		else if (mois > 1)
			return new UiDate (UiDate.dernierJourDuMois(mois-1, annee),mois-1,annee);
		else return  new UiDate (31,12,annee-1);
	}

	/**
	 * Methode pour avoir le dernier jour d'un mois
	 * 
	 * @param parMois le mois
	 * @param parAnnee l'ann�e
	 * @return le jour
	 */
	public static int dernierJourDuMois (int parMois, int parAnnee) {
		switch (parMois) {
		case 2 : if (estBissextile (parAnnee))  return 29 ; else return 28 ;  
		case 4 : 	 case 6 : 	 case 9 : 	 case 11 : return 30 ;
		default : return 31 ;
		}  // switch
	} 

	/**
	 * Methode pour savoir si une ann�e est bissextile
	 * 
	 * @param parAnnee l'ann�e
	 * @return un boolean
	 */
	private static boolean estBissextile(int parAnnee) {
		return parAnnee % 4 == 0 && (parAnnee % 100 != 0 || parAnnee % 400 == 0);
	}
	
	/**
	 * Methode toString
	 */
	public String toString() {
		String[] nomMois = new String[] {"janvier", "février","mars","avril","mai","juin","juillet", "août","septembre","octobre","novembre","décembre"};
		String [] nomJour = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
		
		
		return nomJour[jourSemaine-1] + " " + jour + " " + nomMois[mois-1] + " " + annee;
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
	
	/**
	 * Methode pour obtenir le jour de la semaine
	 * 
	 * @return le jour de la semaine
	 */
	public int getJourSemaine () {
		return jourSemaine;
	}
}