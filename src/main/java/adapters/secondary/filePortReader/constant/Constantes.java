package adapters.secondary.filePortReader.constant;

import java.util.TreeMap;

public interface Constantes {

	final String LIEN_FICHIERS_PAYANY = "src/main/resources/data/Payante";

	final String LIEN_FICHIERS_GRATUIT = "src/main/resources/data/Gratuite";
	
	final String LIEN_FICHIERS_SAUVEGARDE = "src/main/resources/data/Save/Ports";

	/**
	 * Les ports ainsi que le liens pour y accéder (uniquement les donn�es payantes)
	 */
	@SuppressWarnings("serial")
	public final TreeMap<String, String> PORT_PAYANT = new TreeMap<String, String>() {{
		put("Audierne", "AUDIERNE_2021_legal");
		put("Boucan-Bayonne", "BOUCAU-BAYONNE_2021_legal");
		put("Brest", "BREST_2021_legal");
		put("Dunkerque", "DUNKERQUE_2021_legal");
		put("Entrée de la baie de Somme", "ENTREE_BAIE_DE_SOMME_2021_legal");
		put("Fort de France", "FORT-DE-FRANCE_2021_local");
		put("Granville,	 le Cocaleu", "GRANVILLE_LE_COCALEU_2021_legal");
		put("Ile Miquelon", "ILE_MIQUELON_2021_local");
		put("Le Palais", "LE_PALAIS_2021_legal");
		put("Paimpol", "PAIMPOL_2021_legal");
		put("Papeet, Fare Ute", "PAPEETE_FARE-UTE_2021_local");
		put("Pointe-à-pitre", "POINTE-A-PITRE_2021_local");
		put("Roscoff", "ROSCOFF_2021_legal");
		put("Saint-Malo", "SAINT-MALO_2021_legal");
		put("Saint-Martin", "SAINT-MARTIN_DE_RE_2021_legal");
		put("Saint-Nazaire", "SAINT-NAZAIRE_2021_legal");
		put("Toulon", "TOULON_2021_local");
	}};
	
	@SuppressWarnings("serial")
	public final TreeMap<String, String> PORT_GRATUIT = new TreeMap<String, String>() {{
		put("Saint-Nazaire", "saint-nazaire-2021");
		put("Herbaudiére","herbaudiere-2021");
	}};
}