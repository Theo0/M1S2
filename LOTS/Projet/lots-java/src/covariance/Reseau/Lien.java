package covariance.Reseau;

import covariance.Arete;
import covariance.Graph;
import covariance.Sommet;

public class Lien extends Arete{
	
	public Lien(){
		super();
	}
	
	public void setSommets(Sommet s1, Sommet s2){
		if(s1 instanceof Noeud && s2 instanceof Noeud){
			setSommets((Noeud)s1, (Noeud)s2);
		}else{
			System.out.println("ERREUR : On ne peut ajouter une liaison qu'a une molecule et des atomes");
		}
	}
	
	public void setSommets(Noeud a1, Noeud a2){
		super.setSommets(a1, a2);
	}
	
	public void setGraphe(Graph g){
		if(g instanceof Reseau){
			setGraphe((Reseau)g);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter une liaison qu'a une molecule et des atomes");
		}
	}	
	
	public void setGraphe(Reseau m){
		super.setGraphe(m);
	}

}
