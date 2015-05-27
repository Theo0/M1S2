package virtuel

object numA{
  var current = 0
  def inc = {current += 1; current}
}

abstract class Arete {
  
  type virtualSommet <: Sommet;
  type virtualArete <: Arete;
  type virtualGraphe <:Graphe;
  
  var graphe: virtualGraphe = _;
  var nomArete : String =  "Arete" + numA.inc;
  var sommet1 : virtualSommet =_;
  var sommet2 : virtualSommet = _;
  
  def getNom : String = {
    return this.nomArete
  }
  
  def getSommet1 : virtualSommet = {
    return this.sommet1
  }
  
  def getSommet2 : virtualSommet = {
    return this.sommet2
  }
  
  def setSommets(s1 : virtualSommet, s2 : virtualSommet){
    this.sommet1 = s1;
    this.sommet2 = s2;
  }
  
  def setGraphe(g : virtualGraphe){
    this.graphe = g
  }
  
  def getNomSommetsLies: String = {
    return "(" + sommet1.getNom + " -> " + sommet2.getNom + ") "
  }
  
}