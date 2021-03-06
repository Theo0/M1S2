package covariance;

import covariance.Chimie.Atome;
import covariance.Chimie.Liaison;
import covariance.Chimie.Molecule;

public class Main {

	public static void main(String[] args) {
		
		Graph g1 = new Graph();
		Sommet s1 = new Sommet();
		Sommet s2 = new Sommet();
		Arete a = new Arete();
	
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
	}

}
