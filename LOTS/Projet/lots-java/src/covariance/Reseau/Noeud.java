package covariance.Reseau;

import covariance.Arete;
import covariance.Graph;
import covariance.Sommet;

public class Noeud extends Sommet {
	
	public Noeud(){
		super();
	}
	
	public void setGraphe(Graph g){
		if(g instanceof Reseau){
		setGraphe((Reseau)g);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter que des Noeuds a un Reseau");
		}
	}
	
	public void setGraphe(Reseau m){
		super.setGraphe(m);
	}
	
	public void addArete(Arete a){
		if(a instanceof Lien){
			addArete((Lien)a);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter que des Liens a un Reseau");
		}
	}
	
	public void addArete(Lien l){
		super.addArete(l);
	}
}
