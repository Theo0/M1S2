package molecule
import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;

object numG{
  var current = 0
  def inc = {current += 1; current}
}

class Molecule extends Graphe {
  
  override type virtualGraphe = Molecule
  override type virtualSommet = Atome
  override type virtualArete = Liaison
  
  
    nomGraphe = "Molecule" + numG.inc;
  
  
  
  override def afficherGraphe(){
    System.out.println("Molecule : " + this.nomGraphe);
    //Affichage des sommets
    System.out.print("Liste des atomes : " )
    val it = listeSommets.iterator
    while(it.hasNext() ) {
     System.out.print(" " + it.next().getNom)
    }
    System.out.println("");
    //Affichage des aretes
    System.out.print("Listes des liaisons : ");
    val j = listeAretes.iterator();
    while (j.hasNext()){
      
      var ar : virtualArete = j.next()
      
      System.out.print(" " + ar.getNom + " " + ar.getNomSommetsLies);

    }
    
    System.out.println("\n");
    
  }
  
}