package virtuel
import java.util.ArrayList;

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
    //TODO
      }
  }
  
  //TODO Suppression sommets et Arretes
  
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
      
      System.out.print(" " + ar.getNom + " " + ar.getNomSommetsLies);

    }
    
    System.out.println("\n");
    
  }

  
  
}