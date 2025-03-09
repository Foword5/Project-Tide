package adapters.primary.ui.models;

import java.util.TreeSet;

import java.util.Collection;

public class UiCalendrierDuMois {
	  /**
	   * 
	   */
	  private Collection <UiDate> treeSetDate;	  
	  
	  /**
	   * pour connaitre le calendrier d'un mois 
	   * @param mois
	   * @param annee
	   */
	  public UiCalendrierDuMois ( int mois, int annee) {			   
		    treeSetDate = new TreeSet <UiDate> ();
		    UiDate date = new UiDate (1,mois,annee);
		    int indiceJour = date.getJourSemaine() ;
		    for (int x = indiceJour ; x!=0 ; x--) {	    	 
		    	treeSetDate.add(date);	    	
		    	date = date.dateDeLaVeille();
		    }	    
		    date = new UiDate (2,mois,annee);
		    indiceJour = indiceJour % 7 ;
		    while (date.getMois () == mois) {
		      while(indiceJour<7) {
		    	treeSetDate.add(date);
		    	date = date.dateDuLendemain();
		    	indiceJour++ ;
		      } 
		      indiceJour=0;
		    }    
		  }
	/**
	 * retourn une collection de date  
	 * @return
	 */
	public Collection <UiDate> getDates() {	
		return treeSetDate;	
	}	
	/**
	 * retourn un string de la collection
	 */
	public String toString () {
		return treeSetDate.toString();
	}
	    
}