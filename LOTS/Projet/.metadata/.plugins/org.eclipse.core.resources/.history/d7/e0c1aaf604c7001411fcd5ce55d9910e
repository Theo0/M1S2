package covariance;

import java.util.ArrayList;

public class Graph extends Racine {
	
	protected String nomGraphe;
	protected ArrayList<Sommet> ListeSommets;
	protected ArrayList<Arete> ListeAretes;
	
	public Graph(){
		this.nomGraphe = "GrapheSansNom";
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
 		for (int i = 0; i < ListeSommets.size(); i++) {
			if (s == ListeSommets.get(i)){
				return;
				}
			}
				
		this.ListeSommets.add(s);
		}
	
	public void ajouterArete(Arete a){
		this.ListeAretes.add(a);
	}
	
	
	
	/***** ACCESSEURS ****/
	
}
