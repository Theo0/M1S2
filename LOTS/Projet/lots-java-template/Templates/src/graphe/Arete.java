package graphe;
import java.util.ArrayList;


public class Arete <G extends Graphe<G,S,A>, S extends Sommet<G,S,A>, A extends Arete<G,S,A>>{

	protected String nomArete;
	protected G Graphe;
	protected ArrayList<S> sommets;
	public static int num = 0;
	
	public Arete(){
		num++;
		this.nomArete = "Arete" + num;
		this.Graphe = null;
		this.sommets = new ArrayList<S>(2);
	}
	
	public String getNom(){
		return this.nomArete;
	}
	
	public String getNomSommetsLies(){
		return sommets.get(0).getNom() + " " + sommets.get(1).getNom() + " ";
	}
	
	
	public Arete(String n){
		this.nomArete = n;
		this.Graphe = null;
		this.sommets = new ArrayList<S>(2);
	}
	
	public void setSommets(S s1, S s2){
		this.sommets.add(s1);
		this.sommets.add(s2);
	}
	
	public ArrayList<S> getListeSommet(){
		return this.sommets;
	}
	
	public void setGraphe(G g){
		this.Graphe = g;
	}
}
