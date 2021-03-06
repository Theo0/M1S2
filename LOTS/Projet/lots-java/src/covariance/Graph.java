package covariance;

import java.util.ArrayList;
import java.util.Iterator;

public class Graph extends Racine {
	
	protected String nomGraphe;
	protected ArrayList<Sommet> ListeSommets;
	protected ArrayList<Arete> ListeAretes;
	public static int num = 0;
	
	public Graph(){
		num++;
		this.nomGraphe = "Graphe" + num;
		this.ListeSommets = new ArrayList<Sommet>();
		this.ListeAretes = new ArrayList<Arete>();
	}
	
	public Graph(String n){
		this.nomGraphe = n;
		this.ListeSommets = new ArrayList<Sommet>();
		this.ListeAretes = new ArrayList<Arete>();
	}
	
	public String toString(){
		return "Sommets : " + ListeSommets.size() + "     aretes : " + ListeAretes.size();
	}
	
	public void ajouterSommet(Sommet s){
 	
 		
 		if(!ListeSommets.contains(s)){
 			ListeSommets.add(s);
 			s.setGraphe(this);
 		}
 		else{
 			System.out.println("Sommet : " + s + "déjà présent dans le graphe " + this);
 		}
 	}
				
	
	public void ajouterArete(Arete a, Sommet s1, Sommet s2){
		if(ListeSommets.contains(s1) && ListeSommets.contains(s2)){
			this.ListeAretes.add(a);
			s1.addArete(a);
			s2.addArete(a);
			a.setSommets(s1, s2);
			a.setGraphe(this);
		}
		else{
			System.out.println("Les sommets " + s1 + s2 + "doivent appartenir au graphe pour y ajouter une arete");
		}
	}
	
	public void supprimerSommet(Sommet s){
		if(ListeSommets.contains(s)){
			ListeSommets.remove(s);
			s.setGraphe(null);
			ArrayList<Arete> listeAr = s.getListeAretes();
			for(int i = 0; i<listeAr.size(); i++){
				supprimerArete(listeAr.get(i));
			}
			s.emptyArete();
		}
	}
	
	public void supprimerArete(Arete a){
		if(ListeAretes.contains(a)){
			ListeAretes.remove(a);
			a.setGraphe(null);
			ArrayList<Sommet> listeSom = a.getListeSommet();
			for(int i = 0; i<listeSom.size(); i++){
				listeSom.get(i).removeArete(a);
			}
			a.setSommets(null, null);
		}
	}
	
	public void afficherGraphe(){
		System.out.println("Graphe : " + this.nomGraphe);
		//Affichage des sommets
		System.out.print("Liste des sommets : " );
		Iterator<Sommet> i = ListeSommets.iterator();
		while (i.hasNext()){
			Sommet somm=i.next();
			System.out.print(" " + somm.getNom());
		}
		System.out.println("");
		//Affichage des aretes
		System.out.print("Listes des aretes : ");
		Iterator<Arete> j = ListeAretes.iterator();
		while (j.hasNext()){
			Arete a=j.next();
			System.out.print(" " + a.getNom() + " " + a.getNomSommetsLies());
		}
		
		System.out.println("\n");
		
	}
}
