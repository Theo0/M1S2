package covariance.Chimie;

import covariance.Arete;
import covariance.Graph;
import covariance.Sommet;

public class Atome extends Sommet {
	
	public Atome(){
		super();
	}
	
	public void setGraphe(Graph g){
		if(g instanceof Molecule){
		setGraphe((Molecule)g);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter que des Atome a une molecule");
		}
	}
	
	public void setGraphe(Molecule m){
		super.setGraphe(m);
	}
	
	public void addArete(Arete a){
		if(a instanceof Liaison){
			addArete((Liaison)a);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter que des Liaison a une molecule");
		}
	}
	
	public void addArete(Liaison l){
		super.addArete(l);
	}
}
