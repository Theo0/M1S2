package reseau
import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;

class Lien extends Arete{
  
  override type virtualGraphe = Reseau
  override type virtualSommet = Noeud
  override type virtualArete = Lien

}