import molecules.*;
import reseau.*;

public class Main {

	public static void main(String[] args) {
		Molecule g2 = new Molecule();
		Atome a1 = new Atome();
		Atome a2 = new Atome();
		Atome a3 = new Atome();
		Atome a4 = new Atome();
		
		Liaison l = new Liaison();
		Liaison l2 = new Liaison();
		
		g2.ajouterSommet(a1);
		g2.ajouterSommet(a2);
		g2.ajouterSommet(a3);
		g2.ajouterSommet(a4);
		g2.ajouterArete(l, a1, a2);
		g2.ajouterArete(l2, a3, a4);
		g2.afficherGraphe();
		
		///////////////////////////////////
		
		Reseau r1 = new Reseau();
		Noeud n1 = new Noeud();
		Noeud n2 = new Noeud();
		
		Lien l3 = new Lien();
		
		r1.ajouterSommet(n1);
		r1.ajouterSommet(n2);
		r1.ajouterArete(l3, n1, n2);
		
		r1.afficherGraphe();
		
		
		////////////////////////////////////
		
		/*CHIMERE
		Reseau r2 = new Reseau();
		Noeud n3 = new Noeud();
		Atome a5 = new Atome();
		Lien l4 = new Lien();
		
		r2.ajouterSommet(n3);
		r2.ajouterSommet(a5);
		r2.ajouterArete(l4, n3, a5);
		
		r2.afficherGraphe();
		*/
		

	}

}
