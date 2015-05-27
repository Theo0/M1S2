package virtuel
import java.util.ArrayList;
import scala.collection.JavaConversions._

object numG{
  var current = 0
  def inc = {current += 1; current}
}

abstract class Graphe {
  
  type virtualSommet <: Sommet;
  type virtualArete <: Arete;
  type virtualGraphe <:Graphe;
  
  var listeSommets = new  ArrayList[virtualSommet]();
  var listeAretes  = new  ArrayList[virtualArete]();
  var nomGraphe: String = "Graphe" + numG.inc;
  
  def ajouterSommet(sommet: virtualSommet){
    if(listeSommets.contains(sommet)){
      System.err.println("Sommet déjà présent dans le graphe")
    }
    else{
      listeSommets.add(sommet)
    }
  }
  
  def ajouterArete(a: virtualArete, s1: virtualSommet, s2: virtualSommet){
    if(listeAretes.contains(a)){
      System.err.println("Arete déjà présente dans le graphe");
    }
    else{
      listeAretes.add(a)
      s1.addArete(a.asInstanceOf[s1.virtualArete])
      s2.addArete(a.asInstanceOf[s2.virtualArete])
      a.setSommets(s1.asInstanceOf[a.virtualSommet], s2.asInstanceOf[a.virtualSommet])
      a.setGraphe(this.asInstanceOf[a.virtualGraphe])
      }
  }
  
  def supprimerSommet(s : virtualSommet){
    if(listeSommets.contains(s)){
      listeSommets.remove(s);     
      for (ar <- listeAretes) {
        if ((ar.getSommet1 == s) || (ar.getSommet2 == s)) {
          listeAretes.remove(ar)
        }
      }
    }
   
  }
  
  def supprimerArete(a : virtualArete){
    this.listeAretes.remove(a)
      for (som <- listeSommets) {
        if (som.getListeAretes.contains(a)) {
          som.removeArete(a.asInstanceOf[som.virtualArete])
        }
      }   
  }
  
  def afficherGraphe(){
    System.out.println("Graphe : " + this.nomGraphe);
    //Affichage des sommets
    System.out.print("Liste des sommets : " )
    val it = listeSommets.iterator
    while(it.hasNext() ) {
     System.out.print(" " + it.next().getNom)
    }
    System.out.println("");
    //Affichage des aretes
    System.out.print("Listes des aretes : ");
    val j = listeAretes.iterator();
    while (j.hasNext()){
      
      var ar : virtualArete = j.next()
      
      System.out.print(" " + ar.getNom + " (" + ar.getNomSommetsLies + ")");

    }
    
    System.out.println("\n");
    
  }

  
  
}