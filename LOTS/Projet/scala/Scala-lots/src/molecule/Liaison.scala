package molecule
import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;

class Liaison extends Arete{
  
  override type virtualGraphe = Molecule
  override type virtualSommet = Atome
  override type virtualArete = Liaison

}