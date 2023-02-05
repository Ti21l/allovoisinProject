package allovoisins;


import localisations.Localisation;

import utilisateurs.Profil;
import utilisateurs.TypeUtilisateur;
import utilisateurs.Utilisateur;


public class Tests {
	
	public static void main(String args [])
	{
		//Tests Localisation 
		
		Localisation locTest = new Localisation("Mallemorrrt","13380","50 rue bellevue");
		
		System.out.println(locTest);
		
		locTest = Localisation.modifierLoc("Mallemort","13370","52 rue bellevue");
		
		System.out.println(locTest);
		
		// Tests Profils
		
		Profil profilTest = new Profil("Layeux","Titouan","titouan@mail.com","1234","06 00 00 00 00");
		
		System.out.println(profilTest);
		System.out.println(profilTest.getNumTel());
		System.out.println(profilTest.getMdp());
		
		
		System.out.println(profilTest.getIdentite());
		
		//tests setters
		
		profilTest.setAdrMail("titouanl@gmail.com");
		profilTest.setMdp("12345");
		profilTest.setNumTel("06 12 34 56 78");
		
		System.out.println(profilTest);
		
		System.out.println(profilTest.getNumTel());
		System.out.println(profilTest.getMdp());
		
		//tests Utilisateurs
		
		Utilisateur userTest = new Utilisateur(profilTest.nom,profilTest.prenom,profilTest.adrMail,profilTest.mdp,profilTest.numTel,locTest,
								"2023/02/05 14:02:11" , TypeUtilisateur.particulier );
		
		Utilisateur userTest2 = new Utilisateur(profilTest,locTest,"2023/02/05 14:02:11",TypeUtilisateur.independant);
		
		
		System.out.println(userTest );
		System.out.println(userTest2 );
		
		userTest.setEstConnecte(true);
		userTest.setEstConnecte(false);
		
		System.out.println(userTest );
		System.out.println(userTest2 );
		
		
		
		
		
		
		
		
		
	}

	
}


