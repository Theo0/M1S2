package reseau
import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;

object numG{
  var current = 0
  def inc = {current += 1; current}
}

class Reseau extends Graphe {
  
  override type virtualGraphe = Reseau
  override type virtualSommet = Noeud
  override type virtualArete = Lien
  
    this.nomGraphe = "Reseau" + numG.inc;
  
  
  override def afficherGraphe(){
    System.out.println("Reseau : " + this.nomGraphe);
    //Affichage des sommets
    System.out.print("Liste des noeuds : " )
    val it = listeSommets.iterator
    while(it.hasNext() ) {
     System.out.print(" " + it.next().getNom)
    }
    System.out.println("");
    //Affichage des aretes
    System.out.print("Listes des liens : ");
    val j = listeAretes.iterator();
    while (j.hasNext()){
      
      var ar : virtualArete = j.next()
      
      System.out.print(" " + ar.getNom + " " + ar.getNomSommetsLies);

    }
    
    System.out.println("\n");
    
  }
  
}