package molecule
import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;

class Atome extends Sommet{

  override type virtualGraphe = Molecule
  override type virtualSommet = Atome
  override type virtualArete = Liaison
  
}