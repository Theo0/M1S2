package graphe;
import java.util.ArrayList;


public class Sommet <G extends Graphe<G,S,A>, S extends Sommet<G,S,A>, A extends Arete<G,S,A>> {
	protected String nomSommet;
	protected G Graphe;
	protected ArrayList<A> aretes;
	public static int num = 0;
	
	public Sommet(){
		num++;
		this.nomSommet = "Sommet" + num;
		this.Graphe = null;
		this.aretes = new ArrayList<A>();
	}
	
	public Sommet(String n){
		this.nomSommet = n;
		this.Graphe = null;
		this.aretes = new ArrayList<A>();
	}
	
	public String getNom(){
		return this.nomSommet;
	}
	
	public void setGraphe(G g){
		this.Graphe = g;
	}
	
	public ArrayList<A> getListeAretes(){
		return this.aretes;
	}
	
	public void addArete(A a){
		if(!aretes.contains(a)){
			aretes.add(a);
		}
		else{
			System.out.println("Erreur : cette arrete est déjà ajoutée" + a);
		}
	}
	
	public void removeArete(A a){
		if(aretes.contains(a)){
			aretes.remove(a);
		}
	}
	
	public void emptyArete(){
		this.aretes = new ArrayList<A>();
	}
}
