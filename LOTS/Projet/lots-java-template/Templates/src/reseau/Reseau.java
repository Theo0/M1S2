package reseau;
import java.util.Iterator;

import graphe.*;

public class Reseau extends Graphe<Reseau, Noeud, Lien> {

	public Reseau(){
		super();
		this.nomGraphe = "Reseau" + num;
	}

	public void afficherGraphe() {
		System.out.println("Reseau : " + this.nomGraphe);
		//Affichage des atomes
		System.out.print("Liste des noeuds : " );
		Iterator<Noeud> i = ListeSommets.iterator();
		while (i.hasNext()){
			Noeud somm=i.next();
			System.out.print(" " + somm.getNom());
		}
		System.out.println("");
		//Affichage des liaisons
		System.out.print("Listes des liens : ");
		Iterator<Lien> j = ListeAretes.iterator();
		while (j.hasNext()){
			Lien a=j.next();
			System.out.print(" " + a.getNom() + " ( " + a.getNomSommetsLies() + ")");
		}
		
		System.out.println("\n");
	}

}
