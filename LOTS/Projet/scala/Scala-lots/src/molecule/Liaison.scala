package molecule
import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;

object numA{
  var current = 0
  def inc = {current += 1; current}
}

class Liaison extends Arete{
  
  override type virtualGraphe = Molecule
  override type virtualSommet = Atome
  override type virtualArete = Liaison
  
  this.nomArete = "Liaison" + numA.inc

}