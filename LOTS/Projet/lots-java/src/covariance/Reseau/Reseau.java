package covariance.Reseau;

import covariance.Arete;
import covariance.Graph;
import covariance.Sommet;


public class Reseau extends Graph{
	public static int num = 0;
	
	public Reseau(){
		super();
		num++;
		this.nomGraphe = "Reseau" + num;
	}
	
	public void ajouterSommet(Sommet s){
		if(s instanceof Noeud){
			super.ajouterSommet((Noeud)s);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter que des atomes à une molécule");
		}
	}
	
	public void ajouterSommet(Noeud a){
		super.ajouterSommet(a);
	}
	
	public void ajouterArete(Arete a, Sommet s1, Sommet s2){
		if(a instanceof Lien && s1 instanceof Noeud && s2 instanceof Noeud){
			super.ajouterArete((Lien)a, (Noeud)s1, (Noeud)s2);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter que des Atomes et des liaisons à une molécule");
		}
	}
	
	public void ajouterArete(Lien l, Noeud a1, Noeud a2){
		super.ajouterArete(l, a1, a2);
	}
	
	public void supprimerArete(Arete a){
		if(a instanceof Lien){
			super.supprimerArete((Lien)a);
		}
	}
	
	public void supprimerArete(Lien l){
		super.supprimerArete(l);
	}
	
	public void supprimerSommet(Sommet s){
		if(s instanceof Noeud){
			super.supprimerSommet(s);
		}
	}
	
	public void supprimerSommet(Noeud a){
		super.supprimerSommet(a);
	}
}
