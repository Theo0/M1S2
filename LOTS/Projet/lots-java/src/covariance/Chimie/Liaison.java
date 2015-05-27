package covariance.Chimie;

import covariance.Arete;
import covariance.Graph;
import covariance.Sommet;

public class Liaison extends Arete{
	public static int num = 0;
	public Liaison(){
		super();
		num++;
		this.nomArete = "Liaison" + num;
	}
	
	public void setSommets(Sommet s1, Sommet s2){
		if(s1 instanceof Atome && s2 instanceof Atome){
			setSommets((Atome)s1, (Atome)s2);
		}else{
			System.out.println("ERREUR : On ne peut ajouter une liaison qu'a une molecule et des atomes");
		}
	}
	
	public void setSommets(Atome a1, Atome a2){
		super.setSommets(a1, a2);
	}
	
	public void setGraphe(Graph g){
		if(g instanceof Molecule){
			setGraphe((Molecule)g);
		}
		else{
			System.out.println("ERREUR : On ne peut ajouter une liaison qu'a une molecule et des atomes");
		}
	}	
	
	public void setGraphe(Molecule m){
		super.setGraphe(m);
	}

}
