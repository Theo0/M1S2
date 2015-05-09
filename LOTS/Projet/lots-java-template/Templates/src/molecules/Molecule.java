package molecules;
import java.util.Iterator;

import graphe.*;

public class Molecule extends Graphe<Molecule, Atome, Liaison> {

	public Molecule(){
		super();
		this.nomGraphe = "Molecule" + num;
	}

	public void afficherGraphe() {
		System.out.println("Molecule : " + this.nomGraphe);
		//Affichage des atomes
		System.out.print("Liste des atomes : " );
		Iterator<Atome> i = ListeSommets.iterator();
		while (i.hasNext()){
			Atome somm=i.next();
			System.out.print(" " + somm.getNom());
		}
		System.out.println("");
		//Affichage des liaisons
		System.out.print("Listes des liaisons : ");
		Iterator<Liaison> j = ListeAretes.iterator();
		while (j.hasNext()){
			Liaison a=j.next();
			System.out.print(" " + a.getNom() + " ( " + a.getNomSommetsLies() + ")");
		}
		
		System.out.println("\n");
	}

}
