package covariance.Chimie;

import covariance.Arete;
import covariance.Graph;
import covariance.Sommet;

public class Molecule extends Graph{
	
	public Molecule(){
		super();
	}
	
	public void ajouterSommet(Sommet s){
		if(s instanceof Atome){
			super.ajouterSommet((Atome)s);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter que des atomes à une molécule");
		}
	}
	
	public void ajouterSommet(Atome a){
		super.ajouterSommet(a);
	}
	
	public void ajouterArete(Arete a, Sommet s1, Sommet s2){
		if(a instanceof Liaison && s1 instanceof Atome && s2 instanceof Atome){
			super.ajouterArete((Liaison)a, (Atome)s1, (Atome)s2);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter que des Atomes et des liaisons à une molécule");
		}
	}
	
	public void ajouterArete(Liaison l, Atome a1, Atome a2){
		super.ajouterArete(l, a1, a2);
	}
	
	public void supprimerArete(Arete a){
		if(a instanceof Liaison){
			super.supprimerArete((Liaison)a);
		}
	}
	
	public void supprimerArete(Liaison l){
		super.supprimerArete(l);
	}
	
	public void supprimerSommet(Sommet s){
		if(s instanceof Atome){
			super.supprimerSommet(s);
		}
	}
	
	public void supprimerSommet(Atome a){
		super.supprimerSommet(a);
	}
}
