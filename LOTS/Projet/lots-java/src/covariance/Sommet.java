package covariance;

import java.util.ArrayList;

public class Sommet extends Racine{
	
	protected String nomSommet;
	protected Graph graphe;
	protected ArrayList<Arete> aretes;
	public static int num = 0;
	
	public Sommet(){
		num++;
		this.nomSommet = "Sommet" + num;
		this.graphe = new Graph();
		this.aretes = new ArrayList<Arete>();
	}
	
	public Sommet(String n){
		this.nomSommet = n;
		this.graphe = new Graph();
		this.aretes = new ArrayList<Arete>();
	}
	
	public String getNom(){
		return this.nomSommet;
	}
	
	public void setGraphe(Graph g){
		this.graphe = g;
	}
	
	public ArrayList<Arete> getListeAretes(){
		return this.aretes;
	}
	
	public void addArete(Arete a){
		if(!aretes.contains(a)){
			aretes.add(a);
		}
		else{
			System.out.println("Erreur : cette arrete est déjà ajoutée" + a);
		}
	}
	
	public void removeArete(Arete a){
		if(aretes.contains(a)){
			aretes.remove(a);
		}
	}
	
	public void emptyArete(){
		this.aretes = new ArrayList<Arete>();
	}
}
