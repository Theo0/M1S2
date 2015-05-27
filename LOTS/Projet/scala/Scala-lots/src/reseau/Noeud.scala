package reseau
import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;

object numS{
  var current = 0
  def inc = {current += 1; current}
}

class Noeud extends Sommet{

  override type virtualGraphe = Reseau
  override type virtualSommet = Noeud
  override type virtualArete = Lien

  this.nomSommet = "Noeud " +  numS.inc
  
}