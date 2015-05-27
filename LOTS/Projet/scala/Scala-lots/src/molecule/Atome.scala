package molecule
import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;

object numS{
  var current = 0
  def inc = {current += 1; current}
}

class Atome extends Sommet{

  override type virtualGraphe = Molecule
  override type virtualSommet = Atome
  override type virtualArete = Liaison
  
  this.nomSommet = "Atome" + numS.inc
  
}