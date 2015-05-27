#include "Reseaux.h"
#include "Liens.h"

Reseaux::Reseaux():Graphes(){}

string Reseaux::toString(){
    return "Nom du réseau :  "+Graphes::nom_graphe+", liste des noeuds : "+
    Graphes::listeSommets()+",et des liens : "+Graphes::listeAretes();
}

void Reseaux::ajouterArete(Liens * p_arete, Noeuds * p_s1, Noeuds * p_s2){
    Graphes::ajouterArete(p_arete, p_s1, p_s2);
}

void Reseaux::ajouterSommet(Noeuds * p_somm){
    Graphes::ajouterSommet(p_somm);
}

Reseaux::~Reseaux(){}