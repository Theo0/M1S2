package reseau;

import graphe.*;

public class Noeud extends Sommet<Reseau,Noeud,Lien>{

	public Noeud(){
		super();
		this.nomSommet = "Noeud" + num;
	}
}
