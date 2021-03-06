package covariance;

import java.util.ArrayList;

public class Arete extends Racine{
	protected String nomArete;
	protected Graph graphe;
	protected ArrayList<Sommet> sommets;
	public static int num = 0;
	
	public Arete(){
		num++;
		this.nomArete = "Arete" + num;
		this.graphe = new Graph();
		this.sommets = new ArrayList<Sommet>(2);
	}
	
	public String getNom(){
		return this.nomArete;
	}
	
	public String getNomSommetsLies(){
		return sommets.get(0).getNom() + " " + sommets.get(1).getNom() + " ";
	}
	
	
	public Arete(String n){
		this.nomArete = n;
		this.graphe = new Graph();
		this.sommets = new ArrayList<Sommet>(2);
	}
	
	public void setSommets(Sommet s1, Sommet s2){
		this.sommets.add(s1);
		this.sommets.add(s2);
	}
	
	public ArrayList<Sommet> getListeSommet(){
		return this.sommets;
	}
	
	public void setGraphe(Graph g){
		this.graphe = g;
	}
	
}
