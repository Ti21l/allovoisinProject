package localisations;

public class Localisation {
	
	public static String ville;
	public static String codePostal;
	public static String adresse;
	
	
	public Localisation(String ville ,String codePostal,String adresse)
	{
		Localisation.ville = ville;
		Localisation.codePostal = codePostal;
		Localisation.adresse= adresse;
		
		
	}

	
	public static Localisation modifierLoc(String ville ,String codePostal,String adresse)
	{
		Localisation.ville = ville ;
		Localisation.codePostal = codePostal;
		Localisation.adresse= adresse;
		
		Localisation Localisation = new Localisation(ville,codePostal,adresse);
		return Localisation;
	}
	

	@Override
	public String toString() {
		return "Localisation [ville=" + ville + ", codePostal=" + codePostal + ", adresse=" + adresse + "]";
	}
	
	


}
