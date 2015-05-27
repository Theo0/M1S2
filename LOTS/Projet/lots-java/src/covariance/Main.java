package covariance;

import covariance.Chimie.Atome;
import covariance.Chimie.Liaison;
import covariance.Chimie.Molecule;
import covariance.Reseau.Lien;
import covariance.Reseau.Noeud;
import covariance.Reseau.Reseau;

public class Main {

	public static void main(String[] args) {
		
		Reseau g1 = new Reseau();
		Noeud s1 = new Noeud();
		Noeud s2 = new Noeud();
		Lien a = new Lien();
	
		g1.ajouterSommet(s1);
		g1.ajouterSommet(s2);
		g1.ajouterArete(a, s1, s2);
		g1.afficherGraphe();
		
		
		Molecule g2 = new Molecule();
		Atome a1 = new Atome();
		Atome a2 = new Atome();
		Liaison l = new Liaison();
		
		g2.ajouterSommet(a1);
		g2.ajouterSommet(a2);
		g2.ajouterArete(l, a1, a2);
		g2.afficherGraphe();
		
		g1.supprimerArete(a);
		g1.afficherGraphe();
		
		
		/////////////////////
		//CHIMERE
		
		Reseau g3 = new Reseau();
		Noeud s5 = new Noeud();
		Atome a6 = new Atome();
		Lien ll = new Lien();
		
		g3.ajouterSommet(s5);
		g3.ajouterSommet(a6);
		g3.ajouterArete(ll, s5, a6);
		g3.afficherGraphe();
		
	}

}
