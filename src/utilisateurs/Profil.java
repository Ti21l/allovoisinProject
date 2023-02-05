package utilisateurs;

public class Profil {
	
	public static String nom;
	public static String prenom;
	public static String adrMail;
	public static String mdp;
	public static String numTel;
	
	public Profil( String nom,String prenom, String adrMail , String mdp , String numTel)
	{
		Profil.nom = nom;
		Profil.prenom = prenom;
		Profil.adrMail = adrMail;
		Profil.mdp = mdp ; 
		Profil.numTel = numTel;
		
	}
	
	
	public static String getNom() {
		return nom;
	}
	
	public static String getPrenom() {
		return prenom;
	}
	
	public static String getAdrMail() {
		return adrMail;
	}
	
	public static String getMdp() {
		return mdp;
	}
	
	public static String getNumTel() {
		return numTel;
	}
	
	public void setAdrMail(String adrMail)
	{
		Profil.adrMail= adrMail;
	}

	public  void setMdp(String mdp)
	{
		Profil.mdp = mdp;
	}
	
	public void setNumTel(String numTel)
	{
		Profil.numTel = numTel;
		
	}
	
	public String getIdentite()
	{
		return " Prénom : " + Profil.prenom + " Nom  : " + Profil.nom;
	}


	@Override
	public String toString() {
		return "Profil : [ " + getIdentite() +  " , adrMail = " + adrMail+ "]";
	}
	

}
