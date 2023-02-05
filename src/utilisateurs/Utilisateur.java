package utilisateurs;

import localisations.Localisation;

public class Utilisateur {
	
	private Profil p;
	 	private Localisation localisation;
	 	private String dateInscription;
	 	private TypeUtilisateur type;
	 	private Boolean estConnecte;
	 	
	 	
	 	public Utilisateur(String nom, String prenom, String adrMail, String mdp, String
	 			numTel, Localisation loc, String dh, TypeUtilisateur type)
	 	{
	 		
	 		Profil.nom = nom;
	 		Profil.prenom = prenom;
	 		Profil.adrMail = adrMail;
	 		Profil.mdp = mdp;
	 		Profil.numTel = numTel;
	 		
	 		this.localisation = loc;
	 		this.dateInscription = dh;
	 		
	 		this.type = type;
	 		
	 		
	 		
	 		
	 	}

	 	public Utilisateur(Profil p, Localisation loc, String dh, TypeUtilisateur type) 
	 	{
	 		this.p = p;
	 		this.localisation = loc;
	 		this.dateInscription = dh;
	 		this.type = type;
	 		
	 		
	 	}
	 	
	 	
	 	public Profil getProfil()
	 	{
	 		return this.p;
	 	}
	 	
	 	public Localisation getLocalisation()
	 	{
	 		return this.localisation;
	 	}
	 	
	 	public String getDateInscription()
	 	{
	 		return this.dateInscription;
	 	}
	 	
	 	@Override
		public String toString() {
			return "Utilisateur [p=" + p + ", localisation=" + localisation + ", dateInscription=" + dateInscription
					+ ", type=" + type + ", estConnecte=" + estConnecte + "] \n";
		}

		public TypeUtilisateur getTypeUtilisateur()
	 	{
	 		return this.type;
	 	}
	 	
	 	public Boolean getEstConnecte()
	 	{
	 		return this.estConnecte;
	 	}
	 	
	 	public void setEstConnecte(Boolean estConnecte)
	 	{
	 		this.estConnecte = estConnecte ; 
	 	}
	 	
	 	
	 	
	 	
	 	

}
