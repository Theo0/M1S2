import virtuel.Arete;
import virtuel.Graphe;
import virtuel.Sommet;
import molecule.Atome;
import molecule.Molecule;
import molecule.Liaison;
import reseau.Noeud;
import reseau.Lien;
import reseau.Reseau;

object Main {
    
  def main(args: Array[String]) = {
    var mol = new Molecule()
    var l1 = new Liaison()
    var a1 = new Atome()
    var a2 = new Atome()
    
    mol.ajouterSommet(a1)
    mol.ajouterSommet(a2)
    mol.ajouterArete(l1, a1, a2)
    
    var res = new Reseau()
    var li = new Lien()
    var n1 = new Noeud()
    var n2 = new Noeud()
    
    res.ajouterSommet(n1)
    res.ajouterSommet(n2)
    res.ajouterArete(li, n1, n2)
    
    mol.afficherGraphe()
    res.afficherGraphe()
    
  }
  
}